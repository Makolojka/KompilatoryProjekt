grammar g;
methodDeclaration:
modificators? TYPE PHRASE '('argument*')' parenthesis?;
TYPE: (INT | FLOAT | SHORT |STRING | VOID)(' '*)?;

PHRASE: 'a' .. 'z' + | 'A' .. 'Z' + ;

argument:TYPE PHRASE | TYPE PHRASE COMMA +;
modificators : ('public '|'protected '|'private ');
parenthesis: '{'body'}' | '{' '}' | '{ }';
COMMA:' '*','' '*;
body: TYPE PHRASE;
classBody:methodDeclaration EOF;
arrays : TYPE (OBR CBR)?;

OBR: '[';
CBR: ']';
INT:'int';
FLOAT:'float';
SHORT:'short';
STRING:'String';
VOID:'void';


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
