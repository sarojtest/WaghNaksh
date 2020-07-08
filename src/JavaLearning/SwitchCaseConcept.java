package JavaLearning;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		int i = 0;
		switch (i) {
		case 1:
			System.out.println("case ---1");
			break;

		case 2:
			System.out.println("case ---2");
			break;

		case 3:
			System.out.println("case ---3");
			break;

		case 4:
			System.out.println("case ---4");
			break;

		default:
			System.out.println("case not found --");
			break;
		}
		// launching browsers
		String browswerName = "Chrome";

		switch (browswerName) {
		case "Chrome":
           System.out.println("launch chrome");
			break;

		case "Firefox":
			System.out.println("launch firefox");
			break;

		case "IE":
         System.out.println("launchh Internet browser");
			break;

		default:
			System.out.println("browser not found "+ browswerName);
			break;
		}

	}

}
