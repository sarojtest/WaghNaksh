package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		
		try {
			throw new Exception("SAROJEXCEPTION");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
