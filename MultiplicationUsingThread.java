package javaLab;
import java.util.Scanner;

class Multiplication{
	synchronized void printTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
}

class Thread1 extends Thread{
	int num;
	Multiplication multi;
	Thread1(int num,Multiplication multi) {
		this.num=num;
		this.multi=multi;
	}
	public void run() {
		multi.printTable(num);
		System.out.println();
	}
}

class Thread2 extends Thread{
	int num;
	Multiplication multi;
	Thread2(int num,Multiplication multi) {
		this.num=num;
		this.multi=multi;
	}
	public void run() {
		multi.printTable(num);
		System.out.println();
	}
}

class Thread3 extends Thread{
	int num;
	Multiplication multi;
	Thread3(int num,Multiplication multi) {
		this.num=num;
		this.multi=multi;
	}
	public void run() {
		multi.printTable(num);
		System.out.println();
	}
}

public class MultiplicationUsingThread {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Multiplication multi=new Multiplication();
		System.out.print("Enter the table you want to run by thread1:");
		int num1=sc.nextInt();
		System.out.print("Enter the table you want to run by thread2:");
		int num2=sc.nextInt();
		System.out.print("Enter the table you want to run by thread3:");
		int num3=sc.nextInt();
		Thread1 t1=new Thread1(num1, multi);
		Thread2 t2=new Thread2(num2, multi);
		Thread3 t3=new Thread3(num3, multi);
		t1.start();
		t2.start();
		t3.start();
	}
}

