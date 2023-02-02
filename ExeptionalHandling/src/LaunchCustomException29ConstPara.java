import java.util.Scanner;

class InvalidCustomerException1 extends Exception
{

	public  InvalidCustomerException1(String msg) 
	{
		super(msg);//---> Pass the msg to super class Exception --> It will pass to Throwable , It is set message and getter to get message 
	}
	
}

class Atm1{
	int userid=1212;
	int password=1111;
	int pw;
	int uid;
	public void input1() {
		Scanner s= new Scanner(System.in);
		System.out.println(" Welcome to Ineuron Bank !!");
		System.out.println(" Kindly enter the UserID !");
		uid=s.nextInt();
		
		System.out.println(" Kindly enter the passoword");
		pw=s.nextInt();
		
	}
	
	public void verify1() throws InvalidCustomerException1{
		if((userid==uid)&& (password==pw)) 
		{
			
			System.out.println(" Take the cash !");
		}
		else {
			InvalidCustomerException1 ice1 = new InvalidCustomerException1(" Are you sure !!");
			//System.out.println(ice1.getMessage());
			throw ice1;
			
		}
	}
	
}

class Bank1{
	public void initiate() {
		Atm1 a1 = new Atm1();
		try 
		{
		a1.input1();
		a1.verify1();
		}
		catch(InvalidCustomerException1 e) 
		{
			try 
			{
			a1.input1();
			a1.verify1();
			}
			catch(InvalidCustomerException1 ye) 
			{
				try 
				{
				a1.input1();
				a1.verify1();
				}
				catch(InvalidCustomerException1 ae) 
				{
					
					System.out.println(" Oh Choor  we caught you , your card is blocked !! !!");
					System.exit(0);
					
				}
				
			}
			
		}
		
	}
}
public class LaunchCustomException29ConstPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank1 b1 = new Bank1();
		b1.initiate();

	}

}
