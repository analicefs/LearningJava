package System.out;

public class Conta {
	private String numero;
	private double saldo;
	private String usuario;
	
	public  Conta(){
	this.numero=numero;
	this.usuario=usuario;
}
public String getUsuário() {
		return this.usuario;
}

public String getNumero() {
	return this.numero;
}
	
public double getSaldo() {
		return this.saldo;
	}
	
public Conta(String numero) {
		this.numero=numero;
	}
public void Creditar(double valor) {
		this.saldo+=valor;
	}
public void Debitar(double valor) {
		this.saldo= saldo-valor;
	
	}
public static void main(String[] args) {
		Conta p= new Conta("001");

		System.out.println("Numero da conta é:");
	}




}
