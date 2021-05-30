package javaproject;
import java.util.*;


/*public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter n value");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
			for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}*/
//pattern 2
/*public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter n value");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/
//pattern 3
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter n value");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();  
    for (int i=1; i<= n ; i++) 
    { 
    for (int j = n; j > i ; j--)
    {
        System.out.print(" ");
    }
        System.out.print("*");
        for (int k = 1; k < 2*(i -1) ;k++) 
        { System.out.print(" ");
         }
         if( i==1)
          { 
          System.out.println("");
           }
           else 
           System.out.println("*");
    }
        for (int i=n-1; i>= 1 ; i--)
        {
        for (int j = n; j > i ; j--)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int k = 1; k < 2*(i -1) ;k++)
        {
            System.out.print(" ");
        }
        if( i==1)
            System.out.println("");
        else
            System.out.println("*");	
    }
		}
	}

/*public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        for (int i = 1; i <= 4; i++)
		        {
		            int n = 4;
		   
		            for (int j = 1; j<= n - i; j++)
		            { 
		            	System.out.print(" ");
		            }
		            for (int k = i; k >= 1; k--)
		            {
		                System.out.print(k);
		            }
		            for (int l = 2; l <= i; l++) 
		            { 
		            	System.out.print(l);
		            }
		        
		            System.out.println();
		        }
		            for (int i = 3; i >= 1; i--)
		            
		        {
		            int n = 3;
		   
		            for (int j = 0; j<= n - i; j++)
		            { 
		            	System.out.print(" ");
		            	} 
		            for (int k = i; k >= 1; k--)
		        
		            {
		                System.out.print(k);
		            }
		            for (int l = 2; l <= i; l++)
		            {
		                System.out.print(l);
		            }
		   
		            System.out.println();
		        }
		       
		    }
		}*/
		
//pattern 4
/*public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 5; i >= 0; i--)
		{
		   int alphabet = 65;
		   for (int j = 0; j <= i; j++)
		   {
		       System.out.print((char) (alphabet + j) + " ");
		   }
		   System.out.println();
		}
		for (int i = 0; i<= 5; i++)
		{
		   int alphabet = 65;
		   for (int j = 0; j <= i; j++)
		   {
		       System.out.print((char) (alphabet + j) + " ");
		   }
		   System.out.println();
		}
		}
		}*/
		 
		   
