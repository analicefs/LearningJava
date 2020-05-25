package System.out;

public class PersonComGeteSet {
	 private String nome;
	 private String cpf;
	 private int idade;
	 
	public static void main(String[] args) {
		PersonComGeteSet p = new PersonComGeteSet();
		p.setNome("Ana");
		p.setCpf("0102028");
		p.setIdade(23);
		System.out.println(p.getNome());
		System.out.println(p.getCpf());
		System.out.println(p.getIdade());
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	 

}
