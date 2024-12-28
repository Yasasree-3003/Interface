import java.util.Scanner;

public class Rectangle implements Shapes{
double Area;
double length;
double breadth;
	@Override
	public void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:");
		length=sc.nextDouble();
		System.out.println("Enter the breadth of Rectangle:");
		breadth=sc.nextDouble();
		
	}

	@Override
	public void calculateData() {
		Area=(length)*(breadth);	}

	@Override
	public void display() {
		System.out.println("The Area of Rectangle is :"+Area);
	}

}
