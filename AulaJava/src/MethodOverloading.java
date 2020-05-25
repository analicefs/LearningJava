public class MethodOverloading {
	public static void main(String[] args) {
		int intValue;
		double doubleValue;
		
		intValue=7;
		doubleValue=7.5;
				
		System.out.println("the Square 7 =  " + MethodOverloading.square(7));
		System.out.println("The Square 7,5 =  "+MethodOverloading.square(7.5));
	
		meth1(10,10.0f);
	}

	public static double square(double doubleValue) {
		return doubleValue * doubleValue;
	}

	public static int square(int intValue) {
		return intValue * intValue;
	}
	public static void meth1(int a, float b) {
		System.out.println("meth1 with integer, float args ");
		
	}
	
	public static void meth1(float a, int b) {
		System.out.println("meth1 with float, int args ");
		
	}

}
