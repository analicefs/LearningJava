//preocupado com eficiência ou
public class Arrays {
	public static void main(String[] args) {
		final int ARRAY_LENGHT = 10;
		double [] values =  new double[ARRAY_LENGHT];
		//double [] values;
		//values = new double[10];
		values[4]=35;//sth position
		System.out.println(values[4]);
		System.out.println(values[0]);
		
		for(int i=0; i < values.length; i++ ) {
			System.out.println("values["+ i +"] =" + values[i]);
		
		}
		System.out.println();
		double [] morevalues = {1, 23, 199, 34, 45, 56, 78, 90, 10, 26};
		
		morevalues[4]=350;
		for(int i=0; i < morevalues.length; i++ ) {
			System.out.println("morevalues["+i+"] =" + morevalues[i]);
		
		}
		System.out.println();
		for(int i=0; i < morevalues.length; i++ ) {
			morevalues[i]= morevalues[i]+1;
			//morevalues[i]= morevalues[i]++;
			
			System.out.println("morevalues["+ i +"] =" + morevalues[i]);
			
		
		}
	 java.util.Arrays.sort(values);
	}
	

}
