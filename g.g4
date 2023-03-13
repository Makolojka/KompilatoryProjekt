grammar g;
WS : [ \t\r\n]+ -> skip ;
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

//expr
// : NAME
//// | expr AND expra
//// | expr OR expr
// ;

//OR   : 'OR' | '|';
//AND  : 'AND' | '&';

//STRING_LITERAL:     '"' (~["\\r\n] | EscapeSequence)* '"';
//void sdhasdhjasadas(int asdsad)
//fragment EscapeSequence
//    : '\' 'u005c'? [btnfr"'\]
//    | '\' 'u005c'? ([0-3]? [0-7])? [0-7]
//    | '\' 'u'+ HexDigit HexDigit HexDigit HexDigit
//    ;
//fragment HexDigit
//    : [0-9a-fA-F]
//    ;

//void nazwa(int a){
//
//}
//prule: 'hello ' CHAR;
//CHAR: 'a'..'z' | ' ';


//methodDeclaration
//    : typeTypeOrVoid identifier formalParameters ('[' ']')*
//      (THROWS qualifiedNameList)?
//      methodBody
//    ;
