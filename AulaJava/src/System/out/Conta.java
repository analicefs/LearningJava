package System.out;

public class Conta {
	private String numero;
	 public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	private double saldo;
	 
	public Conta(String numero) {
		this.numero=numero;
	}
	public void Creditar(double valor) {
		this.saldo+=valor;
	}
	public void Debitar(double valor) {
		this.saldo= saldo-valor;
	
	}

}
