package allasing;

public class Conta {
	private String numero;
	private double saldo;
	private String usuario;
	
	
	public  Conta(String numero, double saldo){
	this.numero=numero;
	this.usuario=usuario;
}
	public Conta(String numero, double c, double s){
	this( numero ,0.0);
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



