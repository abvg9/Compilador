/* Evaluador.java */
/* Generated By:JavaCC: Do not edit this line. Evaluador.java */
package javaCC;

import ast.*;

public class Evaluador implements EvaluadorConstants {

  private ASTiny as = new ASTiny();
  private final static int MAS=0;
  private final static int MENOS=1;
  private final static int AND=2;
  private final static int OR=3;
  private final static int MAY=4;
  private final static int MEN=5;
  private final static int MAYI=6;
  private final static int MENI=7;
  private final static int IGUAL=8;
  private final static int DIST=9;
  private final static int POR=10;
  private final static int DIV=11;
  private final static int SIGNO=12;
  private final static int NOT=13;

  private E mkexpbin(int op, E opnd1, E opnd2) {
    switch(op) {
      case MAS: return as.suma(opnd1,opnd2);
      case MENOS: return as.resta(opnd1,opnd2);
      case AND: return as.conj(opnd1,opnd2);
      case OR: return as.disy(opnd1,opnd2);
      case MAY: return as.may(opnd1,opnd2);
      case MEN: return as.men(opnd1,opnd2);
      case MAYI: return as.mayi(opnd1,opnd2);
      case MENI: return as.meni(opnd1,opnd2);
      case IGUAL: return as.igual(opnd1,opnd2);
      case DIST: return as.dist(opnd1,opnd2);
      case POR: return as.mul(opnd1,opnd2);
      case DIV: return as.div(opnd1,opnd2);
      default: return null;
    }
  }

  private E mkexpun(int op, E opnd) {
    switch(op) {
      case SIGNO: return as.signo(opnd);
      case NOT: return as.not(opnd);
      default: return null;
    }
  }

  final public S Sp() throws ParseException {S ast;
    ast = Programa();
    jj_consume_token(0);
{if ("" != null) return ast;}
    throw new Error("Missing return statement in function");
  }

  final public S Programa() throws ParseException {LDs ds; LIs ls;
    ds = LDs();
    jj_consume_token(SEC);
    ls = LIs();
{if ("" != null) return as.programa(ds,ls);}
    throw new Error("Missing return statement in function");
  }

  final public LDs LDs() throws ParseException {ResulD d; LDs aOfRLDs;
    d = Declaracion();
    aOfRLDs = RLDs(as.dSimple(d.tipo(),d.id()));
{if ("" != null) return aOfRLDs;}
    throw new Error("Missing return statement in function");
  }

