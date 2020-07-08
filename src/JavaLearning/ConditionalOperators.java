package JavaLearning;

public class ConditionalOperators {
	
	public static void main(String []args) {
		
		int a =30;
		int b= 70;
		
		if (b>=a) {
			System.out.println("b is greater than  a");
			
		}
		else {
			System.out.println("a is greater than b");
		}
		
		int total = 100;
		int tax = 50;
		int finalAmnt= total +tax;
		int pendingAmnt =finalAmnt;
		if (finalAmnt ==pendingAmnt) {
			System.out.println("Billing paid..");
		}
		else {
			System.out.println("Billing dues..");
		}
		// String comparison
		String s1= "This is java";
		String s2="This is  Java";
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		//cross browser with selenium
		String browser = "firefox";
		
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
			
		}
		else if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		else if (browser.equals("safari")) {
			System.out.println("launch safari");
			
		}
		else {
			System.out.println("we dont support this browser..");
		}
		// marks
		String studentName = "saroj";
		int marks ;
		
		if (studentName.equals("Virat")) {
			 marks =100;
			System.out.println(marks);
			
		}
		else if (studentName.equals("saroj")) {
			 marks =90;
			System.out.println(studentName +" ---" + marks);

			
		}
		else if (studentName.equals("raman")) {
			 marks =80;
			System.out.println(studentName +" ---" + marks);

			
		}
		else {
			System.out.println("name not found " + studentName);
		}
		// if- if- if
		int amount = 200;
		if (amount >= 100) {
			if (amount<=150) {
				System.out.println("Billing paid");
				
			}
			else {
			 System.out.println("not paid");
			}
			
		}
		else {
			System.out.println("Billing not paid");
		}
		
		// WAP too print the highest numbers among the 3 nos (IQ)
		
		int x = 3300;
		int y = 1400;
		int z = 500;
		
		if (x>y && x>z ) {
			System.out.println(x +" is highest");
			
		} else if (y>z) {
			System.out.println(y +" is highest");
			
		} else {
			System.out.println(z + " is highest");

		}
		
		
		
		
	}

}
