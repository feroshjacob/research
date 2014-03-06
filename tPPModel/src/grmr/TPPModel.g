grammar TPPModel;
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
    :  l_decls=declarations mps=mappings vrs=execute '.' EOF 
    {$cont= new Content($l_decls.listofdecls,$mps.maps,$vrs.execution);}
    ;

declarations returns [ List<Declaration> listofdecls]
@init
    {
    	$listofdecls = new ArrayList<Declaration>();
    }
    : ('declare'  nf=nameandfile '{' 'in' in=variables 'out' out=variables'}'
    {listofdecls.add(new Declaration($nf.namefile,$in.variables,$out.variables));})+
    ;
    
mappings returns [ Map<String, List<NameTypeAndFile>> maps]
@init
    {
    	$maps = new HashMap<String, List<NameTypeAndFile>>();
    }
    : ('map' id1=IDENTIFIER INTO  lfs=listofnameTfile 
    {maps.put($id1.text,$lfs.namefiles);})+
    ;
    
execute returns [ Execution execution]
    : 'execute'id=IDENTIFIER vars=variables
    {$execution=new Execution($id.text,$vars.variables);}
    ;

listofnameTfile returns [ List<NameTypeAndFile> namefiles]
@init
    {
    	$namefiles = new ArrayList<NameTypeAndFile>();
    }
	:p_t1=platform nf1=nameandfile 
	{$namefiles.add(new NameTypeAndFile($p_t1.platName, $nf1.namefile));}
	(',' p_t2=platform nf2=nameandfile{$namefiles.add(new NameTypeAndFile($p_t2.platName, $nf2.namefile));})*
	;

variables returns [ List<String> variables]
@init
    {
    	$variables = new ArrayList<String>();
    }
	: id1=IDENTIFIER {$variables.add($id1.text);}  (',' id2=IDENTIFIER {$variables.add($id2.text);})*
	;	
  
 
nameandfile returns [NameAndFile namefile]
	: id=IDENTIFIER f1=file {$namefile=new NameAndFile($id.text,$f1.fileName);}
	;    

file returns [ String fileName]
	: '[' id1=IDENTIFIER '.' id2=IDENTIFIER']' {$fileName=$id1.text +"."+ $id2.text;}
	;
	
platform returns [ String platName ]
	: 'CUDA'{$platName="CUDA";}|'OMP'{$platName="OMP";}|'MPI'{$platName="MPI";}|'OCL'{$platName="OCL";}
	; 
    
IDENTIFIER
	:	LETTER (LETTER|'0'..'9')*
	;
	 
INTO
	: '<-'
	;	

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
	