package myproject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike myBike = new Bike();
		
		System.out.println(myBike.maker);
		System.out.println(myBike.name);
		System.out.println(myBike.year);
		System.out.println(myBike.color);
		System.out.println(myBike.price);
		
		System.out.println();
		
		myBike.drive();
		myBike.brake();
		
		
	}

}
