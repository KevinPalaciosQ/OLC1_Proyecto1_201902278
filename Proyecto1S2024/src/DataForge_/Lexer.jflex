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
comentariosimple = \![^\n]*
multilinea = [<][!][^!]*[!]+([^>*][^!]*[*]+)*[>]


%%
// ------------  Reglas Lexicas -------------------

"("               {funciones.reportes.TablaTokensDF(yytext(), "PARENTESIS_A", yyline, yycolumn); return new Symbol(sym.PARENTESIS_A, yycolumn, yyline, yytext()); }
"="               {funciones.reportes.TablaTokensDF(yytext(), "IGUAL", yyline, yycolumn); return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());}
")"               {funciones.reportes.TablaTokensDF(yytext(), "PARENTESIS_C", yyline, yycolumn); return new Symbol(sym.PARENTESIS_C, yycolumn, yyline, yytext());}
"["               {funciones.reportes.TablaTokensDF(yytext(), "CORCHETE_ABRE", yyline, yycolumn); return new Symbol(sym.CORCHETE_ABRE, yycolumn, yyline, yytext());}
"]"               {funciones.reportes.TablaTokensDF(yytext(), "CORCHETE_CIERRA", yyline, yycolumn); return new Symbol(sym.CORCHETE_CIERRA, yycolumn, yyline, yytext());}
":"               {funciones.reportes.TablaTokensDF(yytext(), "DOSPUNTOS", yyline, yycolumn); return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());}
";"               {funciones.reportes.TablaTokensDF(yytext(), "PUNTOYCOMA", yyline, yycolumn); return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext());}
","               {funciones.reportes.TablaTokensDF(yytext(), "COMA", yyline, yycolumn); return new Symbol(sym.COMA, yycolumn, yyline, yytext());}
"-"               {funciones.reportes.TablaTokensDF(yytext(), "GUION", yyline, yycolumn); return new Symbol(sym.GUION, yycolumn, yyline, yytext());}
"program"         {funciones.reportes.TablaTokensDF(yytext(), "PROGRAM", yyline, yycolumn); return new Symbol(sym.PROGRAM, yycolumn, yyline, yytext());}
"end"             {funciones.reportes.TablaTokensDF(yytext(), "END", yyline, yycolumn); return new Symbol(sym.END, yycolumn, yyline, yytext());}
"var"             {funciones.reportes.TablaTokensDF(yytext(), "VAR", yyline, yycolumn); return new Symbol(sym.VAR, yycolumn, yyline, yytext());}
"double"          {funciones.reportes.TablaTokensDF(yytext(), "R_DOUBLE", yyline, yycolumn); return new Symbol(sym.R_DOUBLE, yycolumn, yyline, yytext());}
"char"            {funciones.reportes.TablaTokensDF(yytext(), "R_CHAR", yyline, yycolumn); return new Symbol(sym.R_CHAR, yycolumn, yyline, yytext());}
"arr"             {funciones.reportes.TablaTokensDF(yytext(), "ARR", yyline, yycolumn); return new Symbol(sym.ARR, yycolumn, yyline, yytext());}
"@"               {funciones.reportes.TablaTokensDF(yytext(), "ARROBA", yyline, yycolumn);  return new Symbol(sym.ARROBA, yycolumn, yyline, yytext());}
//------------------------------------------OPERACIONES----------------------------------------------------------
"sum"             {funciones.reportes.TablaTokensDF(yytext(), "SUM", yyline, yycolumn); return new Symbol(sym.SUM, yycolumn, yyline, yytext());}
"res"             {funciones.reportes.TablaTokensDF(yytext(), "RES", yyline, yycolumn); return new Symbol(sym.RES, yycolumn, yyline, yytext());}
"mul"             {funciones.reportes.TablaTokensDF(yytext(), "MUL", yyline, yycolumn); return new Symbol(sym.MUL, yycolumn, yyline, yytext());}
"div"             {funciones.reportes.TablaTokensDF(yytext(), "DIV", yyline, yycolumn); return new Symbol(sym.DIV, yycolumn, yyline, yytext());}
"mod"             {funciones.reportes.TablaTokensDF(yytext(), "MOD", yyline, yycolumn); return new Symbol(sym.MOD, yycolumn, yyline, yytext());}
//------------------------------------------FUNCIONES ESTADISTICAS-----------------------------------------------
"media"           {funciones.reportes.TablaTokensDF(yytext(), "MEDIA", yyline, yycolumn); return new Symbol(sym.MEDIA, yycolumn, yyline, yytext());}
"mediana"         {funciones.reportes.TablaTokensDF(yytext(), "MEDIANA", yyline, yycolumn); return new Symbol(sym.MEDIANA, yycolumn, yyline, yytext());}
"moda"            {funciones.reportes.TablaTokensDF(yytext(), "MODA", yyline, yycolumn); return new Symbol(sym.MODA, yycolumn, yyline, yytext());}
"varianza"        {funciones.reportes.TablaTokensDF(yytext(), "VARIANZA", yyline, yycolumn); return new Symbol(sym.VARIANZA, yycolumn, yyline, yytext());}
"max"             {funciones.reportes.TablaTokensDF(yytext(), "MAX", yyline, yycolumn); return new Symbol(sym.MAX, yycolumn, yyline, yytext());}
"min"             {funciones.reportes.TablaTokensDF(yytext(), "MIN", yyline, yycolumn);  return new Symbol(sym.MIN, yycolumn, yyline, yytext());}

