
	public class JavaMultiThreadingThreadGroupExample implements Runnable {
		 public void run() {
		 System.out.println(Thread.currentThread().getName());
		 }
		 public static void main(String[] args) {
		 JavaMultiThreadingThreadGroupExample runnable = new 
		JavaMultiThreadingThreadGroupExample();
		 ThreadGroup myThreadGroup = new ThreadGroup("My Thread Group");
		 Thread t1 = new Thread(myThreadGroup, runnable, "My First Thread");
		 t1.start();
		 Thread t2 = new Thread(myThreadGroup, runnable, "My Second Thread");
		 t2.start();
		 Thread t3 = new Thread(myThreadGroup, runnable, "My Third Thread");
		 t3.start();
		 System.out.println("My Thread Group Name: " + myThreadGroup.getName());
		 myThreadGroup.list();
		 }
		}