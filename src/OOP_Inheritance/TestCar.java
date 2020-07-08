package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW bmw = new BMW();
		bmw.start();
		bmw.stop();
		bmw.refuel();
		bmw.autoParking();
		bmw.engine();
		
		System.out.println("------");
		Car car = new Car();
		car.start();
		car.stop();
		car.refuel();
		System.out.println("-----");
		Car car1 = new BMW(); // topcasting hild class obj can be reffered by parent class ref variable
		car1.start();
		car1.stop();
		car1.refuel();
		
		Vehicle v1 = new BMW();    // upcasting
		//car1.autofilling        cant be accessed due to shiled and refernece type check
		
		//downcasting is not possible in Java
//		 BMW bmw1=(BMW) new Car();  // possible in this way
//		 bmw1.refuel();
//		Car c2=(Car) new Vehicle(); // downcasting
//		BMW b2 = (BMW) new Vehicle(); // downcasting though compiles but runtime thrown an error
	}

}
