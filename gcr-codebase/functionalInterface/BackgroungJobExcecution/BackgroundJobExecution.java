package functionalInterface.BackgroungJobExcecution;

public class BackgroundJobExecution {

	public static void main(String[] args) {
		Runnable r = () ->{
			System.out.println("background thread is running");
			try {
				Thread.sleep(4000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("background thread executed");
		};
		
		Thread thread = new Thread(r);
		thread.start();
		System.out.println("Main thread..");
		
	}
}
