package System.out;

import java.util.ArrayList;
import java.util.Iterator;

// Usa o arrayList se vc quer flexibilidade
public class ArrayListsPt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Emilly");//size 1
		names.add("Ana"); // size 2
		names.add("Lice"); // size 3
		names.add("Freires"); // size 4
		names.add("Santos"); // size 5
		names.add("Delma"); // size 6
		names.add("Silva"); // size 7
		
		// imprimir um nome
		String name = names.get(2);	
		System.out.println(name);
		
		// Alterar um nome
				names.set(2, "Alice");
				System.out.println(names.get(2));
				
				System.out.println();
				for (String currentName : names) {
					System.out.println(currentName);
				}
				
				names.remove(1);
				System.out.println(names.get(1));
				
				System.out.println();
				//ver tamanho
				System.out.println(names.size());
				System.out.println();
				
				// imprimir a lista ou varrer
				for (Iterator <String> iterator = names.iterator(); iterator.hasNext();) {
					String currentName = iterator.next();
					System.out.println(currentName);
					
				}
				
				// foreach
				// imprimir a lista ou varrer
				System.out.println();
				for (String currentName : names) {
					System.out.println(currentName);
				}
	}

}
