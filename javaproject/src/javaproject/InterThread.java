package javaproject;
class Q
{
	int num;
	boolean setValue=false;
	public synchronized void put(int num)
	{
		while(setValue)
		{
			try
			 {
				wait();
			 }
			catch(Exception e) {}
		}
		System.out.println("put:"+num);
		this.num=num;
		setValue=true;
		notify();//this is for producer
    }
	public synchronized void get()
	{
		while(!setValue)
		{
			try
			 {
				wait();
			 }
			catch(Exception e) {}
		}
		System.out.println("get:"+num);
		this.num=num;
		setValue=false;//this is for consumer
		notify();
    }
	
}
class Producer implements Runnable 
{
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t =new Thread(this,"Producer");
		t.start();
	}
	public void run()
	{
		int i=0;
		while(true) {
			q.put(i++);
			try {
				Thread.sleep(5000);
				}
			catch(Exception e) {}
			
			
		}
	}
	
}
class Consumer implements Runnable
{
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
    public void run()
    {
    	while(true)
    	{
    		q.get();
    		try
    		{
    			Thread.sleep(1000);
    		}
    		catch(Exception e){}
    	}
    }
	     
	
}
public class InterThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q=new Q();
		//Producer p=new Producer(q);
		//Consumer c=new Consumer(q);
		//we can also call like this
		new Producer(q);
		new Consumer(q);

	}

}
