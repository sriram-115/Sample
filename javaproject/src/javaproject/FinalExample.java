package javaproject;

public abstract class FinalExample {
	final int l=5;
	int b=5;
	final void area()
	{
		System.out.println("area is="+(l*b));
	}
	abstract void show();
	

}
class Rarea extends FinalExample
{
	void show()
	{
		super.b=10;
		System.out.println("area is="+l*b);
	}
	public static void main(String args[])
	{
		Rarea r=new Rarea();
		r.area();
		r.show();
	}
}
