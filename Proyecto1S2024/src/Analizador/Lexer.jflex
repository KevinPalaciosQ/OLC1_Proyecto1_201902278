// ------------  Paquete e importaciones ------------
package Analizador; 

import java_cup.runtime.*;

%%	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%column
%line
%unicode
%ignorecase

%{ 
%} 

// ------> Expresiones Regulares 

entero = [0-9]+
cadena = [\"][^\"\n]*[\"]
decimal = \d+\.\d+
%%
// ------------  Reglas Lexicas -------------------
"VAR"        {return new Symbol(sym.VAR, yycolumn, yyline, yytext()); }
":"          {return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext()); }
";"          {return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext()); }
"<"          {return new Symbol(sym.MENORQUE, yycolumn, yyline, yytext()); }
"-"          {return new Symbol(sym.GUION, yycolumn, yyline, yytext()); }
"end"        {return new Symbol(sym.RESERVADA_END, yycolumn, yyline, yytext()); }
"double"     {return new Symbol(sym.R_DOUBLE, yycolumn, yyline, yytext()); }
"char"       {return new Symbol(sym.R_CHAR, yycolumn, yyline, yytext()); }

{entero}            {return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{cadena}            { return new Symbol(sym.CADENA, yycolumn, yyline, yytext()); }
{decimal}           { return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext()); }

//------> Ignorados 
[ \t\r\n\f]     {}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }
