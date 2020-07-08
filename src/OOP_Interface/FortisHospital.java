package OOP_Interface;

public class FortisHospital extends WHO implements USMedical ,UKMedical ,IndianMedical {

	 @Override
	public void FDA() {
		System.out.println("FDA---services");
		//USMedical.super.FDA();
	}
	
	@Override
	public void birthControl() {
		System.out.println("coming from GHC grandparent");
		
	}

	
	@Override
	public void orthoServices() {
     System.out.println("Fortis ----OrthoSerices");		
	}

	@Override
	public void physioService() {
     System.out.println("Fortis ---physioServices");
		
	}

	@Override
	public void NineOneOneServices() {
     System.out.println("Fortis ---NineOneOneServices");		
	}

	@Override
	public void emergencyServices() {
		 System.out.println("Fortis ---emegencyServices");
		
	}

	@Override
	public void oncologyServices() {
		 System.out.println("Fortis ---oncologyServices");
		
	}

	@Override
	public void pathologyServices() {
		 System.out.println("Fortis ---pathologyServices");
		
	}

	@Override
	public void oPTServices() {
		 System.out.println("Fortis ---opTServices");
		
	}

	@Override
	public void cardioServices() {
		 System.out.println("Fortis ---cardioServices");
		
	}
	//own methods of Fortis (or non overriden methods)
	
	public void gynecServices() {
		System.out.println("Fortis ---gynecServices");
		
	}
	public void medicalInsuranceServices() {
		System.out.println("Fortis ---medicalInsuranceServices");

	}
	public void neuroServices() {
		System.out.println("Fortis ---neuroServices");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("Fortis ---ENTServices");
		
	}

	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		
	}

	
}
