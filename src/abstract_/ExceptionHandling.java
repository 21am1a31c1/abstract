package abstract_;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator");
		int num=sc.nextInt();
		System.out.println("Enter the denominator");
		int deno=sc.nextInt();
		int res=num/deno;
		System.out.println(res);
	}
catch(Exception e) {
System.out.println("Exception handled");
}
}
}
