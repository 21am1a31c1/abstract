package abstract_;

class Circle extends Shapes {
    double radius;
    final static double pi=3.142; 
	@Override
	void collectData() {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius: ");
		radius = sc.nextDouble();
	}

	@Override
	void calculateData() {
		// TODO Auto-generated method stub
		area= pi*radius*radius;
	}

	@Override
	void displayData() {
		// TODO Auto-generated method stub
		System.out.println("The area of circle is : "+area);
	}
}
