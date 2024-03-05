| Token                 | Descripción                  |  Lexema |
|-----------------------|------------------------------|---------|
| PARENTESIS_A          | Cáracter                     | (       | 
| PARENTESIS_C          | Cáracter                     | )       |
| IGUAL                 | Operador                     | =       |
| CORCHETE_ABRE         | Cáracter                     | [       |
| CORCHETE_CIERRA       | Cáracter                     | ]       |
| DOSPUNTOS             | Cáracter                     | :       |
| PUNTOYCOMA            | Cáracter                     | ;       |
| COMA                  | Cáracter                     | ,       |
| GUION                 | Cáracter                     | -       |
| PROGRAM               | Palabra Reservada            | program |
| END                   | Palabra Reservada            | end     |
| VAR                   | Palabra Reservada            | var     |
| R_DOUBLE              | Palabra Reservada            | double  |
| ARR                   | Palabra Reservada            | arr     |
| ARROBA                | Cáracter                     | @       |
| SUM                   | Operador                     | sum     |
| RES                   | Operador                     | res     |
| DIV                   | Operador                     | div     |
| MOD                   | Operador                     | mod     |
| MEDIA                 | Palabra Reservada            | media   |
| MEDIANA               | Palabra Reservada            | mediana |
| MODA                  | Palabra Reservada            | moda    |
| VARIANZA              | Palabra Reservada            | varianza|
| MAX                   | Palabra Reservada            | max     |
| MIN                   | Palabra Reservada            | min     |    
| PRINT                 | Palabra Reservada            | print   |
| COLUMN                | Palabra Reservada            | column  | 
| CONSOLE               | Palabra Reservada            | console |
| EXEC                  | Palabra Reservada            | exec    | 
| TITULO                | Palabra Reservada            | titulo  |
| VALUES                | Palabra Reservada            | values  | 
| LABEL                 | Palabra Reservada            | label   |
| EJEX                  | Palabra Reservada            | ejex    | 
| EJEY                  | Palabra Reservada            | ejey    |
| TITULOX               | Palabra Reservada            | titulox | 
| TITULOY               | Palabra Reservada            | tituloy | 
| GRAPHPIE              | Palabra Reservada            | graphpie| 
| GRAPHBAR              | Palabra Reservada            | graphbar|
| GRAPHLINE             | Palabra Reservada            |graphline| 
| HISTOGRAM             | Palabra Reservada            |histogram|
| POR                   | Operador                     |  *      | 
| MAS                   | Operador                     |+        |
| MENOS                 | Operador                     |  -      | 
| MENORQUE              | Cáracter                     |<        |
| MAYORQUE              | Cáracter                     |>        |
| R_MOSTRAR             | Cáracter                     |mostrar  |


| Token                 | Expresión Regular                   | Ejemplo |
|-----------------------|-------------------------------------|----------------------------------|
| entero                | [0-9]+                              | 9       | 
| cadena                | [\"][^\"\n]*[\"]                    |"cadena" |
| identificador         | [a-zA-Z][a-zA-Z0-9_]*               | id      | 
| decimal               | \d+\.\d+                            | 9.0     |
|comentariosimple       | \![^\n]*                            |! Simple| 
| multilinea            | [<][!][^!]*[!]+([^>*][^!]*[*]+)*[>] | <! Esto es un comentario
Multilínea !>      |