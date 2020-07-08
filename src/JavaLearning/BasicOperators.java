package JavaLearning;

public class BasicOperators {

	public static void main(String[] args) {

		int x = 10;
		int y = x % 2;
		System.out.println(y); // 0

		// To check even and odd
		int num = 13;
		if (num % 2 == 0) {
			System.out.println("num is even");
		} else {
			System.out.println("num is odd");
		}
		// To check the num is positive
		int number = 0;

		if (number > 0) {
			System.out.println("number is positive");
		} else if (number < 0) {
			System.out.println("number is negative");
		} else {
			System.out.println("number is zero");
		}
		// ternary operator
		int z = 17;
		String s = (z > 100) ? "hii" : "byee";
		System.out.println(s);

		// Find max number
		int n1 = 5;
		int n2 = 10;
		int max;
		max = (n1 > n2) ? n1 : n2; // if true then 1st condition else go for second condition
		System.out.println(max);

		// launching browser by ternary operator
		String browser = "chrome";
		String s1 = (browser.equals("chrome")) ? "launch chrome" : "launch firefox";
		System.out.println(s1);
		
		
		boolean flag=true;
		if (!flag) {
			System.out.println("This is true");
		}
		else {
			System.out.println("byee!!");
		}
		
		// To check how we handle values comes from some field or not by using ! operator
		String name = "saurab";
		if (!name.equals(" ")) {
			System.out.println("name is "+ name);
			
		} else {
             System.out.println("value is blank");
		}

	}

}
