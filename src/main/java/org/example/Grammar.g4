grammar Grammar;
WS : [ \t\r\n]+ -> skip ;
seq : 'seq('arg','arg')';
arg: (fun | seq);
fun:PHRASE'('args*')';

args: (PHRASE | fun | seq) | (',' args);

PHRASE : ([a-zA-Z_] | NEW_DIGIT|'_'|'-')+;
fragment NEW_DIGIT:[0-9];
