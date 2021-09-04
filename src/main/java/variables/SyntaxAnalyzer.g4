grammar SyntaxAnalyzer;

@header{
    package variables;
}

//reglas lexicas

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9];
fragment INT : 'int';
fragment DOUBLE : 'double';
fragment CHAR : 'char';

WS : [ \t\n\r] -> skip;
COMA : ',';
IGUAL : '=';
PYC : ';' ;
UNDERSCORE : '_';
TIPO : INT | DOUBLE | CHAR;
ID : (LETRA | UNDERSCORE) (LETRA | DIGITO)*;
//asignacion compone todos los tokens que se utilizan al declarar una variable
ASIGNACION : IGUAL ' ' (LETRA | (DIGITO+ '.' DIGITO+) | DIGITO+) ;

// ayuda profe :'(

programa : instrucciones 
         | EOF     
         ; 
instrucciones : instruccion programa; //parece completar bien el arbol, pero cuando lo ejecutamos con java nos tira errores.
instruccion : declaracion ;
declaracion : TIPO secvar PYC ; 
secvar : comvar  
       | var;      
comvar : ID ASIGNACION? COMA secvar; //cuando se declara una combinacion de variable
var : ID ASIGNACION?;
