grammar Grammar;
WS : [ \t\r\n]+ -> skip ;
seq : 'seq('seq2','seq2')';
seq2: fun | seq;
fun:PHRASE'('args*')';

args:PHRASE| ',' args;

PHRASE : ([a-zA-Z_] | NEW_DIGIT|'_'|'-')+;
fragment NEW_DIGIT:[0-9];
