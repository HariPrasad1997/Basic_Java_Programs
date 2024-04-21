package array;

import java.util.Scanner;

public class DemoArray2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try(scan;) {
			try {
				Integer a[][] = new Integer[3][3];
				System.out.println("===Enter 3x3 matrics====");
				for(int i=0;i<3;i++) {
					for(int j= 0;j<3;j++) {
						a[i][j] = new Integer(scan.nextInt());
					} // Inner Loop
				}
				System.out.println("Display 3X3 Matrics");
				for(int i=0;i<3;i++) {
					for(int j= 0;j<3;j++) {
						System.out.print(a[i][j]+" ");
						System.out.println();
					} // Inner Loop
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
