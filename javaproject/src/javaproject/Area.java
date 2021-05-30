package javaproject;

public abstract class Area {
   abstract int rect(int l,int b);
   int square(int a)
   {
	   return (a*a);
   }

}
class Find extends Area
{
	int rect(int l,int b)
	{
		return(l*b);
	}
	public static void main(String args[])
	{
		Area f=new Find();
	    System.out.println(f.square(3));
	    System.out.println(f.rect(2,3));
	}
}
