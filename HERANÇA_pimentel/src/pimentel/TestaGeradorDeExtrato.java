package pimentel;

public class TestaGeradorDeExtrato {

  public static void main(String[] args) {
	
  Geradordeextratos gera = new Geradordeextratos();

  ContaPoupanca c = new ContaPoupanca();  
  
  c.setSaldo(10000);
  Contacorrente cc = new Contacorrente();
  
  
  cc.setSaldo(500);
  
  gera.imprimeextratobasico(cc);
  
  
  
  }
	
	
	
	
	
}
