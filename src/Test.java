
public class Test {

	public static void main(String[] args) {
		//Calculator1 c1=new Calculator1();//error Rule no 4
		Calculator1 c2;// Accepted as reference
		//Rule no 5
		Calculator1 c3=new Calculator1()
				{

					@Override
					public void add() {
						System.out.println("Inside add method of Calculator1");

					}

					@Override
					public void sub() {
						System.out.println("Inside sub method of Calculator1");
						
					}
				};  // Rule no 13
				c3.add();
				c3.sub();
	}

}
