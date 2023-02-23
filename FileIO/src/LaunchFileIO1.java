class Student{
	private Integer sid;
	private String sName;
	private Integer sage;
	public Student(Integer sid, String sName, Integer sage) {
		
		this.sid = sid;
		this.sName = sName;
		this.sage = sage;
	}
	
	
	public String toString() {
		return "Sid : "+sid+" Sname : "+sName+" sage :"+sage;
	}
	
}
public class LaunchFileIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(10,"Sachin",45);
		System.out.println(s1);
		
		System.out.println();
		
		Student s2 = new Student(16,"Kohli",36);

		System.out.println(s2);
		

	}

}
