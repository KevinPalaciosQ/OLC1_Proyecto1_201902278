
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package DataForge_;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\041\000\002\002\004\000\002\002\006\000\002\014" +
    "\003\000\002\014\004\000\002\015\003\000\002\015\003" +
    "\000\002\015\003\000\002\015\003\000\002\015\003\000" +
    "\002\015\003\000\002\005\015\000\002\005\015\000\002" +
    "\004\003\000\002\004\005\000\002\013\003\000\002\013" +
    "\003\000\002\007\007\000\002\012\007\000\002\011\007" +
    "\000\002\010\007\000\002\016\020\000\002\017\016\000" +
    "\002\021\003\000\002\021\005\000\002\022\003\000\002" +
    "\022\003\000\002\022\003\000\002\022\003\000\002\020" +
    "\003\000\002\020\003\000\002\020\003\000\002\020\003" +
    "\000\002\020\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\004\024\005\001\002\000\004\002\116\001" +
    "\002\000\016\027\016\037\006\056\022\057\007\060\012" +
    "\061\013\001\002\000\004\026\072\001\002\000\004\004" +
    "\066\001\002\000\020\025\ufffb\027\ufffb\037\ufffb\056\ufffb" +
    "\057\ufffb\060\ufffb\061\ufffb\001\002\000\020\025\ufffa\027" +
    "\ufffa\037\ufffa\056\ufffa\057\ufffa\060\ufffa\061\ufffa\001\002" +
    "\000\004\004\062\001\002\000\004\004\056\001\002\000" +
    "\020\025\uffff\027\uffff\037\uffff\056\uffff\057\uffff\060\uffff" +
    "\061\uffff\001\002\000\020\025\054\027\016\037\006\056" +
    "\022\057\007\060\012\061\013\001\002\000\004\026\030" +
    "\001\002\000\020\025\ufff8\027\ufff8\037\ufff8\056\ufff8\057" +
    "\ufff8\060\ufff8\061\ufff8\001\002\000\020\025\ufffd\027\ufffd" +
    "\037\ufffd\056\ufffd\057\ufffd\060\ufffd\061\ufffd\001\002\000" +
    "\020\025\ufffc\027\ufffc\037\ufffc\056\ufffc\057\ufffc\060\ufffc" +
    "\061\ufffc\001\002\000\004\004\024\001\002\000\020\025" +
    "\ufff9\027\ufff9\037\ufff9\056\ufff9\057\ufff9\060\ufff9\061\ufff9" +
    "\001\002\000\004\005\025\001\002\000\004\025\026\001" +
    "\002\000\004\006\027\001\002\000\020\025\uffef\027\uffef" +
    "\037\uffef\056\uffef\057\uffef\060\uffef\061\uffef\001\002\000" +
    "\006\035\033\036\031\001\002\000\004\033\051\001\002" +
    "\000\004\026\034\001\002\000\004\026\ufff5\001\002\000" +
    "\004\026\035\001\002\000\004\065\036\001\002\000\004" +
    "\030\037\001\002\000\004\066\040\001\002\000\010\022" +
    "\043\023\044\065\042\001\002\000\004\025\047\001\002" +
    "\000\004\025\045\001\002\000\004\025\ufff3\001\002\000" +
    "\004\025\ufff2\001\002\000\004\006\046\001\002\000\020" +
    "\025\ufff6\027\ufff6\037\ufff6\056\ufff6\057\ufff6\060\ufff6\061" +
    "\ufff6\001\002\000\004\006\050\001\002\000\020\025\ufff7" +
    "\027\ufff7\037\ufff7\056\ufff7\057\ufff7\060\ufff7\061\ufff7\001" +
    "\002\000\004\034\052\001\002\000\004\026\ufff4\001\002" +
    "\000\020\025\ufffe\027\ufffe\037\ufffe\056\ufffe\057\ufffe\060" +
    "\ufffe\061\ufffe\001\002\000\004\024\055\001\002\000\004" +
    "\002\000\001\002\000\004\005\057\001\002\000\004\025" +
    "\060\001\002\000\004\006\061\001\002\000\020\025\ufff1" +
    "\027\ufff1\037\ufff1\056\ufff1\057\ufff1\060\ufff1\061\ufff1\001" +
    "\002\000\004\005\063\001\002\000\004\025\064\001\002" +
    "\000\004\006\065\001\002\000\020\025\ufff0\027\ufff0\037" +
    "\ufff0\056\ufff0\057\ufff0\060\ufff0\061\ufff0\001\002\000\004" +
    "\005\067\001\002\000\004\025\070\001\002\000\004\006" +
    "\071\001\002\000\020\025\uffee\027\uffee\037\uffee\056\uffee" +
    "\057\uffee\060\uffee\061\uffee\001\002\000\006\035\033\036" +
    "\031\001\002\000\004\026\074\001\002\000\004\026\075" +
    "\001\002\000\004\032\076\001\002\000\004\065\077\001" +
    "\002\000\004\030\100\001\002\000\004\066\101\001\002" +
    "\000\004\033\102\001\002\000\012\021\110\022\106\023" +
    "\107\065\104\001\002\000\006\007\uffeb\034\uffeb\001\002" +
    "\000\006\007\uffe7\034\uffe7\001\002\000\006\007\111\034" +
    "\112\001\002\000\006\007\uffe9\034\uffe9\001\002\000\006" +
    "\007\uffe8\034\uffe8\001\002\000\006\007\uffe6\034\uffe6\001" +
    "\002\000\012\021\110\022\106\023\107\065\104\001\002" +
    "\000\004\025\113\001\002\000\004\006\114\001\002\000" +
    "\020\025\uffed\027\uffed\037\uffed\056\uffed\057\uffed\060\uffed" +
    "\061\uffed\001\002\000\006\007\uffea\034\uffea\001\002\000" +
    "\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\004\002\003\001\001\000\002\001\001\000" +
    "\022\005\017\007\007\010\010\011\022\012\016\014\014" +
    "\015\013\016\020\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\020\005\017\007" +
    "\007\010\010\011\022\012\016\015\052\016\020\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\031\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\013\040" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\072\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\021\104\022\102\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\022\114\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public static String resultado = ""; 

    public void syntax_error(Symbol s)
    {
            System.err.println("Error Sintactico: "+ s.value + " - Fila: " + s.right + " - Columna: " + s.left + ". Recuperado" );
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {
            System.err.println("Error Sintactico: "+ s.value + " - Fila: " + s.right + " - Columna: " + s.left + ". Sin recuperacion." );
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {

  
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= PROGRAM recorrido END PROGRAM 
            {
              Object RESULT =null;
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // recorrido ::= instrucciones 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("recorrido",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // recorrido ::= recorrido instrucciones 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("recorrido",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instrucciones ::= declaracion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instrucciones",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instrucciones ::= arreglos 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instrucciones",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instrucciones ::= declaracionhistograma 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instrucciones",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // instrucciones ::= declaracionbarras 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instrucciones",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // instrucciones ::= declaracionpie 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instrucciones",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // instrucciones ::= declaracionlinea 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instrucciones",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // declaracion ::= VAR DOSPUNTOS tipodedato DOSPUNTOS DOSPUNTOS IDENTIFICADOR MENORQUE GUION tipodato END PUNTOYCOMA 
            {
              Object RESULT =null;
		 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // declaracion ::= VAR DOSPUNTOS tipodedato DOSPUNTOS DOSPUNTOS IDENTIFICADOR MENORQUE GUION IDENTIFICADOR END PUNTOYCOMA 
            {
              Object RESULT =null;
		 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // tipodedato ::= R_DOUBLE 
            {
              Object RESULT =null;
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipodedato",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // tipodedato ::= R_CHAR CORCHETE_ABRE CORCHETE_CIERRA 
            {
              Object RESULT =null;
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipodedato",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // tipodato ::= DECIMAL 
            {
              Object RESULT =null;
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipodato",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // tipodato ::= CADENA 
            {
              Object RESULT =null;
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipodato",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // declaracionhistograma ::= HISTOGRAM PARENTESIS_A PARENTESIS_C END PUNTOYCOMA 
            {
              Object RESULT =null;
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracionhistograma",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // declaracionlinea ::= GRAPHLINE PARENTESIS_A PARENTESIS_C END PUNTOYCOMA 
            {
              Object RESULT =null;
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracionlinea",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // declaracionpie ::= GRAPHPIE PARENTESIS_A PARENTESIS_C END PUNTOYCOMA 
            {
              Object RESULT =null;
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracionpie",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // declaracionbarras ::= GRAPHBAR PARENTESIS_A PARENTESIS_C END PUNTOYCOMA 
            {
              Object RESULT =null;
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracionbarras",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // arreglos ::= ARR DOSPUNTOS tipodedato DOSPUNTOS DOSPUNTOS ARROBA IDENTIFICADOR MENORQUE GUION CORCHETE_ABRE elementos CORCHETE_CIERRA END PUNTOYCOMA 
            {
              Object RESULT =null;
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("arreglos",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-13)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // operaciones ::= VAR DOSPUNTOS R_DOUBLE DOSPUNTOS DOSPUNTOS IDENTIFICADOR MENORQUE GUION PARENTESIS_A PARENTESIS_C END PUNTOYCOMA 
            {
              Object RESULT =null;
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operaciones",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-11)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // elementos ::= valor 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("elementos",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // elementos ::= elementos COMA valor 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("elementos",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // valor ::= DECIMAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // valor ::= CADENA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // valor ::= IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // valor ::= ENTERO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // operacion ::= SUM 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operacion",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // operacion ::= RES 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operacion",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // operacion ::= MUL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operacion",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // operacion ::= DIV 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operacion",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // operacion ::= MOD 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operacion",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
