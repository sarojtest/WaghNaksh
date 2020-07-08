package OOP_Encapsulation;

public class Employee {
	
	public String name;
	private int age;
	
	public void getCity() {
		System.out.println("get city method--");
		
	}
	private void getCountry() {
		System.out.println("get country method");
		
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "Tom";
		e.age = 30;
		System.out.println(e.name + "  " + e.age);
		
		e.getCity();
		e.getCountry();
	}

}
