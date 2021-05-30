package javaproject;
class ExampleThread implements Runnable
{
	public void run()
	{
		for (int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	
		public void display()
		{
			for (int i=0;i<=5;i++)
			System.out.println("hello");
		}
}
class MyThreadByRunnalbe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleThread t=new  ExampleThread();
		t.display();
		Thread t1=new Thread(t);
		t1.start();
		t.run();//it calls just like a method
		System.out.println("priority of"+t1.getPriority());

	}

}
