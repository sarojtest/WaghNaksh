package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		try {
			obj.launchBrowser();
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	public void launchBrowser()throws ArithmeticException {
		System.out.println("LB");
		checkVersion();
	}
    public void checkVersion()throws ArithmeticException {
    	System.out.println("CV");
    	checkPlugin();
	}
    public void checkPlugin() throws ArithmeticException {
    	System.out.println("CP");
    	int i = 9/0;
		
	}
}
