package JavaLearning;

public class Employee {

	// class variables:
	String name;
	int age;
	String role;
	int empId;
	boolean isPermanent;
	
	public static void main(String[] args) {

		//create the object of Employee class
		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age  = 25 ;
		e1.role ="QA";
		e1.empId =101;
		e1.isPermanent =false;
		
		Employee e2 = new Employee();
		e2.name = "Saroj";
		e2.age =30 ;
		e2.empId =707;
		e2.role = "SDET";
		e2.isPermanent= false;
		
		System.out.println(e1.name + "  " + e1.age + "  " + e1.role +" " + e1.empId);
		System.out.println(e2.name + "  " + e2.age + "  " + e2.role +" " + e2.empId);
		
		Employee e3 = new Employee();
		e3.name = "Nadia";
		e3.age = 37;
		e3.isPermanent = true ;
		System.out.println(e3.name);
		System.out.println(e3.age);
		System.out.println(e3.role);
		System.out.println(e3.empId);
		
		//create reference without reference :
		new Employee().name = "Saroj Jha";
		new Employee().age = 27;
		//System.gc();
		
		// null object refference:
//		Employee e5 = new Employee();
//		e5 = null;
//		e5.name ="Vishal";
//		//System.out.println(e5.name);
		
		
//		call the method of Loginpage
		LoginPage lp = new LoginPage();
		lp.login();
		lp.login(9543535);
		
		LoginPage.getuserDetails("Tom");
		
		Company comp = new Company("Apple", "Jobs", "MacBook", 10000, 1000);
       		
		


}
}