grammar g;

classDeclaration: MODIFICATORS? 'class' PHRASE '{' classBody* '}';

//classBody: methodDeclaration+ | variable+;
classBody: (methodDeclaration | variable)+;
variable: MODIFICATORS? TYPE PHRASE';' | MODIFICATORS? TYPE PHRASE '=' '"'*  PHRASE+ '"'* ';';

methodDeclaration: MODIFICATORS? argument '('argument*')' parenthesis*;

MODIFICATORS : PUBLIC | PROTECTED | PRIVATE;
TYPE: INT| FLOAT | SHORT | STRING | VOID ;

fragment NEW_DIGIT: [0-9];

PHRASE: 'a' .. 'z' + | 'A' .. 'Z' + | NEW_DIGIT + | '_' + | '-' +;
argument:TYPE PHRASE | TYPE PHRASE','argument;
parenthesis: '{'body'}' | '{' '}' | '{ }';

WS : [ \t\r\n]+ -> skip ;
body: variable+;
PUBLIC:'public';
PROTECTED:'protected';
PRIVATE:'private';
OBR: '[';
CBR: ']';
INT:'int';
FLOAT:'float';
SHORT:'short';
STRING:'String';
VOID:'void';
arrays : ('int' | 'float' | 'short' | 'String' | 'void')(OBR CBR)?;
