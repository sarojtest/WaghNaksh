package JavaLearning;

public class ArrayConcept {

	public static void main(String[] args) {

		int i[] = new int [4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//to print all values we use for loop
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
			
		}
		
		String str[]= new String[4];
		str[0]="Java";
		str[1]="python";
		str[2]="ruby";
		str[3]="Andriod";
		
		
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]);
			
		}
		System.out.println("-----");
		//to store multiple type values we use Object[]
        Object ob[] = new Object[5];
        ob[0]= "Tom";
        ob[1]= 25;
        ob[2]=12.33;
        ob[3]=true;
        ob[4]='M';
        for (int z = 0; z < ob.length; z++) {
        	System.out.println(ob[z]);
			
		}
		
	}

}
