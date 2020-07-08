package JavaLearning;

public class IncrementalDecremental {

	public static void main(String[] args) {

		// ++ and --
		int x = 1 ;
		int y = x++; // post increment
		
		System.out.println(x); // 2
		System.out.println(y); // 1
		
		
		int p = -1;
		int q = p ++;//post increment
		System.out.println(p); // 0
		System.out.println(q); // -1
		
		//preincrement
		int a = 1;
		int b= ++a;
		System.out.println(a);  //2
		System.out.println(b); // 2
		
		
	}

}
