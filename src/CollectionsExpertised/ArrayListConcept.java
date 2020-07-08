package CollectionsExpertised;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		ArrayList ar=new ArrayList();
		
		ar.add("saroj");
		ar.add(1, 2);
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		
		Employee e1= new Employee("saroj", 31, "QA");
		Employee e2= new Employee("virat", 20, "Cricket");
		Employee e3= new Employee("rastogi", 61, "Dev");


		
		ArrayList<Employee >ar2=new ArrayList<Employee>();
		ar2.add(e1);
		ar2.add(e3);
		ar.add(e2);
		
		Iterator<Employee> it=ar2.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
		

	}

}
