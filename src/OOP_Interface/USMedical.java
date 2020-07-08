package OOP_Interface;

public interface USMedical extends GHC{
	//Interface variables are by default static $ final in nature.
	
	 int min_fee =10;  //static and final
	
	
	public void orthoServices() ;
	
	public void physioService() ;
	
	public void NineOneOneServices() ;
	
	public void ENTServices(); 
	
	
	// note : after jdk 1.8 : method body is allowed in Interfaces
	
	// static method only is allowed with method body
	
	public static void bloodBank() {
		System.out.println("US---BloodBank");
		
	}
	// default method :
	default void FDA() {
		System.out.println("US------FDA");
		
	}
		
	

}
