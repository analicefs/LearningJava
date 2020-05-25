package System.out;

public class PersonConstrutor {
	private String name;
	private int idade;
	private String cpf;

	public String getName() {
		return this.name;
	}
	public String getCpf() {
		return this.cpf;
	}
	public int getIdade() {
		return this.idade;
	}



	public PersonConstrutor(String name, String cpf, int idade) {
		// metodo não tem retorno; 
		// retorna o instancia
		this.name= name;
		this.cpf=cpf;
		this.idade=idade;

	}
	
	public PersonConstrutor(String name, String cpf) {
		// metodo não tem retorno; 
		// retorna o instancia
		this.name= name;
		this.cpf=cpf;

	}
	
	public  void ImprimirPerson() {
		System.out.println("name= " + this.name);
		System.out.println("name= " + this.cpf);
		System.out.println("name= " + this.idade);
	}
	public static void main(String[] args) {
		PersonConstrutor p= new PersonConstrutor("Ana", "0009", 23);
		PersonConstrutor p2= new PersonConstrutor("Maria", "0004", 2);
		PersonConstrutor p3= new PersonConstrutor("Maria", "0334");
		//p.name="Henrique";
		p.ImprimirPerson();
		p2.ImprimirPerson();
		p3.ImprimirPerson();
	}
	
}