  final public LDs RLDs(LDs ahOfRLDs0) throws ParseException {ResulD d; LDs aOfRLDs1;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 22:{
      jj_consume_token(22);
      d = Declaracion();
      aOfRLDs1 = RLDs(as.dCompuesta(ahOfRLDs0,d.tipo(),d.id()));
{if ("" != null) return aOfRLDs1;}
      break;
      }
    default:
      jj_la1[0] = jj_gen;
{if ("" != null) return ahOfRLDs0;}
    }
    throw new Error("Missing return statement in function");
  }

  final public ResulD Declaracion() throws ParseException {Token tipo; Token id;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUM:{
      tipo = jj_consume_token(NUM);
      id = jj_consume_token(VAR);
{if ("" != null) return new ResulD(tipo.image,id.image);}
      break;
      }
    case BOOL:{
      tipo = jj_consume_token(BOOL);
      id = jj_consume_token(VAR);
{if ("" != null) return new ResulD(tipo.image,id.image);}
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public LIs LIs() throws ParseException {ResulI i; LIs aOfRLIs;
    i = Instruccion();
    aOfRLIs = RLIs(as.liSimple(i.id(),i.exp()));
{if ("" != null) return aOfRLIs;}
    throw new Error("Missing return statement in function");
  }

  final public LIs RLIs(LIs ahOfRLIs0) throws ParseException {ResulI i; LIs aOfRLIs1;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 22:{
      jj_consume_token(22);
      i = Instruccion();
      aOfRLIs1 = RLIs(as.liCompuesta(ahOfRLIs0,i.id(),i.exp()));
{if ("" != null) return aOfRLIs1;}
      break;
      }
    default:
      jj_la1[2] = jj_gen;
{if ("" != null) return ahOfRLIs0;}
    }
    throw new Error("Missing return statement in function");
  }

  final public ResulI Instruccion() throws ParseException {Token id; E eOfE0;
    id = jj_consume_token(VAR);
    jj_consume_token(23);
    eOfE0 = Exp0();
{if ("" != null) return new ResulI(id.image,eOfE0);}
    throw new Error("Missing return statement in function");
  }

  final public E Exp0() throws ParseException {E aOfE1,aOfR0;
    aOfE1 = Exp1();
    aOfR0 = R0(aOfE1);
{if ("" != null) return aOfR0;}
    throw new Error("Missing return statement in function");
  }

  final public E R0(E ahOfR0) throws ParseException {int op0; E aOfE1; E aOfR0;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 24:
    case 27:{
      op0 = Op0();
      aOfE1 = Exp1();
      aOfR0 = R0(mkexpbin(op0,ahOfR0,aOfE1));
{if ("" != null) return aOfR0;}
      break;
      }
    default:
      jj_la1[3] = jj_gen;
{if ("" != null) return ahOfR0;}
    }
    throw new Error("Missing return statement in function");
  }

  final public E Exp1() throws ParseException {E aOfE2,aOfR1;
    aOfE2 = Exp2();
    aOfR1 = R1(aOfE2);
{if ("" != null) return aOfR1;}
    throw new Error("Missing return statement in function");
  }

  final public E R1(E ahOfR1) throws ParseException {int op1; E exp; E aOfR1;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ANDT:{
      op1 = AND();
      exp = Exp2();
      aOfR1 = R1(mkexpbin(op1,ahOfR1,exp));
{if ("" != null) return aOfR1;}
      break;
      }
    case ORT:{
      op1 = OR();
      exp = Exp2();
      aOfR1 = R1(mkexpbin(op1,ahOfR1,exp));
{if ("" != null) return aOfR1;}
      break;
      }
    default:
      jj_la1[4] = jj_gen;
{if ("" != null) return ahOfR1;}
    }
    throw new Error("Missing return statement in function");
  }

  final public int AND() throws ParseException {
    jj_consume_token(ANDT);
{if ("" != null) return AND;}
    throw new Error("Missing return statement in function");
  }

  final public int OR() throws ParseException {
    jj_consume_token(ORT);
{if ("" != null) return OR;}
    throw new Error("Missing return statement in function");
  }

  final public E Exp2() throws ParseException {E aOfE3,aOfR2;
    aOfE3 = Exp3();
    aOfR2 = R2(aOfE3);
{if ("" != null) return aOfR2;}
    throw new Error("Missing return statement in function");
  }

  final public E R2(E ahOfR2) throws ParseException {int op2; E aOfE3; E aOfR2;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 28:
    case 29:
    case 30:
    case 31:
    case 32:
    case 33:{
      op2 = Op2();
      aOfE3 = Exp3();
      aOfR2 = R2(mkexpbin(op2,ahOfR2,aOfE3));
{if ("" != null) return aOfR2;}
      break;
      }
    default:
      jj_la1[5] = jj_gen;
{if ("" != null) return ahOfR2;}
    }
    throw new Error("Missing return statement in function");
  }

  final public E Exp3() throws ParseException {E aOfE4,aOfR3;
    aOfE4 = Exp4();
    aOfR3 = R3(aOfE4);
{if ("" != null) return aOfR3;}
    throw new Error("Missing return statement in function");
  }

  final public E R3(E ahOfR3) throws ParseException {int op3; E aOfE4; E aOfR3;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 34:
    case 35:{
      op3 = Op3();
      aOfE4 = Exp4();
      aOfR3 = R3(mkexpbin(op3,ahOfR3,aOfE4));
{if ("" != null) return aOfR3;}
      break;
      }
    default:
      jj_la1[6] = jj_gen;
{if ("" != null) return ahOfR3;}
    }
    throw new Error("Missing return statement in function");
  }

  final public E Exp4() throws ParseException {int op4; E exp;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 24:{
      op4 = SIGNO();
      exp = Exp4();
{if ("" != null) return mkexpun(op4,exp);}
      break;
      }
    case NOTT:{
      op4 = NOT();
      exp = Exp5();
{if ("" != null) return mkexpun(op4,exp);}
      break;
      }
    case TRUE:
    case FALSE:
    case VAR:
    case LENT:
    case LDEC:
    case LEXP:
    case 25:{
      exp = Exp5();
{if ("" != null) return exp;}
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public int SIGNO() throws ParseException {
    jj_consume_token(24);
{if ("" != null) return SIGNO;}
    throw new Error("Missing return statement in function");
  }

  final public int NOT() throws ParseException {
    jj_consume_token(NOTT);
{if ("" != null) return NOT;}
    throw new Error("Missing return statement in function");
  }

  final public E Exp5() throws ParseException {Token t; E aOfE0;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LENT:{
      t = jj_consume_token(LENT);
{if ("" != null) return as.real(t.image);}
      break;
      }
    case LDEC:{
      t = jj_consume_token(LDEC);
{if ("" != null) return as.real(t.image);}
      break;
      }
    case LEXP:{
      t = jj_consume_token(LEXP);
{if ("" != null) return as.real(t.image);}
      break;
      }
    case VAR:{
      t = jj_consume_token(VAR);
{if ("" != null) return as.id(t.image);}
      break;
      }
    case TRUE:{
      t = jj_consume_token(TRUE);
{if ("" != null) return as.trueCnt();}
      break;
      }
    case FALSE:{
      t = jj_consume_token(FALSE);
{if ("" != null) return as.falseCnt();}
      break;
      }
    case 25:{
      t = jj_consume_token(25);
      aOfE0 = Exp0();
      jj_consume_token(26);
{if ("" != null) return aOfE0;}
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public int Op0() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 27:{
      jj_consume_token(27);
{if ("" != null) return MAS;}
      break;
      }
    case 24:{
      jj_consume_token(24);
{if ("" != null) return MENOS;}
      break;
      }
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public int Op2() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 28:{
      jj_consume_token(28);
{if ("" != null) return MAY;}
      break;
      }
    case 29:{
      jj_consume_token(29);
{if ("" != null) return MEN;}
      break;
      }
    case 30:{
      jj_consume_token(30);
{if ("" != null) return MAYI;}
      break;
      }
    case 31:{
      jj_consume_token(31);
{if ("" != null) return MENI;}
      break;
      }
    case 32:{
      jj_consume_token(32);
{if ("" != null) return IGUAL;}
      break;
      }
    case 33:{
      jj_consume_token(33);
{if ("" != null) return DIST;}
      break;
      }
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public int Op3() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 34:{
      jj_consume_token(34);
{if ("" != null) return POR;}
      break;
      }
    case 35:{
      jj_consume_token(35);
{if ("" != null) return DIV;}
      break;
      }
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public EvaluadorTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[12];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x400000,0x30,0x400000,0x9000000,0x600,0xf0000000,0x0,0x33908c0,0x23900c0,0x9000000,0xf0000000,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x3,0xc,0x0,0x0,0x0,0x3,0xc,};
   }

  /** Constructor with InputStream. */
  public Evaluador(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Evaluador(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new EvaluadorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Evaluador(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new EvaluadorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Evaluador(EvaluadorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(EvaluadorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[36];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 12; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 36; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
