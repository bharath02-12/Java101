import java.util.Scanner;
class UnderAgeException extends Exception{

	public UnderAgeException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
	
	
}

class OverAgeException extends Exception{

	public OverAgeException(String string) {
		// TODO Auto-generated constructor stu0
		super(string);
	}

	
}
class Applicant{ 
   int age ;
   public void input()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println(" Please enter ypur Age !");
	   age=sc.nextInt();
   }
   public void verify() throws UnderAgeException,OverAgeException {
	   if(age<18) 
	   {
		   UnderAgeException ua= new UnderAgeException(" Arye Bachhaa !");
		   System.out.println(ua.getMessage());
		   throw ua;
		   
	   }
	   else if (age>60) {
		   OverAgeException oa= new OverAgeException(" Your time is near  !");
		   System.out.println(oa.getMessage());
		   throw oa;
		   
	   }
	   else {
		   System.out.println(" You are eligable !!");
		   
	   }
	   
   }
}
class Rto{
	public void initiate() 
	{
		Applicant app = new Applicant();
		
		
		try{
			app.input();
			app.verify();
		  }
		catch(UnderAgeException|OverAgeException  o ) {
			System.out.println(" You are not eligable !!");
		}
		
		/*
		catch(UnderAgeException e) 
		 {
			System.out.println(" Your age is beloew 18 Sorry !!");
		}
		catch(OverAgeException o)
		{
			System.out.println(" Your age is ABove 60 Sorry !!");
			
		}
		
		*/
	}
}

public class LaunchRTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rto r = new Rto();
		r.initiate();
		

	}

}
