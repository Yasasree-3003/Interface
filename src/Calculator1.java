
public interface Calculator1 {
	int a=10;
	void add();
	void sub();
}
//interface Calculatore2 implements Calculator1
//{
//	error Rule no 7;
//}
interface Calculator3 extends Calculator1
{
//	int a=10; Access here also;
//	void add();
//	void sub(); 
	void mul();//Rule no 8
	void div();//Rule no 8
}
interface Calculator4
{
	void add();
	void sub();
}
class SampleCode1 implements Calculator1  // Rule no 1
{

	@Override
	public void add() {
		System.out.println("Inside add method of Sample Code1");	
	}

	@Override
	public void sub() {
		System.out.println("Inside sub method of Sample Code1");
	}
}
class SampleCode2 implements Calculator1    // Rule no 1
{
	@Override
	public void add() {
		System.out.println("Inside add method of Sample Code2");	
	}
	@Override
	public void sub() {
		System.out.println("Inside sub method of Sample Code2");	
	}
}
class SampleCode3 implements Calculator1,Calculator3     // Rule no 6
{

	@Override
	public void mul() {
	
		System.out.println("Inside mul method of Sample Code3");
	}

	@Override
	public void div() {
		System.out.println("Inside div method of Sample Code3");		
	}

	@Override
	public void add() {
		System.out.println("Inside add method of Sample Code3");		
	}

	@Override
	public void sub() {
		System.out.println("Inside sub method of Sample Code3");		
	}
}
interface Calculator5
{
	// Rule 11:tagged interface
}
class SampleCode4
{
	void diplay()
	{
		System.out.println("Inside the display method");
	}
}
class SampleCode5 extends SampleCode4 implements Calculator1 // Rule no 12
{

	@Override
	public void add() {
		System.out.println("Inside add method of Sample Code5");
		
	}

	@Override
	public void sub() {
		System.out.println("Inside sub method of Sample Code5");		
	}
	
}
interface Calculator6
{
	void addition();
	void subtraction();
	// Rule no 14
	default void multiplication()
	{
		System.out.println("Inside multiplication method of Calculator6");
	}
	static void division()
	{
		System.out.println("Inside division method of Calculator6");

	}
}
abstract class SampleCode6 implements Calculator6
{
	// Rule no 15
	@Override
	public void multiplication()
	{
		System.out.println("Inside multiplication method of SampleCode6");

	}
}