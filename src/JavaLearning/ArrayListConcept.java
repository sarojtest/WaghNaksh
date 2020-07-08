package JavaLearning;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList in java is a default class
		//dynamic array
		// will create the object of Arraylist
		
		ArrayList arr= new ArrayList();
		arr.add(100);
		arr.add(200);
		System.out.println(arr.size());
		
		arr.add(300);
		arr.add(400);
		arr.add(300);
		
		System.out.println(arr.size());
		arr.remove(4);
		System.out.println(arr.size());
		System.out.println(arr.get(3));
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
			
		}
		
	}

}
