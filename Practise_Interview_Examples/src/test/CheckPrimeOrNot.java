package test;

public class CheckPrimeOrNot {
	public static void main(String[] args) {
		int number = 6;
		System.out.println(isPrime(number));
		int limit = 100;
		printPrime(limit);
	}

	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	private static void printPrime(int limit) {
		for (int num = 2; num <= limit; num++) {
//			System.out.println("Prime numbers between 1 and " + limit + " are:");
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(num + " ");
			}
		}

	}
}
