import java.util.Scanner;

public class Circle implements Shapes {
double pi=3.1467;
double radius;
double Area;
	@Override
	public void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		radius = sc.nextDouble();
		
	}
	@Override
	public void calculateData() {
		Area=pi*radius*radius;	
	}

	@Override
	public void display() {
		System.out.println("The Area of Circle is :"+Area);			
	}

}
