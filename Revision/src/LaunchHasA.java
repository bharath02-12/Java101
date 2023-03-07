class University{
	String universiryName;
	int est;
	String founder;
	int area;
	int totalStudents;
	
	Department[] dep;

	public University(String universiryName, int est, String founder, int area, int totalStudents, Department[] dep) {
		
		this.universiryName = universiryName;
		this.est = est;
		this.founder = founder;
		this.area = area;
		this.totalStudents = totalStudents;
		this.dep = dep;
	}
	

	
	public void display() {
		System.out.println(" Welceom to University "+universiryName+"  which is Estabilieshed in "+est+" By the Great "+founder+" , in  "+area+"acers  now it have around "+totalStudents+" ******with total departments "+dep.length);
		
		System.out.println();
		System.out.println(" Depatment Details are :: ");
		
		for(Department d:dep) 
		{
			System.out.println(" The department is "+d.depName+", Head of the Departmemt is "+d.deoHead+", and total staff is "+d.totalStaff);
			
		}
	}
	
	
}

class Department{
	
	String depName;
	String deoHead;
	int totalStaff;
	public Department(String depName, String deoHead, int totalStaff) 
	{
		
		this.depName = depName;
		this.deoHead = deoHead;
		this.totalStaff = totalStaff;
	}
	
	
}
public class LaunchHasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department[] dep = new Department[4];
		
		
		Department d1= new Department("Computer Science"," Zargham ",40);
		Department d2= new Department(" Management "," Joe  ",30);
		Department d3= new Department("Finanace"," zhu chaj ",10);
		Department d4= new Department(" Engineering "," Don  ",25);
		dep[0]=d1;
		dep[1]=d2;
		dep[2]=d3;
		dep[3]=d4;
		
		University u = new University(" Dublin university",1990," Antonki",65,1000,dep);
u.display();		
		

	}

}
