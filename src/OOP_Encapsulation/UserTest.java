package OOP_Encapsulation;

public class UserTest {

	public static void main(String[] args) {

		User u1 = new User();
		u1.setName("Saroj");
		System.out.println(u1.getName());
		u1.setAge(30);
		System.out.println(u1.getAge());
		u1.setPhone(954353);
		System.out.println("-------");
		System.out.println(u1.getName() + " " + u1.getAge() + " " + u1.getPhone());
		
		u1.getUserSalaryInfo();
	}

}
