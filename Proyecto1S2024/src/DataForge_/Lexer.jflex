// ------------  Paquete e importaciones ------------
package DataForge_; 

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
decimal = \d+\.\d+
multilinea = [<][!][^!]*[!]+([^>*][^!]*[*]+)*[>]
comentariosimple = 
%%
// ------------  Reglas Lexicas -------------------
"("               {return new Symbol(sym.PARENTESIS_A, yycolumn, yyline, yytext());}
")"               {return new Symbol(sym.PARENTESIS_C, yycolumn, yyline, yytext());}
"["               {return new Symbol(sym.CORCHETE_ABRE, yycolumn, yyline, yytext());}
"]"               {return new Symbol(sym.CORCHETE_CIERRA, yycolumn, yyline, yytext());}
":"               {return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());}
";"               {return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext());}
"program"         {return new Symbol(sym.PROGRAM, yycolumn, yyline, yytext());}
"end"             {return new Symbol(sym.END, yycolumn, yyline, yytext());}
"var"             {return new Symbol(sym.VAR, yycolumn, yyline, yytext());}
"double"          {return new Symbol(sym.R_DOUBLE, yycolumn, yyline, yytext());}
"char"            {return new Symbol(sym.R_CHAR, yycolumn, yyline, yytext());}
"arr"             {return new Symbol(sym.ARR, yycolumn, yyline, yytext());}
"@"               {return new Symbol(sym.ARROBA, yycolumn, yyline, yytext());}

"*"         {return new Symbol(sym.POR, yycolumn, yyline, yytext());}
"+"         {return new Symbol(sym.MAS, yycolumn, yyline, yytext());}
"-"         {return new Symbol(sym.MENOS, yycolumn, yyline, yytext());}

"<"         {return new Symbol(sym.MENORQUE, yycolumn, yyline, yytext());}

"mostrar"   {return new Symbol(sym.R_MOSTRAR, yycolumn, yyline, yytext());}

{entero}            { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{decimal}           { return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext()); }
multilinea          {}
comentariosimple    {}
//------> Ignorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }
