package aprendendo;

public class NotacaoPontos {

	public static void main(String[] args) {
		
		String e="bom dia x!";
		//e.toUpperCase();// n�o funciona pois falta passar a variavel para a armazenar a mudan�a 
		
		e=e.toUpperCase(); //  todas as letras maiuscula;
		e=e.replace("X","senhora");//substitui string;
		e=e.toUpperCase(); 
		e=e.concat("!!!");
		System.out.println(e);
		System.out.println("Leo".toUpperCase());
		
		//ou
		String x="ana lice".toUpperCase();
		System.out.println(x);
		//Posso quebrar linha e mesmo assim o c�digo ir� funcionar
		String y= "Bom dia x!"
				.toUpperCase()
				.replace("x", "Ana")
				.concat("!!");
		
		System.out.println(y);
		//Tipos primitivos n�o tem operador ".";
		
		   
		
		
	
		
	}

}
