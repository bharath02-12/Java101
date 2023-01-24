
class Student200{
	private String sid;
	private String sname;
	private String saddr;
	
	// 
	private Course[] course;

	public Student200(String sid, String sname, String saddr, Course[] course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
	}
	
	public void getStudentDetails() {
		
		System.out.println(" Student Details are : ");
		
		System.out.println("########### "+sname+" Took  the following Courses "+"  His ID is "+sid+" and he is from "+saddr+"  ##############");
		System.out.println();
		for (Course course2 : course) {
			System.out.println(" Course ID is "+course2.cid);
			System.out.println(" Course Name is "+course2.cname);
			System.out.println(" Course Cost !! "+course2.cost);
			System.out.println();
		}
			
		
		
		
		{
			
			
			
		}
	}
}

class Course{
	String cid;
	String cname;
	int cost;
	public Course(String cid, String cname, int cost) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
	}
	
}
public class LaunchManyToMany {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Course c1= new Course("101","Java",1800);
		
		Course c2= new Course("102","Python",1100);
		
		Course c3= new Course("103","Web dev",2100);
		
		Course[] course=new Course[3];
		
		course[0]=c1;
		course[1]=c2;
		course[2]=c3;
		
		
		Student200 sto=new Student200("IND101", "Sachin", "MUMBAI", course);
		Student200 st9=new Student200("IND191", "Kohlo", "Del", course);
		
		Student200 st10=new Student200("IND1001", "Yvu", "Pun", course);
		
		sto.getStudentDetails();
		st9.getStudentDetails();
		st10.getStudentDetails();
		
		String javaworld ="JavaWorld";
		String java ="Java";
		String world="World";
		java+=world;
		System.out.println(java);
		System.out.println(java==javaworld);
		
		StringBuilder sb = new StringBuilder("SpaceStation");
		sb.delete(5, 6).insert(5," S").toString().toUpperCase();
		System.out.println(sb);
		

	}

}
