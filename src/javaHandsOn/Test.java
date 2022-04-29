package javaHandsOn;

public class Test extends Practice {
	String color="black";
	public void a1()
	{
		System.out.println("Inside of a1");
	}

	public static void main(String[] args) {
		
			Practice a = new Test();
			//forecefully Downcasting 
			//Test t=(Test)a;
			//t.a1();
			a.a1();
			a.a2();
			System.out.println(a.color);
	       
		}
	}


