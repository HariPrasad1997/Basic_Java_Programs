package strings;

public class DemoString1 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		StringBuffer s3 = new StringBuffer(s1);
		StringBuffer s4 = new StringBuffer(s2);
		String s5 = s1.concat(s2); // here input should string type
		System.out.println(s5);
		String s7 = s3.append(s4).toString(); // here input should StringBuffer or StringBuilder
		System.out.println(s7);
		String s6 = 3 + 2 + "Hi" + +3 + 2 + "he";
		System.out.println(s6);
		System.out.println(s4);
	}

}
