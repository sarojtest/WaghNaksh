package JavaLearning;

public class LoopsConcept {

	public static void main(String[] args) {
		// while loop 1 to 10
		//while is used with set and counter initialisation is outside
		
		int i =1;                 //initialisation
		while (i<=10) {           //condition
			System.out.println(i);
			i++;                  //incremental/decremental
			
		}
		System.out.println("------");
		// 10 to 1
//		int x =10;
//		while (x>=1) {
//			System.out.println(x);
//		    x++ ;//  it gives infinite loop we have to break conditon
//			
//		}
		
//		while (true) {
//			System.out.println("Byee!!");
//			
//		}
		// initialise of counter is inside but not same with while
		// for loops:--- used in arrays $ arraylist based on indexing print 1 to 1
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
			
		}
//		for (; ; ) {
//			System.out.println("hiii");
//		}
		
		// do-while loop  print 10 to 1
		int p =10;
		do {
			System.out.println(p);
			p--;
		} while (p>=1);
		
		// print even nnos between 1 to 10
		System.out.println("-----------");
		System.out.println("even nos ");
		for (int z = 2; z <= 10; z++) {
			if (z%2==0) {
				System.out.println(z);
				
			}
			
		}
		System.out.println("-----------");
		System.out.println("odd nos ");
		for (int odd = 1; odd < 10; odd++) {
			if (!((odd%2)  ==0)) {
				System.out.println(odd);
			}
			
		}
		
	}
	}


