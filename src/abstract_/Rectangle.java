package abstract_;

public class Rectangle implements Shaper{
	double length;
	double width;
	double area;
	@Override
	public void collectData() {
		System.out.println("Enter the length: ");
		length = sc.nextDouble();
		System.out.println("Enter the width: ");
		width = sc.nextDouble();
	}

	@Override
	public void calculateData() {
		area=length*width;
	}

	@Override
	public void displayData() {
		System.out.println("The area of Rectangle is : "+area);
		
	}

}
