package firstProgram;

public class DemoVariables {
	static int a = 5;
	int b = 10;
	
	public static void main(String[] args) {
		int c = 15;
		int d = 10;
		int e = c + d;
		System.out.println("Local Variables: "+e);
		System.out.println("Static variable: "+a);
		DemoVariables dv = new DemoVariables();
		System.out.println("Instnace Variable: "+dv.b);
		
	}

}
