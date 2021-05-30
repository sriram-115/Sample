package javaproject;

public class ExceptionHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=6;
		b=3;
		int arr[]= {1,2,5,6,7};
		try
		{
			c=a/b;
			System.out.println("the value is"+c);
			System.out.println(arr[2]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("the error is"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("hello");
		}


	}

}
