package JavaLearning;

import java.util.ArrayList;

public class Company {
	
	String name;
	String ceo;
	String product;
	long revenue;
	int empcount;
	static int holidayCount = 20;
	ArrayList<String> branchlist;
	
	// Constructor
	// name : Class name , cannot return any value , dont write any return type, looks like a function but
	//  not function
	 
	
	public Company(int a) {
		System.out.println("one param constructor " + a);
	}
	
	public Company(String name, String ceo, String product, long revenue, int empcount ) {
		this.name = name;
		this.ceo = ceo;
		this.product = product;
		this.revenue = revenue;
		this.empcount = empcount;
		
	}
	

	public Company(String name, String ceo, String product, long revenue, int empcount, ArrayList<String> branchlist) {
		this.name = name;
		this.ceo = ceo;
		this.product = product;
		this.revenue = revenue;
		this.empcount = empcount;
		this.branchlist = branchlist;
	}

	public Company(String name, String ceo, String product) {
		this.name =name;
		this.ceo = ceo;
		this.product = product;
	}

	public static void main(String[] args) {
		
		Company c1= new Company(10);
		Company c2 = new Company("Google", "Spichai", "Maps", 100000, 100);
		System.out.println(Company.holidayCount);
		Company c3 = new Company("MS", "Gates", "Azure");
		System.out.println(c3.name + " " +  c3.ceo + "  " + c3.product);
		
		ArrayList<String> branches = new ArrayList<String>();
		branches.add("Claifornia");
		branches.add("Bangalore");
		branches.add("London");
		Company comp1=new Company("Amazon", "Alex", "prime", 5000, 700, branches);
		System.out.println(comp1.name + " " + comp1.branchlist);

	}

}
