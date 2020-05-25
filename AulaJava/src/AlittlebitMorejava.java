import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Scanner;

public class AlittlebitMorejava {
	
	static String s = "OO";
	
	public static void main(String[] args) {
		
		 System.out.println();
		Scanner ler = new Scanner(System.in);
		System.out.println("Hi");
		System.out.println("Ana Lice");
		int  x=10;
		x=100;
		int n;
		System.out.println("Escreva a sua idade");
		n = ler.nextInt();
		System.out.println(n);
		System.out.println(x);
		//if(x>100) {
		String s = "aO";
		System.out.println(s);
		System.out.println(AlittlebitMorejava.s);
		
		byte a=10;
		byte b=20;
		byte c;
		c= (byte)(a+b);
		System.out.println(c);
		
		double [] ab = {1, 23, 45 ,6};
		for (int i = 0; i < ab.length; i++) {
			System.out.println(ab[i]);
			
		}
		int count=0;
		while(count<ab.length) {
			double d = ab[count];
			System.out.println(d);
			count++;
		}
		 System.out.println();
		 ArrayList al = new ArrayList();
		 al.add("Java");
		 al.add(1000);
		 al.add("motorola");
		 for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof String) {
				System.out.println((String) object);
				
			}
			else if (object instanceof Integer) {
				int i = (Integer) object;
				System.out.println(i);
			}
			}
		 
		 System.out.println();
		 for (Object object : al) {
			 if (object instanceof String) {
					System.out.println((String) object);
					
				}
				else if (object instanceof Integer) {
					int i = (Integer) object;
					System.out.println(i);
				}
		}
		}
		 
		}
		
	
	


