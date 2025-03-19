package abstract_;

class Circle implements Shaper {
    double radius;
    double area;
    final static double pi=3.142; 
	@Override
	public void collectData(){
		// TODO Auto-generated method stub
		System.out.println("Enter the radius: ");
		radius = sc.nextDouble();
	}

	@Override
	public void calculateData() {
		// TODO Auto-generated method stub
		area= pi*radius*radius;
	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		System.out.println("The area of circle is : "+area);
	}
}
