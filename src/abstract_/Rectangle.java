package abstract_;

public class Rectangle extends Shapes{
	double length;
	double width;
	@Override
	void collectData() {
		System.out.println("Enter the length: ");
		length = sc.nextDouble();
		System.out.println("Enter the width: ");
		width = sc.nextDouble();
	}

	@Override
	void calculateData() {
		area=length*width;
	}

	@Override
	void displayData() {
		System.out.println("The area of Rectangle is : "+area);
		
	}

}
