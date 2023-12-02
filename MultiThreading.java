package javaLab;
 import java.util.Random;

 class NumberManager{
	 private int generatedNumber;
	 private boolean IsNumberGenerated=false;
	 public synchronized void generateNumber() {
		 generatedNumber=new Random().nextInt(99)+2;
		 System.out.println("The generated Number="+generatedNumber);
		 IsNumberGenerated=true;
		 notifyAll();
		 }
	 public synchronized void printEvenNumber() throws InterruptedException {
		 while(!IsNumberGenerated || generatedNumber%2!=0) {
			 wait();
		 }
		 for(int i=2;i<=generatedNumber;i+=2) {
			 System.out.println((i*i)+" ");
		 }
		 IsNumberGenerated=false;
	 }
	 public synchronized void printOddNumber() throws InterruptedException {
		 while(!IsNumberGenerated || generatedNumber%2==0) {
			 wait();
		 }
		 for(int i=1;i<=generatedNumber;i+=2) {
			 System.out.println((i*i*i)+" ");
		 }
		 IsNumberGenerated=false;
	 }
 }
 
 class NumberGenerator extends Thread{
	 NumberManager numberManager;
	 public NumberGenerator(NumberManager numberManager){
		 this.numberManager=numberManager;
	 }
	 public void run() {
		 for(;;) {
		 numberManager.generateNumber();
		 try {
			 Thread.sleep(1000);
		 }catch(InterruptedException e){
			 e.printStackTrace();
		}
	 }
	 }
 }
 
 class EvenPrintThread extends Thread{
	 NumberManager numberManager;
	 public EvenPrintThread(NumberManager numberManager){
		 this.numberManager=numberManager;
	 }
	 public void run() {
		 for(;;) {
		 try {
			 numberManager.printEvenNumber();
		 }catch(InterruptedException e){
			 e.printStackTrace();
		}
	 }
	 }
 }
 
 class OddPrintThread extends Thread{
	 NumberManager numberManager;
	 public OddPrintThread(NumberManager numberManager){
		 this.numberManager=numberManager;
	 }
	 public void run() {
		 for(;;) {
		 try {
			 numberManager.printOddNumber();
		 }catch(InterruptedException e){
			 e.printStackTrace();
		}
	 }
	 }
 }
 
public class MultiThreading {
	public static void main(String[] args) {
		NumberManager numberManager=new NumberManager();
		EvenPrintThread evenPrintThread=new EvenPrintThread(numberManager);
		NumberGenerator numberGenerator=new NumberGenerator(numberManager);
		OddPrintThread oddPrintThread=new OddPrintThread(numberManager);
		numberGenerator.start();
		evenPrintThread.start();
		oddPrintThread.start();
	}
}
