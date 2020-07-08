package JavaLearning;

import java.util.ArrayList;
/**
 * 
 * @author saroj
 *
 */

public class FunctionsInJava {
	
	// cnanot create a function inside a function
	//Data members of a class : class vars and class methods
	
	// type :1   No input and no output i.e no params and nothing will return
	public void test() {
		System.out.println("test method---");
		
	}
	//type :2 No input but some return
	public int getNumber() {
		System.out.println("get Number");
		int a= 10;
		int b =20;
		int c= a+b;
		
		return c;
		
	}
	public String getTrainerName() {
		System.out.println("get trainer name");
		String trainerName = "Naveen";
		return trainerName;
		
		
	}
	//some input some return
	public int sum(int a, int b) {
		System.out.println("Sum method");
		int z =a+b;
		return z ;
		
		
		
	}
	// passing student name and will give the studentmarks
	public int getMarks(String studentName) {
		int marks = -1;
		System.out.println("get marks.." + studentName);
		if (studentName.equals("Saroj")) {
			 marks = 89;
		
		}
		else if (studentName.equals("Naveen")) {
			 marks = 95;
		
		}
		else if (studentName.equals("Vishal")) {
			 marks = 60;
		
		}
		else {
			System.out.println("Studentname not found" + studentName);
			//return marks;
		}
		return marks;
	
	}
	
	// param :browserName and return browsername
	public String launchApp(String browserName) {
		String name = null;
		if (browserName.equals("Chrome")) {
			System.out.println("launch chrome..");
			name = "Chrome";
			
		}
		else if (browserName.equals("Firefox")) {
			System.out.println("launch firefox");
			name = "Firefox";
			
		}
		else if (browserName.equals("IE")) {
			System.out.println("launch IE");
			name = "IE";
			
		}
		else {
			System.out.println("browser not found" + browserName);
			
		}
		return name;
		
	}
	/**
	 * This method returns marks
	 * @return
	 */
	// to store list of marks we use array ---
	public int[] getStudentMarks() {
		System.out.println("get student marks");
		int marks[] = new int[4];
		marks[0]= 70;
		marks[1]= 80;
		marks[2]= 40;
		marks[3]= 88;
		return marks;
	
	}
	// Pass the companyName and method will return the employeList of that Company:
	/**
	 * This methods returns an ArrayList Of string on basis of CompanyName
	 * @param companyName
	 * @return  returns an ArrayList Of string on basis of CompanyName
	 */
	public ArrayList<String> getEmployeeList(String companyName) {
		
		ArrayList<String>  companyList= new ArrayList<String>();
		
		if (companyName.equals("Google")) {
			companyList.add("Sundar");
			companyList.add("Mohan");
			companyList.add("Virat");
			companyList.add("Rohit");
		
		}
		else if (companyName.equals("IBM")) {
			companyList.add("Bibek");
			companyList.add("Anil");
			companyList.add("Manoj");
		}
		else if (companyName.equals("CTS")) {
			companyList.add("Naveen");
			companyList.add("Saroj");
			
		}
		else {
			System.out.println("company not found " + companyName);
		}
		return companyList;
		
		
		
	}
	
	
	public static void main(String[] args) {

	FunctionsInJava	obj = new FunctionsInJava();
	obj.test();
	int num =obj.getNumber();
	System.out.println(num);
	int sum =obj.sum(20, 30);
	System.out.println(sum);
	
	int score =obj.getMarks("Naveen");
	System.out.println(score);
	
	String launchBrowser =obj.launchApp("Chrome");
	System.out.println(launchBrowser);
		
	String launchBrowser1 =obj.launchApp("Opera");
	System.out.println(launchBrowser1);
	
 	int m[]= obj.getStudentMarks();
 	System.out.println(m.length);
 	System.out.println(m[3]);
 	
 	for (int i = 0; i < m.length; i++) {
 		System.out.println(m[i]);
		
	}
 	ArrayList<String> emplist=obj.getEmployeeList("CTS");
 	System.out.println(emplist);
		
	}

}
