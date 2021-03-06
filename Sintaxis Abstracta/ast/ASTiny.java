package ast;

public class ASTiny {
  public E suma(E opnd1, E opnd2) {return new Suma(opnd1,opnd2);}  
  public E resta(E opnd1, E opnd2) {return new Resta(opnd1,opnd2);}  
  public E mul(E opnd1, E opnd2) {return new Mul(opnd1,opnd2);}  
  public E div(E opnd1, E opnd2) {return new Div(opnd1,opnd2);}
  public E conj(E opnd1, E opnd2) {return new Conj(opnd1,opnd2);}  
  public E disy(E opnd1, E opnd2) {return new Disy(opnd1,opnd2);}  
  public E may(E opnd1, E opnd2) {return new May(opnd1,opnd2);}  
  public E men(E opnd1, E opnd2) {return new Men(opnd1,opnd2);} 
  public E mayi(E opnd1, E opnd2) {return new Mayi(opnd1,opnd2);}  
  public E meni(E opnd1, E opnd2) {return new Meni(opnd1,opnd2);}  
  public E igual(E opnd1, E opnd2) {return new Igual(opnd1,opnd2);}  
  public E dist(E opnd1, E opnd2) {return new Dist(opnd1,opnd2);}
  public E signo(E opnd1) {return new Signo(opnd1);}  
  public E not(E opnd1) {return new Not(opnd1);}   
  public E real(String n) {return new Real(n);}  
  public E id(String id) {return new Id(id);}
  public E true(String id) {return new True("true");}
  public E false(String id) {return new False("false");}  
  public LIs liCompuesta(LIs lis, String id, E exp) {return new LiCompuesta(lis,id,exp);}  
  public LIs liSimple(String id, E exp) {return new LiSimple(id,exp);}
  public LDs dCompuesta(LDs decs, String tipo, String id) {return new DCompuesta(decs,tipo,id);}  
  public LDs dSimple(String tipo, String id) {return new DSimple(tipo,id);}   
  public S programa(LDs decs,LIs lis) {return new Programa(decs,lis);} 
}