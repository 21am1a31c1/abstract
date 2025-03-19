package abstract_;

public class Triangle implements Shaper{
	double length;
	double base;
	double area;
	@Override
	public void collectData() {
		System.out.println("Enter the length: ");
		length = sc.nextDouble();
		System.out.println("Enter the base: ");
		base = sc.nextDouble();
		
	}

	@Override
	public void calculateData() {
		area= 0.5*length*base;
	}

	@Override
	public void displayData() {
		System.out.println("The area of Trinagle is : "+area);
	}

}
