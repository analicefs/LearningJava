// Hipotenusa a= 3 e b= 4;
public class Pytagoras {
	public static void main(String[] args) {
		int a=3;
		int b=4;
		System.out.println(Math.sqrt((Math.pow(a,2)+(Math.pow(b, 2)))));
	
		//ou
		
		System.out.println(Math.hypot(a, b));
	}
}
