// ------------  Paquete e importaciones ------------
package DataForge_; 

import java_cup.runtime.*;


%%	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%line
%column
%unicode
%ignorecase


%init{ 
    yyline = 1;
    yycolumn =1;
%init} 


// ------> Expresiones Regulares 

entero = [0-9]+
cadena = [\"][^\"\n]*[\"]
identificador = [a-zA-Z][a-zA-Z0-9_]*
decimal = \d+\.\d+

multilinea = [<][!][^!]*[!]+([^>*][^!]*[*]+)*[>]


%%
// ------------  Reglas Lexicas -------------------
"("               {return new Symbol(sym.PARENTESIS_A, yycolumn, yyline, yytext());}
")"               {return new Symbol(sym.PARENTESIS_C, yycolumn, yyline, yytext());}
"["               {return new Symbol(sym.CORCHETE_ABRE, yycolumn, yyline, yytext());}
"]"               {return new Symbol(sym.CORCHETE_CIERRA, yycolumn, yyline, yytext());}
":"               {return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());}
";"               {return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext());}
","               {return new Symbol(sym.COMA, yycolumn, yyline, yytext());}
"-"               {return new Symbol(sym.GUION, yycolumn, yyline, yytext());}
"program"         {return new Symbol(sym.PROGRAM, yycolumn, yyline, yytext());}
"end"             {return new Symbol(sym.END, yycolumn, yyline, yytext());}
"var"             {return new Symbol(sym.VAR, yycolumn, yyline, yytext());}
"double"          {return new Symbol(sym.R_DOUBLE, yycolumn, yyline, yytext());}
"char"            {return new Symbol(sym.R_CHAR, yycolumn, yyline, yytext());}
"arr"             {return new Symbol(sym.ARR, yycolumn, yyline, yytext());}
"@"               {return new Symbol(sym.ARROBA, yycolumn, yyline, yytext());}

//------------------------------------------OPERACIONES----------------------------------------------------------
"sum"             {return new Symbol(sym.SUM, yycolumn, yyline, yytext());}
"res"               {return new Symbol(sym.RES, yycolumn, yyline, yytext());}
"mul"             {return new Symbol(sym.MUL, yycolumn, yyline, yytext());}
"div"             {return new Symbol(sym.DIV, yycolumn, yyline, yytext());}
"mod"             {return new Symbol(sym.MOD, yycolumn, yyline, yytext());}
//------------------------------------------FUNCIONES ESTADISTICAS-----------------------------------------------
"media"           {return new Symbol(sym.MEDIA, yycolumn, yyline, yytext());}
"mediana"         {return new Symbol(sym.MEDIANA, yycolumn, yyline, yytext());}
"moda"            {return new Symbol(sym.MODA, yycolumn, yyline, yytext());}
"varianza"        {return new Symbol(sym.VARIANZA, yycolumn, yyline, yytext());}
"max"             {return new Symbol(sym.MAX, yycolumn, yyline, yytext());}
"min"             {return new Symbol(sym.MIN, yycolumn, yyline, yytext());}

//----------------------------------------------PRINT------------------------------------------------------------
"print"           {return new Symbol(sym.PRINT, yycolumn, yyline, yytext());}
"column"          {return new Symbol(sym.COLUMN, yycolumn, yyline, yytext());}
"console"         {return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext());}
"exec"            {return new Symbol(sym.EXEC, yycolumn, yyline, yytext());}

"titulo"          {return new Symbol(sym.TITULO, yycolumn, yyline, yytext());}
"values"          {return new Symbol(sym.VALUES, yycolumn, yyline, yytext());}
"label"           {return new Symbol(sym.LABEL, yycolumn, yyline, yytext());}
"ejex"            {return new Symbol(sym.EJEX, yycolumn, yyline, yytext());}
"ejey"            {return new Symbol(sym.EJEY, yycolumn, yyline, yytext());}

"titulox"         {return new Symbol(sym.TITULOX, yycolumn, yyline, yytext());}
"tituloy"         {return new Symbol(sym.TITULOY, yycolumn, yyline, yytext());}



//-------------------------------------------TIPOS-DE-GRAFICA----------------------------------------------------
//GRAFICAPIE-GRAFICABARRAS-GRAPHFICALINE
//----------------------------GRAPHPIE----------------------------------
"graphpie"        {return new Symbol(sym.GRAPHPIE, yycolumn, yyline, yytext());}
//titulo-values-label-exec
//---------------------------GRAPHBAR-------------------------------------
"graphbar"        {return new Symbol(sym.GRAPHBAR, yycolumn, yyline, yytext());}
//titulo-ejex-eyey-titulox-tituloy-exec
//---------------------------GRAPHLINE---------------------------------------
"graphline"       {return new Symbol(sym.GRAPHLINE, yycolumn, yyline, yytext());}
//titulo-ejex-eyey-titulox-tituloy-exec
//----------------------------HISTOGRAMA-------------------------------------
"histogram"       {return new Symbol(sym.HISTOGRAM, yycolumn, yyline, yytext());}
//titulo-values

//---------------------------------------------------------------------------------------------------------------
"*"         {return new Symbol(sym.POR, yycolumn, yyline, yytext());}
"+"         {return new Symbol(sym.MAS, yycolumn, yyline, yytext());}
"-"         {return new Symbol(sym.MENOS, yycolumn, yyline, yytext());}

"<"         {return new Symbol(sym.MENORQUE, yycolumn, yyline, yytext());}
">"         {return new Symbol(sym.MAYORQUE, yycolumn, yyline, yytext());}
"mostrar"   {return new Symbol(sym.R_MOSTRAR, yycolumn, yyline, yytext());}

{entero}            { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{cadena}            { return new Symbol(sym.CADENA, yycolumn, yyline, yytext()); }
{decimal}           { return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext()); }
{identificador}     { return new Symbol(sym.IDENTIFICADOR, yycolumn, yyline, yytext()); }

{multilinea}          {}

//------> Ignorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}
//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }
