class Account1{
	
	private int acno;
	private String aname;
	private String atype;
	
	public int getAcno() {
		return acno;
	}
	
	public void setAcno(int acno) {
		this.acno = acno;
	}
	
	public String getAname() {
		return aname;
	}
	
	public void setAname(String aname)
	{
		this.aname = aname;
	}
	public String getAtype()
	{
		return atype;
	}
	
	public void setAtype(String atype)
	{
		this.atype = atype;
	}
	
	
}

class Employee1{
	
	private String ename;
	private int eid;
	private String address;
	
	Account1 account1;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	

	public void setEid(int eid) {
		this.eid = eid;
	}

	

	public void setAddress(String address) {
		this.address = address;
	}


	public void setAccount1(Account1 account1) {
		this.account1 = account1;
	}
	
	public void getDetails() 
	{
		System.out.println(" Employee details !!!");
		System.out.println();
		System.out.println(" Employee id is "+eid);
		System.out.println("Employee name is :  "+ ename);
		System.out.println("Employee city is : "+address );
		System.out.println("-------------------------");
		System.out.println("Account number is : "+account1.getAcno());
		System.out.println("Acoount name is : "+ account1.getAname());
		System.out.println("Acoount name is : "+ account1.getAtype());
	}
	
	
	
	
}


public class OneToOneUsingSetter {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
            Account1 account1 = new Account1();
            account1.setAcno(1000);
            account1.setAname(" ghar  !!");
            account1.setAtype("Savings !");
		
		//  Constructor injection
            Employee1 employ1=new Employee1();
            employ1.setEid(201);
            employ1.setEname("Revi ");
            employ1.setAddress("Chenni ");
            employ1.setAccount1(account1);
            employ1.getDetails();
            
		
		

	}

}
