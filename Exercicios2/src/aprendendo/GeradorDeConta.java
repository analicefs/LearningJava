package aprendendo;

public class GeradorDeConta {

	private int numero;
	private double saldo;
	private static int proximo =0;

	public GeradorDeConta() {
		this(0.0);
	}
	public GeradorDeConta(double valorinicial) {
		this.numero=GeradorDeConta.getProximo();
		this.saldo=valorinicial;
	}
	public static int getProximo() {
		//this.saldo=0;	
		return ++GeradorDeConta.proximo;
	}

	public int getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void Creditar(double valor) {
		this.saldo=this.saldo+valor;
	}
	public void Debitar(double valor) {
		this.saldo -= valor;

	}
	public void DetalhesdaConta() {
		System.out.println("numero ="+ this.numero);
		System.out.println("Saldo ="+ this.saldo);	
	}
	//public static void main(String[] args) {

}


