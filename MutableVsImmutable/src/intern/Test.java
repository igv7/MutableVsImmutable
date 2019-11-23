package intern;

//SCP - The intern() method
public class Test {
	public static void main(String[] args) {
		
		String s1 = "Kobi";
		String s2 = new String("Kobi");
		System.out.println("s1 == s2 : " + (s1==s2));
		
		//Intern
		String s3 = "Yaakov";
		String s4 = new String("Yaakov").intern();
		System.out.println("s3 == s4 : " + (s3==s4));

		
	}
}