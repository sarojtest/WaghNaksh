package WebDriverArch;

public class Firefoxdriver implements WebDriver {
	
	public Firefoxdriver() {
		System.out.println("launch firefox");
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

}
