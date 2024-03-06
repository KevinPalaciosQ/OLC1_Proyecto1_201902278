# Manual  Técnico 🖥️
# Organización de Lenguajes y Compiladores 1
# Kevin Estuardo Palacios Quiñonez 
---
# Indice 
1. Introducción 
2. Requerimientos 
3. Opciones del Sistema 
4. Manejo del Sistema 
5. Recomendaciones 
---
# 1. Introducción 🤖
---
# 2. Objetivos ✨

---
# 3. Dirigido 🤩
### Este manual esta orientado a todos los distintos programadores interesados en el campo de las ciencias de la computación y el funcionamiento de los compiladores así mismo de conocer como funciona el análisis léxico y sintáctico en la lectura de nuevos lenguajes.
---
# 4. Especificación Técnica 😎
### 4.1 Requisitos de Hardware:
* Computadora de Escritorio o Portatil.
* Mínimo 4 Gigas de Memoria RAM.
* 20 GB disponibles de Disco Duro.
* Procesador Core i3 o Superior.
* Procesador a 64 bits.
* Pantalla con Resolución Gráfica de 1024*768 píxeles.
### 4.2 Requisitos de Software:
* Tener Instalado Windows 10 o Superior.
* Java Runtime Enviroment(JRE)versión 8.2 o Superior.
* Java Development Kit (JDK) versión 20.0 o Superior.
* Netbeans IDE 20.0 o Superior.
* Navegador Web
* Librería Java Cup
* Librería Java Flex
* Librería RsyntaxArea
* Librería jfreechart
* Librería Jcommon
* Librería commons-math
---
# 5. Lógica del Programa 👀
### Lenguaje DataForge
Para conocer como esta constituido el lenguaje Dataforge, puede visualizar la parte de Análisis Léxico para poder entender la sintaxis del Lenguaje.
### Análisis Léxico
La siguiente tabla mostrará los siguientes tokens generados en el analizador léxico.
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

La siguiente tabla mostrará las expresiones regulares utilizadas para obtener más tokens aceptados en el lenguaje Dataforge.

| Token                 | Expresión Regular                   | Ejemplo |
|-----------------------|-------------------------------------|----------------------------------|
| entero                | [0-9]+                              | 9       | 
| cadena                | [\"][^\"\n]*[\"]                    |"cadena" |
| identificador         | [a-zA-Z][a-zA-Z0-9_]*               | id      | 
| decimal               | \d+\.\d+                            | 9.0     |
|comentariosimple       | \![^\n]*                            |! Simple| 
| multilinea            | [<][!][^!]*[!]+([^>*][^!]*[*]+)*[>] | <! Esto es un comentario
Multilínea !>      |

### Generadores/Analizadores Jflex/Cup
Este método se encarga de generar 2 analizadores mediante las librerías de flex y cup, tambien los analizadores se encargan de verificar que la sintaxis de los archivos enviados sea correcta, en caso contrario genera errores.
---
# 6. Créditos
Elaborado por el estudiante Kevin Estuardo Palacios para el curso de Organización de Lenguajes y Compiladores 1, en el país de Guatemala, entregado el día Domingo 10 de Marzo de 2024.

[Enlace a mi repositorio en GitHub](https://github.com/KevinPalaciosQ/OLC1_Proyecto1_201902278.git)