import java.util.Scanner;

public class Square implements Shapes{
double Area;
double side;
	@Override
	public void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of Square:");
		side=sc.nextDouble();
		
	}

	@Override
	public void calculateData() {
		Area=side*side;
		
	}

	@Override
	public void display() {
		System.out.println("Area of Square is:"+Area);
		
	}

}
