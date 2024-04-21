package thread;

class Mythread extends Thread {

	@Override
	public void run() {
		System.out.println("Thread1 is running..");
		super.run();
	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread2 is running");

	}

}

public class ThreadDemo {
	public static void main(String[] args) {
		Mythread mythread = new Mythread();
		mythread.run();
		Thread runnable = new Thread(new MyRunnable());
		runnable.run();

	}

}