//----------------------------------------------PRINT------------------------------------------------------------
"print"           {funciones.reportes.TablaTokensDF(yytext(), "PRINT", yyline, yycolumn); return new Symbol(sym.PRINT, yycolumn, yyline, yytext());}
"column"          {funciones.reportes.TablaTokensDF(yytext(), "COLUMN", yyline, yycolumn); return new Symbol(sym.COLUMN, yycolumn, yyline, yytext());}
"console"         {funciones.reportes.TablaTokensDF(yytext(), "CONSOLE", yyline, yycolumn); return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext());}
"exec"            {funciones.reportes.TablaTokensDF(yytext(), "EXEC", yyline, yycolumn); return new Symbol(sym.EXEC, yycolumn, yyline, yytext());}

"titulo"          {funciones.reportes.TablaTokensDF(yytext(), "TITULO", yyline, yycolumn); return new Symbol(sym.TITULO, yycolumn, yyline, yytext());}
"values"          {funciones.reportes.TablaTokensDF(yytext(), "VALUES", yyline, yycolumn); return new Symbol(sym.VALUES, yycolumn, yyline, yytext());}
"label"           {funciones.reportes.TablaTokensDF(yytext(), "LABEL", yyline, yycolumn); return new Symbol(sym.LABEL, yycolumn, yyline, yytext());}
"ejex"            {funciones.reportes.TablaTokensDF(yytext(), "EJEX", yyline, yycolumn); return new Symbol(sym.EJEX, yycolumn, yyline, yytext());}
"ejey"            {funciones.reportes.TablaTokensDF(yytext(), "EJEY", yyline, yycolumn); return new Symbol(sym.EJEY, yycolumn, yyline, yytext());}

"titulox"         {funciones.reportes.TablaTokensDF(yytext(), "TITULOX", yyline, yycolumn); return new Symbol(sym.TITULOX, yycolumn, yyline, yytext());}
"tituloy"         {funciones.reportes.TablaTokensDF(yytext(), "TITULOY", yyline, yycolumn); return new Symbol(sym.TITULOY, yycolumn, yyline, yytext());}



