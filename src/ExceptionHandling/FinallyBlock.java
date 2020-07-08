package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println(div(10, 5));
		
	}
	public static int div(int a ,int b) {
		int d = 0;
		
		try {
			 d = a/b;
			 System.out.println("Hii");
			 System.out.println("Helloo");
			 return d;
		} catch (Exception e) {
			System.out.println("Somme Exception coming");
			//System.out.println(e.getMessage());
			return d;
		}
		finally {
			System.out.println("I am in finally block");
			return -1;
		}
		
		
	}
	

}
