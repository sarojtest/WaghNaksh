package JavaLearning;

public class DataConversion {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x +20);
		
		// But requirement is 120  Wrapper Class convting into int
		int i =Integer.parseInt(x);
		System.out.println(Integer.parseInt(x));
		System.out.println(Integer.parseInt(x) + 20);
		System.out.println(i+20);
		
		int z = 75;
		System.out.println(String.valueOf(z));
		
		
	}

}
