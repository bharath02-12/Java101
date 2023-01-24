

class Employeee{
	 String eid1;
	 String ename1;
	 String eaddrr1;
	public Employeee(String eid1, String ename1, String eaddrr1) {
		super();
		this.eid1 = eid1;
		this.ename1 = ename1;
		this.eaddrr1 = eaddrr1;
	}
	
	
}


// Target Obj
class Department{
	private String did;
	private String dname;
	// HAS-A Variable 
	private Employeee[] emp;// Many ---> Arrays
	
	// constructor injections 
	public Department(String did, String dname, Employeee[] emp) {
		super();
		this.did = did;
		this.dname = dname;
		this.emp = emp;
	}
	
	public void getDepartmentDetails() 
	
	{
		System.out.println("Department Details !!");
		System.out.println("-------------");
		System.out.println(" Department Id : "+did);
		System.out.println(" Department Name : "+dname);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();
		System.out.println(" Employee details are  ");
		System.out.println("------------------");
		
		for( Employeee employeee:emp) {
			
			System.out.println(" Employee id ::" + employeee.eid1);
			System.out.println(" Employee name ::" + employeee.ename1);
			System.out.println(" Employee address ::" + employeee.eaddrr1);
			System.out.println(" ==================================");
			
			
		}
		
		
	}
	
	
}
public class OneToManyAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employeee ep1=new Employeee("10","Sachin","MI");
		Employeee ep2=new Employeee("9","Varit","Delhi");
		Employeee ep3=new Employeee("20","Rayudu","Hyd");
		Employeee ep4=new Employeee("12","PAAJI","Punjab");
		Employeee ep5=new Employeee("11","Yuvi","Panjab");
		
		// Create employe array :
		
		Employeee[] emp=new Employeee[5];
		
		// Set values 
		
		emp[0]=ep1;
		emp[1]=ep2;
		emp[2]=ep3;
		emp[3]=ep4;
		emp[4]=ep5;
		
		// Constructor Injection : 
		Department dep =new Department("IPL","BCCI",emp);
		dep.getDepartmentDetails();
		
		
		
		
		
		
		
		
		

	}

}
