package javaproject;

class Extension {

		private int length,breadth;
		void read(int l,int b)
		{
			
			length=l;
			breadth=b;
		}
		int area()
		{
			return (length*breadth);
		}
		
}
class Encapsulation 
{
	public static void main(String args[])
	{
		Extension e1=new Extension();
		e1.read(2, 3);
		System.out.println(e1.area());
	}
}
