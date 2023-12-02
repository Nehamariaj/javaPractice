package javaLab;

import java.util.Random;//to generate random numbers

class NumberManager1{
	private int generatedNumber;
	private boolean numberGenerated=false;
	public synchronized void generateNumber1() {
		generatedNumber=new Random().nextInt(99)+2;
		System.out.println("Generated random number:"+generatedNumber);
		numberGenerated=true;
		notifyAll();//to notify all waiting threads that a number is generated
	}
	public synchronized void printEvenNumber1() throws InterruptedException {
		while(!numberGenerated || generatedNumber%2!=0) {//i.e the number is not generated or the number generated is not even,we have to make the thread wait till the even number is generated
			wait();
		}
		for(int i=2;i<=generatedNumber;i+=2) {//if the number generated is even we get into the for loop
			System.out.println(i+" ");
		}
		numberGenerated=false;//we made the numberGenerated false so that a new number is generated after the even numbers are printed
	}
	public synchronized void printOddNumber1() throws InterruptedException {
		while(!numberGenerated || generatedNumber%2==0) {//i.e the number is not generated or the number generated is not odd,we have to make the thread wait till an odd number is generated
			wait();
		}
		for(int i=1;i<=generatedNumber;i+=2) {//if the number generated is odd we get into the for loop
			System.out.println(i+" ");
		}
		numberGenerated=false;//we made the numberGenerated false so that a new number is generated after the odd numbers are printed
	}
}

class Number extends Thread{
	NumberManager1 numberManager1;
	public Number(NumberManager1 numberManager1) {
		this.numberManager1=numberManager1;
	}
	public void run() {
		for(;;) {
		numberManager1.generateNumber1();
		try {
			Thread.sleep(1000);;
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}
class EvenPrinterThread1 extends Thread{
	NumberManager1 numberManager1;
	public EvenPrinterThread1(NumberManager1 numberManager1) {
		this.numberManager1=numberManager1;
	}
	public void run() {
		while(true) {
			try {
		       numberManager1.printEvenNumber1();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}
}
class OddPrinterThread1 extends Thread{
	NumberManager1 numberManager1;
	public OddPrinterThread1(NumberManager1 numberManager1) {
		this.numberManager1=numberManager1;
	}
	public void run() {
		while(true) {
			try {
		       numberManager1.printOddNumber1();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}
}

public class OddOrEvenThread {
	public static void main(String[] args) {
		NumberManager1 numberManager1=new NumberManager1();
		Number number=new Number(numberManager1);
		EvenPrinterThread1 evenPrinterThread1=new EvenPrinterThread1(numberManager1);
		OddPrinterThread1 oddPrinterThread1=new OddPrinterThread1(numberManager1);
		number.start();
		evenPrinterThread1.start();
		oddPrinterThread1.start();
	}
}