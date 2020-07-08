package JavaLearning;

public class Student {
	
	String name;
	int age;
	int id;
	
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public static void main(String[] args) {
		
		Student s1 = new Student("Saroj", 31, 107);
		Student s2 = new Student("janki", 33, 205);
		Student s3 = new Student("Suresh", 40, 505);

		System.out.println(s1.name + " " + s1.id + " " + s1.age);
		System.out.println(s2.name + " " + s2.id + " " + s2.age);
		System.out.println(s3.name + " " + s3.id + " " + s3.age);
		System.out.println("------------");
		
		//Reference Change
		s1=s2;
		System.out.println(s1.name + " " + s1.id + " " + s1.age);
		System.out.println(s2.name + " " + s2.id + " " + s2.age);
		System.out.println(s3.name + " " + s3.id + " " + s3.age);
		
		s2=s3;
		System.out.println("-----------");
		System.out.println(s1.name + " " + s1.id + " " + s1.age);
		System.out.println(s2.name + " " + s2.id + " " + s2.age);
		System.out.println(s3.name + " " + s3.id + " " + s3.age);
		
		s3=s1;
		System.out.println("-----------");
		System.out.println(s1.name + " " + s1.id + " " + s1.age);
		System.out.println(s2.name + " " + s2.id + " " + s2.age);
		System.out.println(s3.name + " " + s3.id + " " + s3.age);
		
		



		
	}

	
	

}
