package System.out;

public class Conta {
	private String numero;
	private double saldo;
	
public  Conta(){
	this.numero=numero;
}
public String getNumero() {
	return this.numero;
}
	
public double getSaldo() {
		return saldo;
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
		Conta p= new Conta();

		
		System.out.println("");
	}

}
