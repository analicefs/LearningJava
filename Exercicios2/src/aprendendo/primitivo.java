package aprendendo;

public class primitivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte anoDeEmpresa=23;
		short NumerosdeVoos=546;
		int id=5_994;
		long pontosAcumulados=3_334_444;
		float salario= 11_223f;
		double vendasAcumuladas=122_213_112_345.45;
		boolean estaDeFerias= false;
		char status='A';
		
		
System.out.println("Voc� tem "+anoDeEmpresa*365+" dias nessa empresa\n !"
		+ "PARAB�NS !!"
		+ "\n Obrigado por fazer parte dessa equipe!!!");
System.out.println(" Voc� fez " + NumerosdeVoos/2 + " viagens ");
System.out.println(" Voc� fez " + pontosAcumulados/vendasAcumuladas + " pontos ");
System.out.println(" Esse ID --> " + id + " Ganha -->" + salario);
System.out.println(" Est� de F�rias--> " + estaDeFerias);
System.out.println("Status: " + status);

	}

}
