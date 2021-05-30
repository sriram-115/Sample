package javaproject;
class ATM
{
	static float amount=1000;
	void enquiry()
	{
		System.out.println("the amount is="+amount);
	}
	void deposite(float a)
	{
		amount=amount+a;
		enquiry();
	}
	void withdraw(float a)
	{
		if(a>amount)
		{
			System.out.println("check once again");
		}
		else
		{
			amount=amount-a;
				if(amount<=500)
				{
					amount=amount+a;
					throw new ArithmeticException("min balance should be 500 so once check and withdrw again");
				}
				else
				{
					//amount=amount-a;
					enquiry();
				}
		
		}
			
	}
	static
	{
		System.out.println("welcome to ATM");
	}
}

public class staticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM a1=new ATM();
		a1.deposite(1000);
		ATM a2=new ATM();
		a2.enquiry();
		a2.withdraw(1000);
		

	}

}
