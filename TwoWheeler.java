package week1.day1;

public class TwoWheeler {

	int noOfWheels  = 4;
	short noOfMirrors = 2;
	long chassisNumber = 87655678;
	boolean isPunctured = false;
	String bikeName = "Discover";
	double runningKM = 123.45;
	public static void main (String[] args) {
	
		TwoWheeler two= new TwoWheeler();
		System.out.println("My Bike Details");
		System.out.println("No of Wheels = " +two.noOfWheels);
		System.out.println("No of Mirrors = " +two.noOfMirrors);
		System.out.println("ChassisNumber = " +two.chassisNumber);
		System.out.println("Is Punctured = " +two.isPunctured);
		System.out.println("Running KM = " +two.runningKM);
		System.out.println("Bike Name = " +two.bikeName);
	
	}
	
}