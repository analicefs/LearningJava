
public class Strings {

	public static void main(String[] args) {
		//
		String name = "Ana Lice";
		int size = name.length();
		System.out.println(" the string "+name + " has size "+size);
		String empty="";
		System.out.println(empty.length());
		
		String fname ="Ana Lice";
		String lname ="Santos";
		String namec = fname+" "+lname;
		System.out.println(namec);
		
		char start=namec.charAt(0);/*first letter*/
		char last=namec.charAt(name.length()-1);/* second letter*/
	
		System.out.println(start);
		System.out.println(last);
		
		
		
		//subStrings
		
		String subStr =namec.substring(1, fname.length()-2);
		System.out.println(subStr);
		
		// Do not use this compare Strings
		// (word1==word2)
		
	// Equality tests
		String word1 = "Java";
		String word2 = "AspectJ";
		String word3= "java";
		if (word1.equals(word2)) {
			System.out.println("Yes");
		}
		else if(word1.equalsIgnoreCase(word3)) {
			System.out.println("Yes");
			
		}
		else {
			System.out.println("No");
		}
		
	}
	
}
