package aprendendo;

import java.util.Scanner;

public class ConverterTemperatura {
 public static void main(String[] args) {
	//(ºf-32) * 5/9;
		Scanner input= new Scanner(System.in);
		 double fah;
		 double celsius;
		 final int AJUSTE= 32;
		 final double FATOR= 5.0/9.0;
		 System.out.println("Digite a temperatura em Fahrenheit: ");
		 fah=input.nextInt();
		 celsius=(fah-AJUSTE)*FATOR;
		 System.out.println("O valor é " + celsius+ "ºC");
		 
		}
}

