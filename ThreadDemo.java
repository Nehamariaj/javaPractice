package javaLab;

class oddThread extends Thread{
	public void run() {
		for(int i=1;i<10;i=i+2) {
			System.out.println("odd number");
			System.out.println(i+" ");
        }
    }
}

class evenThread extends Thread{
	public void run() {
		for(int i=2;i<10;i=i+2) {
			System.out.println("even number");
			System.out.println(i+" ");
        }
    }
}

public class ThreadDemo {
	public static void main(String [] args) {
		oddThread odd=new oddThread();
		evenThread even=new evenThread();
		odd.start();
		even.start();
	}
}
