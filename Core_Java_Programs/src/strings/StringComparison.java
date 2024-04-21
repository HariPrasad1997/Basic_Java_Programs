package strings;

public class StringComparison {
	public static void main(String[] args) {
		String s1 = new String("sachin");
		String s3 = new String("sachin");
		String s2 = "sachin";
		if (s1 != s3) {
			System.out.println("Bot are referening to different locations" + s1 == s2);
		}
		if (s1.equals(s2)) {
			System.out.println("Both strings content is same: " + s1.equals(s3));
		}

		StringComparison sc1 = new StringComparison();
		StringComparison sc2 = new StringComparison();
		System.out.println(sc1.hashCode() + " " + s3.hashCode());
		System.out.println(sc1.equals(sc2));
		sc1 = null;
		System.out.println("garbage collector collects unreferenced object");
		System.gc();
		System.out.println("hello  " + sc1);

	}

}
