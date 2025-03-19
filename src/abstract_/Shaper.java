package abstract_;

import java.util.Scanner;

interface  Shaper {
	void collectData();
	void calculateData();
	void displayData();
	Scanner sc = new Scanner(System.in);
}
