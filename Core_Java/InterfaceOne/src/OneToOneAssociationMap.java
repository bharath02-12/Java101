

// Dependednt ready 
class Account{
	 String accno;
	 String accname;
	 String acctype;
	 // Constructor 
	public Account(String accno, String accName, String accType) {
		super();
		this.accno = accno;
		this.accname = accName;
		this.acctype = accType;
	}
	
	
}
// Target Obj
class Employee{
	private String eid;
	
	private String ename;
	

	private String eaddrr;
	
	// HAS-A relationship
	Account account;

	// Constructor
	public Employee(String eid, String ename, String eaddrr, Account account) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddrr = eaddrr;
		this.account = account;
	}
	
	
	public void getEmployeDetails() 
	{
		System.out.println("Employee details are ");
		
		System.out.println(" EMPID :: "+eid);
		System.out.println(" EMPName :: "+ename);
		System.out.println(" EMe :: "+eaddrr);
		System.out.println("-----------------------------");
		System.out.println(" Account details ");
		// To access the account details ---> They are private variables 
		// Usually by getters we access the private variable 
		// we can remove private to get account details 
		
		System.out.println("ACCNO : "+account.accno);
		System.out.println(" ACCName :  "+account.accname);
		System.out.println("AccType : "+account.acctype);
		
	
	}
	
	
	
}


public class OneToOneAssociationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First account obj need to be created : 
		
		
		Account account = new Account("ABC123","sachin","Savings !");
		
		//  Constructor injection
		Employee employee=new Employee("IND10","sachin","MI",account);
		
		employee.getEmployeDetails();
		
		
		

	}

}
