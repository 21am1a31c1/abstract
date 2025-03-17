package abstract_;

public class Triangle extends Shapes{
	double length;
	double base;
	@Override
	void collectData() {
		System.out.println("Enter the length: ");
		length = sc.nextDouble();
		System.out.println("Enter the base: ");
		base = sc.nextDouble();
		
	}

	@Override
	void calculateData() {
		area= 0.5*length*base;
	}

	@Override
	void displayData() {
		System.out.println("The area of Trinagle is : "+area);
	}

}
