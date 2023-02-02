import java.util.Scanner;

class InvalidCustomerException extends Exception{
	
}

class Atm{
	int userid=1212;
	int password=1111;
	int pw;
	int uid;
	public void input() {
		Scanner s= new Scanner(System.in);
		System.out.println(" Welcome to Ineuron Bank !!");
		System.out.println(" Kindly enter the UserID !");
		uid=s.nextInt();
		
		System.out.println(" Kindly enter the passoword");
		pw=s.nextInt();
		
	}
	
	public void verify() throws InvalidCustomerException{
		if((userid==uid)&& (password==pw)) 
		{
			
			System.out.println(" Take the cash !");
		}
		else {
			InvalidCustomerException ice = new InvalidCustomerException();
			System.out.println(ice.getMessage());
			throw ice;
			
		}
	}
	
}

class Bank{
	public void initiate() {
		Atm a = new Atm();
		try 
		{
		a.input();
		a.verify();
		}
		catch(InvalidCustomerException e) 
		{
			try 
			{
			a.input();
			a.verify();
			}
			catch(InvalidCustomerException ye) 
			{
				try 
				{
				a.input();
				a.verify();
				}
				catch(InvalidCustomerException ae) 
				{
					
					System.out.println(" Oh Choor  we caught you , your card is blocked !! !!");
					System.exit(0);
					
				}
				
			}
			
		}
		
	}
}
public class LaunchCustomException29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b = new Bank();
		b.initiate();

	}

}
