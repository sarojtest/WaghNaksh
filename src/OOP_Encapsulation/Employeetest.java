package OOP_Encapsulation;

public class Employeetest {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "Steve";
		e.setAge(45);
		System.out.println(e.getAge());
	}

}
