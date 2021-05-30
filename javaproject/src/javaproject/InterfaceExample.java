package javaproject;

public interface InterfaceExample {
	int l=2,b=3;
	int rectArea(int l,int b);
	int squareArea(int s);
	//we can also define the function body in interface by using default key word
	default void print() {
		System.out.println("i am in interface");
	}
	}
class ImpleInter implements InterfaceExample
{
	public int rectArea(int l,int b)
	{
		return(l*b);
	}
	public int squareArea(int s)
	{
		return(s*s);
	}
	public static void main(String args[])
	{
		ImpleInter obj=new ImpleInter();
		System.out.println(obj.rectArea(l,b));
		System.out.println(obj.squareArea(b));
		obj.print();
		
	}
}
