package javaproject;
import java.io.*;
import java.util.*;
class Data
{
	int a ,b;
	 void evaluate()throws IOException
	{
		Scanner in =new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		if (b==0)
		throw new IOException("sorry");
		else
		{
			int c;
			c=a/b;
		 System.out.println(c);
		}
		
		
		
		
	}
}

public class ThrowExample extends Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d=new Data();
		
		d.evaluate();
		  

	}

}
