grammar PNBsolver;
options {
    backtrack=true;
    memoize=true;
    k=3;
}
@header {
package grmr;
}   
@lexer::header {package grmr;}

content returns [ Content cont] 
    :  l_decls=kernels  vrs=execute '.' EOF 
    {$cont= new Content($l_decls.listofkernels,$vrs.execution);}
    ;

kernels returns [ List<Kernel> listofkernels]
@init
    {
    	$listofkernels = new ArrayList<Kernel>();
    }
    : ('kernel'  nf=IDENTIFIER 'in' id2=IDENTIFIER decls=declarations stmts=readstmts stmt=expressionstmt wstmts=writestmts 'endkernel'
    {listofkernels.add(new Kernel($nf.text,$stmts.stmts,stmt,$decls.stmts));})+
    ;

declarations returns [ List<Statement> stmts]
@init
    {
    	$stmts = new ArrayList<Statement>();
    }
    : (op=vectorscalarnumber vars=variables {Statement stmt= new Statement($op.vec_sca_num,$vars.variables);stmts.add(stmt);})+
    ;
            
expressionstmt returns [ Statement stmt]
    : id1=IDENTIFIER '=' (expr1=expression)? 'SUM' expr2=expression {stmt= new Statement($id1.text,$expr1.value,$expr2.value);}
    ;

expression returns [Expression value]
@init
    {
         List<Expression> exprlist = new ArrayList<Expression>();
         List<String> opslist = new ArrayList<String>();         
    }
    :   e1=multidiv 
        (   '+' e2=multidiv {exprlist.add($e2.value);opslist.add("+");}
        |   '-' e2=multidiv {exprlist.add($e2.value);opslist.add("-");}
        )* {if(exprlist.size()<1)$value=$e1.value; else $value = new Expression($e1.value,exprlist,opslist); }
    ;

multidiv returns [Expression value]
@init
    {
         List<Expression> exprlist = new ArrayList<Expression>();
         List<String> opslist = new ArrayList<String>();         
    }
    :   e1=atom 
    ('*' e2=atom {exprlist.add($e2.value);opslist.add("*");}
    |'/' e2=atom {exprlist.add($e2.value);opslist.add("/");})* {if(exprlist.size()<1)$value=$e1.value; else $value = new Expression($e1.value,exprlist,opslist); }
    ; 

atom returns [Expression value]
    :   id=IDENTIFIER{value=new Expression($id.text);}
    |   '(' expr=expression ')' {$value = $expr.value;}
    |   'exp' expr=expression {$value= new Expression(expr,"exp");}
    |    'pow' '('expr=expression ',' num=NUMBER ')' {int n= Integer.parseInt($num.text);$value=new Expression(expr,n);}
    ;
           
readstmts returns [ List<Statement> stmts] 
@init
    {
    	$stmts = new ArrayList<Statement>();
    }
    : ('read' id1=STRING ',' id2=STRING {Statement stmt= new Statement($id1.text,$id2.text,0);stmts.add(stmt);})*
    ;
    
writestmts returns [ List<Statement> stmts] 
@init
    {
    	$stmts = new ArrayList<Statement>();
    }
    : ('write' id1=STRING ',' id2=STRING {Statement stmt= new Statement($id1.text,$id2.text,1);stmts.add(stmt);})*
    ;
    
execute returns [ Execution execution]
    : 'generate' p_t1=platform ('[' parameters ']')? md=mode id=IDENTIFIER
    {$execution=new Execution($id.text,$p_t1.platName,$md.md);}
    ;

variables returns [ List<String> variables]
@init
    {
    	$variables = new ArrayList<String>();
    }
	: id1=IDENTIFIER {$variables.add($id1.text);} (initialization)? (',' id2=IDENTIFIER {$variables.add($id2.text);}(initialization)?)*
	;	


initialization
	: '=' NUMBER ('.' NUMBER)?
	;

platform returns [ int platName ]
	: 'CUDA'{$platName=0;}|'OMP' {$platName=1;}|'MPI'{$platName=2;}|'OCL'{$platName=3;}
	;

parameters 
    : IDENTIFIER '=' parameter  (',' IDENTIFIER '=' parameter)*
    ;
    
parameter
	:IDENTIFIER
	|NUMBER ('.' NUMBER)?
	;

mode returns [ int md ]
	: 'ACCURATE'{$md=0;}|'AVERAGE'{$md=1;}|'FAST'{$md=2;}
	; 

	
vectorscalarnumber returns [ int vec_sca_num ]
	: 'vector'{$vec_sca_num=0;}|'scalar'{$vec_sca_num=1;}|'constant'{$vec_sca_num=2;}
	;  

NUMBER
	: '0'..'9'+
	;
    
IDENTIFIER
	:	LETTER (LETTER|'0'..'9')*
	;
	 
INTO
	: '<-'
	;	
STRING          
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"' 
    ;
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;
    
fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;
    
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
    
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
LETTER
	:	'$'
	|	'A'..'Z'
	|	'a'..'z'
	|	'_'
	;

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

// ignore #line info for now
LINE_COMMAND 
    : '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
	