//-------------------------------------------TIPOS-DE-GRAFICA----------------------------------------------------
//GRAFICAPIE-GRAFICABARRAS-GRAPHFICALINE
//----------------------------GRAPHPIE----------------------------------
"grappie"        {funciones.reportes.TablaTokensDF(yytext(), "GRAPPIE", yyline, yycolumn); return new Symbol(sym.GRAPPIE, yycolumn, yyline, yytext());}
"graphpie"       {funciones.reportes.TablaTokensDF(yytext(), "GRAPHPIE", yyline, yycolumn); return new Symbol(sym.GRAPHPIE, yycolumn, yyline, yytext());}
//titulo-values-label-exec
//---------------------------GRAPHBAR-------------------------------------
"graphbar"       {funciones.reportes.TablaTokensDF(yytext(), "GRAPHBAR", yyline, yycolumn); return new Symbol(sym.GRAPHBAR, yycolumn, yyline, yytext());}
"grapbar"        {funciones.reportes.TablaTokensDF(yytext(), "GRAPBAR", yyline, yycolumn); return new Symbol(sym.GRAPBAR, yycolumn, yyline, yytext());}
//titulo-ejex-eyey-titulox-tituloy-exec
//---------------------------GRAPHLINE---------------------------------------
"graphline"      {funciones.reportes.TablaTokensDF(yytext(), "GRAPHLINE", yyline, yycolumn); return new Symbol(sym.GRAPHLINE, yycolumn, yyline, yytext());}
"grapline"       {funciones.reportes.TablaTokensDF(yytext(), "GRAPLINE", yyline, yycolumn); return new Symbol(sym.GRAPLINE, yycolumn, yyline, yytext());}
//titulo-ejex-eyey-titulox-tituloy-exec
//----------------------------HISTOGRAMA-------------------------------------
"histogram"       {funciones.reportes.TablaTokensDF(yytext(), "HISTOGRAM", yyline, yycolumn); return new Symbol(sym.HISTOGRAM, yycolumn, yyline, yytext());}
//titulo-values

//---------------------------------------------------------------------------------------------------------------
"*"         {funciones.reportes.TablaTokensDF(yytext(), "POR", yyline, yycolumn); return new Symbol(sym.POR, yycolumn, yyline, yytext());}
"+"         {funciones.reportes.TablaTokensDF(yytext(), "MAS", yyline, yycolumn); return new Symbol(sym.MAS, yycolumn, yyline, yytext());}
"-"         {funciones.reportes.TablaTokensDF(yytext(), "MENOS", yyline, yycolumn); return new Symbol(sym.MENOS, yycolumn, yyline, yytext());}

"<"         {funciones.reportes.TablaTokensDF(yytext(), "MENORQUE", yyline, yycolumn); return new Symbol(sym.MENORQUE, yycolumn, yyline, yytext());}
">"         {funciones.reportes.TablaTokensDF(yytext(), "MAYORQUE", yyline, yycolumn); return new Symbol(sym.MAYORQUE, yycolumn, yyline, yytext());}
"mostrar"   {funciones.reportes.TablaTokensDF(yytext(), "R_MOSTRAR", yyline, yycolumn); return new Symbol(sym.R_MOSTRAR, yycolumn, yyline, yytext());}

{entero}            {funciones.reportes.TablaTokensDF(yytext(), "ENTERO", yyline, yycolumn); return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{cadena}            {funciones.reportes.TablaTokensDF(yytext(), "CADENA", yyline, yycolumn); return new Symbol(sym.CADENA, yycolumn, yyline, yytext()); }
{decimal}           {funciones.reportes.TablaTokensDF(yytext(), "DECIMAL", yyline, yycolumn); return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext()); }
{identificador}     {funciones.reportes.TablaTokensDF(yytext(), "IDENTIFICADOR", yyline, yycolumn); return new Symbol(sym.IDENTIFICADOR, yycolumn, yyline, yytext()); }
{comentariosimple}          {}
{multilinea}          {}

//------> Ignorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}
//------> Errores Léxicos 
.           	{
                funciones.reportes.TablaErroresDF(yytext(), "Error Léxico", yyline, yycolumn);
                 System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }
