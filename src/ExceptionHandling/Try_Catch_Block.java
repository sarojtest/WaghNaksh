package ExceptionHandling;

public class Try_Catch_Block {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
        try {
        	int i = 9/0;
        	System.out.println("xyz");
		} catch (Exception e) {
			System.out.println("some exception occured");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getLocalizedMessage());
			
			e.printStackTrace();
			
		}
		
		
		System.out.println("A");
		System.out.println("A");

		

	}

}
