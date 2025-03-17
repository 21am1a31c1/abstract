package abstract_;

import java.util.Scanner;

abstract class Shapes {
	abstract  void  collectData();
	abstract void calculateData();
	abstract void displayData();
	double area;
	Scanner sc = new Scanner(System.in);
}
