package stringConstantPool;

//String is immutable - understanding the constant pool
public class Test {
	
	public static void main(String[] args) {
		//Heap & String Constant Pool
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = s2.concat(" World");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("******************************");
		s1 = "Moshe";
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println(s3);
		
		System.out.println("******************************");
	}
}