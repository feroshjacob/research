lexer grammar InternalMDP;
@header {
package cs.ua.edu.segroup.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'mapper' ;
T13 : 'reducer' ;

// $ANTLR src "../cs.ua.edu.segroup.mdp.ui/src-gen/cs/ua/edu/segroup/ui/contentassist/antlr/internal/InternalMDP.g" 442
RULE_CODE : '{' ( options {greedy=false;} : . )*'}';

// $ANTLR src "../cs.ua.edu.segroup.mdp.ui/src-gen/cs/ua/edu/segroup/ui/contentassist/antlr/internal/InternalMDP.g" 444
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../cs.ua.edu.segroup.mdp.ui/src-gen/cs/ua/edu/segroup/ui/contentassist/antlr/internal/InternalMDP.g" 446
RULE_INT : ('0'..'9')+;

// $ANTLR src "../cs.ua.edu.segroup.mdp.ui/src-gen/cs/ua/edu/segroup/ui/contentassist/antlr/internal/InternalMDP.g" 448
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../cs.ua.edu.segroup.mdp.ui/src-gen/cs/ua/edu/segroup/ui/contentassist/antlr/internal/InternalMDP.g" 450
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../cs.ua.edu.segroup.mdp.ui/src-gen/cs/ua/edu/segroup/ui/contentassist/antlr/internal/InternalMDP.g" 452
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../cs.ua.edu.segroup.mdp.ui/src-gen/cs/ua/edu/segroup/ui/contentassist/antlr/internal/InternalMDP.g" 454
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../cs.ua.edu.segroup.mdp.ui/src-gen/cs/ua/edu/segroup/ui/contentassist/antlr/internal/InternalMDP.g" 456
RULE_ANY_OTHER : .;


