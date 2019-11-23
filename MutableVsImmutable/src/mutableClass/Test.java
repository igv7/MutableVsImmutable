package mutableClass;

public class Test {

	public static void main(String[] args) {

		//A is mutable class
		A a = new A();
		System.out.println(a);
		a.x = 4;
		a.y = 125;
		System.out.println(a);
		
	}

}