lexer grammar InternalMapRedoop;
@header {
package cs.ua.edu.se.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'after' ;
T12 : 'call' ;
T13 : 'before' ;
T14 : '{' ;
T15 : '}' ;
T16 : 'metaelements:' ;
T17 : 'mapreduce:' ;
T18 : 'program' ;
T19 : 'extend' ;
T20 : 'map' ;
T21 : '(' ;
T22 : ',' ;
T23 : ')' ;
T24 : 'reduce' ;
T25 : 'metaelement' ;
T26 : ';' ;
T27 : 'read' ;
T28 : 'write' ;
T29 : ']' ;
T30 : ':' ;
T31 : 'loop' ;
T32 : 'int' ;
T33 : 'float' ;
T34 : 'double' ;
T35 : 'text' ;
T36 : 'long' ;
T37 : '*' ;
T38 : '[' ;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 3847
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 3849
RULE_INT : ('0'..'9')+;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 3851
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 3853
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 3855
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 3857
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g" 3859
RULE_ANY_OTHER : .;


