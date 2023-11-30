package javaPractice;
import java.util.Random;//to generate random numbers

class NumberManager{
	private int generatedNumber;
	private boolean numberGenerated=false;
	public synchronized void generateNumber() {
		generatedNumber=new Random().nextInt(99)+2;
		System.out.println("Generated random number:"+generatedNumber);
		numberGenerated=true;
		notifyAll();//to notify all waiting threads that a number is generated
	}
	public synchronized void printEvenNumber() throws InterruptedException {
		while(!numberGenerated || generatedNumber%2!=0) {//i.e the number is not generated or the number generated is not even,we have to make the thread wait till the even number is generated
			wait();
		}
		for(int i=2;i<=generatedNumber;i+=2) {//if the number generated is even we get into the for loop
			System.out.println(i+" ");
		}
		numberGenerated=false;//we made the numberGenerated false so that a new number is generated after the even numbers are printed
	}
	public synchronized void printOddNumber() throws InterruptedException {
		while(!numberGenerated || generatedNumber%2==0) {//i.e the number is not generated or the number generated is not odd,we have to make the thread wait till an odd number is generated
			wait();
		}
		for(int i=1;i<=generatedNumber;i+=2) {//if the number generated is odd we get into the for loop
			System.out.println(i+" ");
		}
		numberGenerated=false;//we made the numberGenerated false so that a new number is generated after the odd numbers are printed
	}
}

class NumberGenerator extends Thread{
	NumberManager numberManager;
	public NumberGenerator(NumberManager numberManager) {
		this.numberManager=numberManager;
	}
	public void run() {
		numberManager.generateNumber();
		try {
			Thread.sleep(1000);;
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class EvenPrinterThread extends Thread{
	NumberManager numberManager;
	public EvenPrinterThread(NumberManager numberManager) {
		this.numberManager=numberManager;
	}
	public void run() {
		while(true) {
			try {
		       numberManager.printEvenNumber();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}
}
class OddPrinterThread extends Thread{
	NumberManager numberManager;
	public OddPrinterThread(NumberManager numberManager) {
		this.numberManager=numberManager;
	}
	public void run() {
		while(true) {
			try {
		       numberManager.printOddNumber();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}
}

public class OddOrEvenThread {
	public static void main(String[] args) {
		NumberManager numberManager=new NumberManager();
		NumberGenerator numberGenerator=new NumberGenerator(numberManager);
		EvenPrinterThread evenPrinterThread=new EvenPrinterThread(numberManager);
		OddPrinterThread oddPrinterThread=new OddPrinterThread(numberManager);
		numberGenerator.start();
		evenPrinterThread.start();
		oddPrinterThread.start();
	}
}
