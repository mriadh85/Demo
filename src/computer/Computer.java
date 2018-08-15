package computer;

public class Computer {
	String computerModel = "Macbook Air";
	int ramSizeInGb = 4;
	int memorySize = 128;
	
	public void printModel() {
		System.out.println(computerModel);
	}
	
	public void ramRequired () {
		while (ramSizeInGb < 8) {
			System.out.println("Your RAM size is not adequate");
			break;
		}
	}

}
