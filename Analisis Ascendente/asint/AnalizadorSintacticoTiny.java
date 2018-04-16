
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140220
// Mon Apr 16 10:29:44 CEST 2018
//----------------------------------------------------

package asint;

import java_cup.runtime.*;
import alex.AnalizadorLexicoTiny;
import alex.UnidadLexica;
import errors.GestionErroresTiny;
import java_cup.runtime.ComplexSymbolFactory.Location;

/** CUP v0.11b beta 20140220 generated parser.
  * @version Mon Apr 16 10:29:44 CEST 2018
  */
public class AnalizadorSintacticoTiny extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalizadorSintacticoTiny() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintacticoTiny(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintacticoTiny(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\002\003\000\002\002\004\000\002\003" +
    "\005\000\002\004\005\000\002\004\003\000\002\005\004" +
    "\000\002\005\004\000\002\006\005\000\002\006\003\000" +
    "\002\007\005\000\002\010\005\000\002\010\003\000\002" +
    "\011\005\000\002\011\005\000\002\011\003\000\002\012" +
    "\005\000\002\012\003\000\002\013\005\000\002\013\003" +
    "\000\002\014\004\000\002\014\004\000\002\015\003\000" +
    "\002\015\003\000\002\015\003\000\002\015\003\000\002" +
    "\015\005\000\002\016\003\000\002\016\003\000\002\017" +
    "\003\000\002\017\003\000\002\017\003\000\002\017\003" +
    "\000\002\017\003\000\002\017\003\000\002\020\003\000" +
    "\002\020\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\067\000\006\006\004\007\010\001\002\000\004\010" +
    "\071\001\002\000\006\004\014\005\015\001\002\000\004" +
    "\002\001\001\002\000\004\002\013\001\002\000\004\010" +
    "\012\001\002\000\006\004\ufffd\005\ufffd\001\002\000\006" +
    "\004\ufffb\005\ufffb\001\002\000\004\002\000\001\002\000" +
    "\004\010\017\001\002\000\006\006\004\007\010\001\002" +
    "\000\006\004\ufffe\005\ufffe\001\002\000\004\011\024\001" +
    "\002\000\006\002\uffff\005\022\001\002\000\006\002\ufff9" +
    "\005\ufff9\001\002\000\004\010\017\001\002\000\006\002" +
    "\ufffa\005\ufffa\001\002\000\006\014\031\023\032\001\002" +
    "\000\040\002\ufff1\005\ufff1\012\ufff1\013\ufff1\021\ufff1\022" +
    "\ufff1\023\ufff1\024\057\025\060\026\066\027\062\030\065" +
    "\031\063\032\061\033\064\001\002\000\020\002\ufff3\005" +
    "\ufff3\012\052\013\051\021\ufff3\022\ufff3\023\ufff3\001\002" +
    "\000\014\002\ufff6\005\ufff6\021\ufff6\022\ufff6\023\ufff6\001" +
    "\002\000\012\002\ufff8\005\ufff8\022\045\023\047\001\002" +
    "\000\014\006\036\010\035\016\040\017\037\020\041\001" +
    "\002\000\006\014\031\023\032\001\002\000\040\002\uffef" +
    "\005\uffef\012\uffef\013\uffef\021\uffef\022\uffef\023\uffef\024" +
    "\uffef\025\uffef\026\uffef\027\uffef\030\uffef\031\uffef\032\uffef" +
    "\033\uffef\001\002\000\040\002\uffee\005\uffee\012\uffee\013" +
    "\uffee\021\uffee\022\uffee\023\uffee\024\uffee\025\uffee\026\uffee" +
    "\027\uffee\030\uffee\031\uffee\032\uffee\033\uffee\001\002\000" +
    "\040\002\uffeb\005\uffeb\012\uffeb\013\uffeb\021\uffeb\022\uffeb" +
    "\023\uffeb\024\uffeb\025\uffeb\026\uffeb\027\uffeb\030\uffeb\031" +
    "\uffeb\032\uffeb\033\uffeb\001\002\000\040\002\uffec\005\uffec" +
    "\012\uffec\013\uffec\021\uffec\022\uffec\023\uffec\024\uffec\025" +
    "\uffec\026\uffec\027\uffec\030\uffec\031\uffec\032\uffec\033\uffec" +
    "\001\002\000\040\002\uffe9\005\uffe9\012\uffe9\013\uffe9\021" +
    "\uffe9\022\uffe9\023\uffe9\024\uffe9\025\uffe9\026\uffe9\027\uffe9" +
    "\030\uffe9\031\uffe9\032\uffe9\033\uffe9\001\002\000\040\002" +
    "\uffea\005\uffea\012\uffea\013\uffea\021\uffea\022\uffea\023\uffea" +
    "\024\uffea\025\uffea\026\uffea\027\uffea\030\uffea\031\uffea\032" +
    "\uffea\033\uffea\001\002\000\006\014\031\023\032\001\002" +
    "\000\040\002\uffed\005\uffed\012\uffed\013\uffed\021\uffed\022" +
    "\uffed\023\uffed\024\uffed\025\uffed\026\uffed\027\uffed\030\uffed" +
    "\031\uffed\032\uffed\033\uffed\001\002\000\010\021\044\022" +
    "\045\023\047\001\002\000\040\002\uffe8\005\uffe8\012\uffe8" +
    "\013\uffe8\021\uffe8\022\uffe8\023\uffe8\024\uffe8\025\uffe8\026" +
    "\uffe8\027\uffe8\030\uffe8\031\uffe8\032\uffe8\033\uffe8\001\002" +
    "\000\006\014\uffe7\023\uffe7\001\002\000\006\014\031\023" +
    "\032\001\002\000\006\014\uffe6\023\uffe6\001\002\000\014" +
    "\002\ufff7\005\ufff7\021\ufff7\022\ufff7\023\ufff7\001\002\000" +
    "\006\014\031\023\032\001\002\000\006\014\031\023\032" +
    "\001\002\000\014\002\ufff5\005\ufff5\021\ufff5\022\ufff5\023" +
    "\ufff5\001\002\000\014\002\ufff4\005\ufff4\021\ufff4\022\ufff4" +
    "\023\ufff4\001\002\000\006\014\031\023\032\001\002\000" +
    "\006\014\031\023\032\001\002\000\006\014\uffe5\023\uffe5" +
    "\001\002\000\006\014\uffe4\023\uffe4\001\002\000\006\014" +
    "\uffdf\023\uffdf\001\002\000\006\014\uffe2\023\uffe2\001\002" +
    "\000\006\014\uffe0\023\uffe0\001\002\000\006\014\uffde\023" +
    "\uffde\001\002\000\006\014\uffe1\023\uffe1\001\002\000\006" +
    "\014\uffe3\023\uffe3\001\002\000\024\002\ufff2\005\ufff2\012" +
    "\ufff2\013\ufff2\021\ufff2\022\ufff2\023\ufff2\032\061\033\064" +
    "\001\002\000\040\002\ufff0\005\ufff0\012\ufff0\013\ufff0\021" +
    "\ufff0\022\ufff0\023\ufff0\024\ufff0\025\ufff0\026\ufff0\027\ufff0" +
    "\030\ufff0\031\ufff0\032\ufff0\033\ufff0\001\002\000\006\004" +
    "\ufffc\005\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\067\000\012\002\006\003\005\004\004\005\010\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\006\017\007\020" +
    "\001\001\000\004\005\015\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\007\022\001\001\000\002\001\001\000\014\010\027\011" +
    "\026\012\025\013\024\014\032\001\001\000\006\017\055" +
    "\020\054\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\016\045\001\001\000\004\015\041\001\001\000\004" +
    "\014\033\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\010\042\011\026\012\025\013\024\014" +
    "\032\001\001\000\002\001\001\000\004\016\045\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\011\047\012" +
    "\025\013\024\014\032\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\012\053\013\024\014\032\001\001\000" +
    "\012\011\052\012\025\013\024\014\032\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\014\067\001\001\000" +
    "\006\013\066\014\032\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\020\054\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintacticoTiny$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintacticoTiny$actions(this);
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
    return action_obj.CUP$AnalizadorSintacticoTiny$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
 
   errores = new GestionErroresTiny();
   AnalizadorLexicoTiny alex = (AnalizadorLexicoTiny)getScanner();
   alex.fijaGestionErrores(errores);

    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return getScanner().next_token(); 
    }

 
   private GestionErroresTiny errores;
   public void syntax_error(Symbol unidadLexica) {
     errores.errorSintactico((UnidadLexica)unidadLexica);
   }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalizadorSintacticoTiny$actions {
  private final AnalizadorSintacticoTiny parser;

  /** Constructor */
  CUP$AnalizadorSintacticoTiny$actions(AnalizadorSintacticoTiny parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintacticoTiny$do_action_part00000000(
    int                        CUP$AnalizadorSintacticoTiny$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintacticoTiny$parser,
    java.util.Stack            CUP$AnalizadorSintacticoTiny$stack,
    int                        CUP$AnalizadorSintacticoTiny$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintacticoTiny$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintacticoTiny$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // S ::= Programa 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("S",0, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= S EOF 
            {
              Object RESULT =null;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintacticoTiny$stack.elementAt(CUP$AnalizadorSintacticoTiny$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintacticoTiny$parser.done_parsing();
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Programa ::= LDs SEC LIs 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Programa",1, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // LDs ::= LDs NXT Declaracion 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("LDs",2, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // LDs ::= Declaracion 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("LDs",2, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Declaracion ::= _NUM VAR 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Declaracion",3, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Declaracion ::= _BOOL VAR 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Declaracion",3, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // LIs ::= LIs NXT Instruccion 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("LIs",4, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // LIs ::= Instruccion 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("LIs",4, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Instruccion ::= VAR ASIG EXP0 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Instruccion",5, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // EXP0 ::= EXP0 OP0 EXP1 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP0",6, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // EXP0 ::= EXP1 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP0",6, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // EXP1 ::= EXP2 _AND EXP1 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP1",7, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // EXP1 ::= EXP2 _OR EXP2 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP1",7, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // EXP1 ::= EXP2 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP1",7, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // EXP2 ::= EXP3 OP2 EXP3 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP2",8, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EXP2 ::= EXP3 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP2",8, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EXP3 ::= EXP3 OP3 EXP4 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP3",9, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // EXP3 ::= EXP4 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP3",9, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // EXP4 ::= MENOS EXP4 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP4",10, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // EXP4 ::= NOT EXP5 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP4",10, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // EXP5 ::= _NUM 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP5",11, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // EXP5 ::= VAR 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP5",11, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // EXP5 ::= _TRUE 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP5",11, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // EXP5 ::= _FALSE 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP5",11, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // EXP5 ::= PAP EXP0 PCIERRE 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("EXP5",11, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // OP0 ::= MAS 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP0",12, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // OP0 ::= MENOS 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP0",12, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // OP2 ::= MAY 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP2",13, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // OP2 ::= MEN 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP2",13, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // OP2 ::= MAYI 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP2",13, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // OP2 ::= MENI 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP2",13, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // OP2 ::= IGUAL 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP2",13, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // OP2 ::= DIST 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP2",13, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // OP3 ::= POR 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP3",14, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // OP3 ::= DIV 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP3",14, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$AnalizadorSintacticoTiny$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintacticoTiny$do_action(
    int                        CUP$AnalizadorSintacticoTiny$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintacticoTiny$parser,
    java.util.Stack            CUP$AnalizadorSintacticoTiny$stack,
    int                        CUP$AnalizadorSintacticoTiny$top)
    throws java.lang.Exception
    {
              return CUP$AnalizadorSintacticoTiny$do_action_part00000000(
                               CUP$AnalizadorSintacticoTiny$act_num,
                               CUP$AnalizadorSintacticoTiny$parser,
                               CUP$AnalizadorSintacticoTiny$stack,
                               CUP$AnalizadorSintacticoTiny$top);
    }
}

