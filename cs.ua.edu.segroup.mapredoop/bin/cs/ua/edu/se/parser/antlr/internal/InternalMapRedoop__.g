lexer grammar InternalMapRedoop;
@header {
package cs.ua.edu.se.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '{' ;
T12 : '}' ;
T13 : 'metaelements:' ;
T14 : 'mapreduce:' ;
T15 : 'loop' ;
T16 : 'program' ;
T17 : 'extend' ;
T18 : 'map' ;
T19 : '(' ;
T20 : ',' ;
T21 : ')' ;
T22 : 'reduce' ;
T23 : 'int' ;
T24 : 'float' ;
T25 : 'double' ;
T26 : 'text' ;
T27 : 'long' ;
T28 : 'metaelement' ;
T29 : ';' ;
T30 : 'read' ;
T31 : 'write' ;
T32 : '*' ;
T33 : '[' ;
T34 : ']' ;
T35 : ':' ;
T36 : 'after' ;
T37 : 'call' ;
T38 : 'before' ;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1659
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1661
RULE_INT : ('0'..'9')+;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1663
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1665
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1667
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1669
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g" 1671
RULE_ANY_OTHER : .;


