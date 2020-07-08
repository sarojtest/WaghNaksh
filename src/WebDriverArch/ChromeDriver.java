package WebDriverArch;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		System.out.println("launch google chrome");
	}

	@Override
	public void get(String url) {
       System.out.println("launching  url " + url);		
	}

	@Override
	public void findElement(String element) {
		System.out.println("finding element " + element);
		
	}

	@Override
	public String getTitle() {
		System.out.println("get the page title");
		return "google";
		
	}
	// own methods
	public void addPlugin() {
		System.out.println("chrome ---plugin");
		
	}

}
