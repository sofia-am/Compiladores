
grammar SyntaxAnalyzer;

@header{
    package compiler.antlr_files;
}
fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9];
fragment INT : 'int';
fragment DOUBLE : 'double';
fragment CHAR : 'char';
fragment VOID : 'void';

WS : [\t\n\r] -> skip;
COMA : ',';
IGUAL : '=';
PYC : ';' ;
UNDERSCORE : '_';
TIPOV : INT | DOUBLE | CHAR;
TIPOF : VOID | TIPOV;

PA: '(';
PC: ')';
NOT: '!';
AND: '&&';
OR: '||';
SUMA: '+';
RESTA: '-';
MULT: '*';
DIV: '/';
MAYQ: '>';
MENQ: '<';
MAYIG: '>=';
MENIG: '<=';

IF: 'if';
WHILE: 'while';
FOR: 'for';
LLAVEA: '{';
LLAVEC: '}';

ID : (LETRA | UNDERSCORE) (LETRA | DIGITO)*;
//asignacion compone todos los tokens que se utilizan al declarar una variable
ASIGNACION : IGUAL ' ' '-'? ' '? (LETRA | (DIGITO+ '.' DIGITO+) | DIGITO+) ;

/*
programa : instrucciones  EOF     
         ; 

instrucciones : instruccion instrucciones
              |  
              ; 

instruccion : declaracion | asignacion
            ;

declaracion : TIPOV secvar PYC ; 

asignacion : secvar PYC;

secvar : comvar  
       | var;      

comvar : ID ASIGNACION? COMA secvar; //cuando se declara una combinacion de variables

var : ID ASIGNACION?;*/

programa : instrucciones  EOF     
         ; 

instrucciones : instruccion instrucciones
              |  
              ; 

instruccion : TIPOV secvar PYC
            | expresion
            | ciclo
            ;

secvar : dec_var  
       | asg_var
       | com_dec_var
       | com_asg_var
       ;  

com_asg_var : asg_var secvar;

asg_var : ID ASIGNACION;

com_dec_var : ID COMA secvar; //cuando se declara una combinacion de variables

dec_var : ID;

expresion: PA expresion PC
       | NOT expresion
       | expresion aritm expresion
       | expresion logica expresion
       | ID
       | DIGITO
       |                                 //hay que considerar el caso de la declaracion de una variable
       ;

aritm: SUMA | RESTA | MULT | DIV;

logica: AND | OR | MAYQ | MENQ | MAYIG | MENIG | IGUAL ;

ciclo:   FOR PA expresion PC LLAVEA instrucciones LLAVEC 
       | WHILE PA expresion PC LLAVEA instrucciones LLAVEC
       | IF PA expresion PC LLAVEA instrucciones LLAVEC
       ;

/*     if(expresion){
              instrucciones
       }
 */