package javaproject;
import java.util.Scanner;
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a[];
		Scanner in =new Scanner(System.in);
		n=in.nextInt();
		a=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for (int i=0;i<n;i++)
			for (int j=0;j<n-1-i;j++)
			{
				if (a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		for (int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}

}
