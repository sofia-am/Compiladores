# Practica y Construccion de Compiladores

### Tarea: RegEx
- Palabras que empiezan con con mayuscula: `[A-Z][a-z]+`
- Palabras final de oracion `[A-Za-z]+\.+` -> en ANTLR se escribe como `[A-Za-z]+'.'+`
- Palabras en plural que comienzan con letra vocal `\b[AEIOUaeiou][a-z]+s\b`
- Horas entre las 13:00 y 15:59  `[1][3-5]\:[0-9]+`
- Horas entre las 03:12 y 11:27  

`'0'[4-9]':'[0-5][0-9]` -> desde las 04:00 hasta las 09:59

`'03:'[2-5][0-9]` -> desde las 03:20 hasta las 03:59

`'03:'('1'[2-9] | [2-5][0-9])` -> ahora separo los rangos de 03:12-03:19
```
'03:'('1'[2-9] | [2-5][0-9]) | ('0'[4-9] | '10' ':'[0-5][0-9]) | ('11:'[01][0-9] | '2'[0-7])
```

los que nos dan problemas son las: 03:12 y las 10- en adelante
```
([0][3]':'[1][2-9])|([0][3]':'[2-5][0-9])|([0][4-9]':'[0-5][0-9])|([1][0]':'[0-5][0-9])|([1][1]':'[0-1][0-9])|([1][1]':'[2][0-7]);
```
## Reglas gramaticales

"No intenten hacer cosas iterativas, eso dejenselo a las reglas lexicas. Lo recursivo le corresponde a las reglas sintácticas"

- reglas puramente **recursivas**: reglas sintacticas
- reglas puramente **iterativas**: reglas lexicas
```
PA: '(';
PB: ')';
PYC: ';';
INT: 'int';
```

identificadores: 

`ID: [A-Za-z_] [A-Za-z0-9_]* ;` puede repetirse 0 o más veces (*)

`programa : instrucciones EOF` -> es al menos una instruccion. será nuestro **simbolo inicial**

`instrucciones : instruccion instrucciones `-> aplicamos recursividad, tomamos una, volvemos a llamar a otra, y así, hasta que no haya nada.
            

`instruccion : declaracion` -> la unica instruccion que tenemos definida por ahora.

`declaracion : INT ID PYC`

capturamos declaraciones de variables de tipo entero.

Debug ANTLR para que muestre el arbol

en vez de declarar variable por variable, podemos declararlo en forma de secuencia

`secvar: ID COMA secvar | ID ;` 

el simbolo inicial posee un token mas porque le agregamos el token EOF

Solo verificamos que la estructura de la informacion esté correcta, que el orden sea correcto. No verificamos que semánticamente sea correcto

Hacer proyecto en github, le hacemos un etiquetado -> nos genera como un release y se hace un zip descargable
con el etiquetado el profe puede seguir 
hacemos todo sobre el mismo repositorio.

