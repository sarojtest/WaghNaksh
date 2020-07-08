package OOP_Encapsulation;

public class Browser {

	private String name;
	private int version;

	public void launchBrowser(String browserName) {
		interactWithOs(browserName);
		System.out.println("browser is launched " + browserName);
	}

	private void interactWithOs(String browserName) {
		checkRamSpace(browserName);
		
	}

	private void checkRamSpace(String browserName) {
		checkBrowserSetupFiles(browserName);
	}
	private void checkBrowserSetupFiles(String browserName) {
		checkLatestVerion(browserName);
	}
	private void checkLatestVerion(String browserName) {
		System.out.println("browser is found" + browserName);
		
	}

}
