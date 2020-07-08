package OOP_Abstract;

public abstract class Page {
	
	public Page() {
		System.out.println(" page default constructor..");
	}
	public Page(int i) {
		System.out.println("1 param constructor.." + i);
	}
	
	
	public abstract void header(String header);
	public abstract void title(String title);
	
	public void search() {
		System.out.println("Page---search");
	}
	
	
	//cant create the object of abstract class

}
