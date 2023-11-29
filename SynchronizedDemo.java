package javaLab;
import java.util.Scanner;
class Multiplication{
	synchronized void printTable(int num){
		//synchronized (this) {
		for(int i=1;i<=10;i++) {
			int product=num*i;
			System.out.println(num+"*"+i+"="+product);
		}
	}
}

class MyThread1 extends Thread{
	int num;
	Multiplication m;
	MyThread1(int num,Multiplication m){
		this.num=num;
		this.m=m;
	}
	public void run() {
		System.out.println("thread:"+Thread.currentThread().getPriority());
		m.printTable(num);
	}
}
class MyThread2 extends Thread{
	int num;
	Multiplication m;
	MyThread2(int num,Multiplication m){
		this.num=num;
		this.m=m;
	}
	public void run() {
		System.out.println("thread:"+Thread.currentThread().getPriority());
		m.printTable(num);
	}
}
public class SynchronizedDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Multiplication m=new Multiplication();
	System.out.println("Enter the number to print the 1st multiplication table: ");
	int num1=sc.nextInt();
	System.out.println("Enter the number to print the 2nd multiplication table: ");
	int num2=sc.nextInt();
	MyThread1 t=new MyThread1(num1,m);
	MyThread2 th=new MyThread2(num2,m);
	t.setPriority(1);
	th.setPriority(2);
	t.start();
	th.start();
}
}
