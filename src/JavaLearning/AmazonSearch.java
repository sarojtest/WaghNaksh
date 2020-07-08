package JavaLearning;

public class AmazonSearch {

	// Method overloading
	// same method name , different params , different types of params ,differnt
	// sequence of params
	public AmazonSearch() {
		// TODO Auto-generated constructor stub
	}

	public void search() {
		System.out.println("0 -params");

	}

	public void search(int a) {
		System.out.println("1 param" + a);

	}
	public void search(String test) {
		System.out.println("1 param" + test);

	}

	public void search(int a , int b) {

	}

	public void search(int c ,String d) {

	}
	public void search(String d,int c ) {

	}

	public static void main(String[] args) {
		AmazonSearch as = new AmazonSearch();
		as.search();
		as.search(10);
		as.search("Apple");

	}

}
