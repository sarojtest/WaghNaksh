package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fs = new FortisHospital();
		
		fs.cardioServices();
		fs.orthoServices();
		fs.emergencyServices();
		fs.medicalInsuranceServices();
		
		fs.pandemicServices();
		fs.virusvaccination();
		
		fs.polioServices();     // Multilevel inheritance , grandparent properties can access
		
		fs.birthControl();      // coming from grantparent interface
		
		USMedical.bloodBank();  // static method
		
		System.out.println(USMedical.min_fee);
		// We can access Uk interface via upcasting but refernce check will be strictly applied here.
		
		USMedical us=new FortisHospital();
		us.orthoServices();
		us.physioService();
		us.ENTServices();
		us.NineOneOneServices();
		us.birthControl();          // since us is extending so reference type check pass and can be accessed.
		
	 // It cant access other any methods apart from his own methods, due to refernce check concept.
		//downcasting is never possible since we not able to create object.
		
		IndianMedical im= new FortisHospital();
		im.cardioServices();
		im.oPTServices();
		im.physioServices();
		im.pathologyServices();
		
		
	}

}
