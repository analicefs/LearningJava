package System.out;
import System.out.PersonComGeteSet;

public class OOConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "motorola";
		String b =  new String ("motorola");
		String c = "igual";
		
		if(a==b) {
			System.out.println("Igual");
		}else {
			System.out.println("diferente");// Est� olhando o ponteiro da mem�ria
		}
	
	if(a.equals(c)) {
		System.out.println("s�o iguais");
	}
	PersonComGeteSet p = new PersonComGeteSet();
	p.setNome("Ana");
	p.setCpf("0102028");
	p.setIdade(23);
	System.out.println(p.getNome());
	System.out.println(p.getCpf());
	System.out.println(p.getIdade());

}
}
