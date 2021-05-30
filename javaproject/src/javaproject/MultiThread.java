//Multi threading by using Extend "thread" class 
package javaproject;

public class MultiThread extends Thread 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	public void display()
	{
		System.out.println("in display");
	}
	

}
class Execution
{
	public static void main(String args[])
	{
		MultiThread t=new MultiThread();
		t.display();//in the main thread
		t.start();//in the thread class
	}
}
