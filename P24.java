public class P24 extends Thread {
 public void run() {
 for (int i = 1; i < 4; i++) {
 try {
 Thread.sleep(1000);
 Thread.currentThread().interrupt();
 } catch (InterruptedException e) {
 System.out.println(e);
 }
 System.out.println(i);
 }
 }
 public static void main(String args[]) {
 P24 myThread1 = new 
P24();
 P24 myThread2 = new 
P24();
 myThread1.start();
 myThread2.start();
 }
} 