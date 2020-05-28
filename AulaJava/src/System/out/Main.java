package System.out;

import aprendendo.GeradorDeConta;

public class Main {
	public static void main(String[] args) {
		// Conta c= new Conta("123",100);
		// c.Creditar(100.4);
		// c.DetalhesdaConta();
		 GeradorDeConta d = new GeradorDeConta();
		 double valor=1000;
		 d.Creditar(valor);
		 d.DetalhesdaConta();
		 GeradorDeConta e = new GeradorDeConta();
		 e.DetalhesdaConta();
		// GeradorDeConta.getProximo();
		 GeradorDeConta f = new GeradorDeConta();
		 double valor2=300;
		 f.Creditar(valor2);
		 f.DetalhesdaConta();
		 //GeradorDeConta.getProximo();
		 GeradorDeConta g = new GeradorDeConta();
		 double valor5=300;
		 g.Creditar(valor5); 
		 g.DetalhesdaConta();
		// GeradorDeConta.getProximo();
		 GeradorDeConta h = new GeradorDeConta();
		 double valor6=400;
		 h.Creditar(valor6);
		 h.DetalhesdaConta();
		 //GeradorDeConta.getProximo();
		
		 
	}

}
