package javaproject;
import java.io.FileInputStream;
import java.io.IOException;
class Multi
{
	public static void main(String args[] )throws IOException
	{
		FileInputStream s=new FileInputStream("C:\\file1.txt");
		int t=0;
		while ((t=s.read())!=-1)
		{
			System.out.println((char)t);
		}
		s.close();
		
	}
}
