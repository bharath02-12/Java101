
// Dependet Obj 
class Branch{
	String bid;
	String bname;
	
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
}

// Targect 
class Student00{
	int sid;
	String sname;
	String sadd;

	Branch bracnh;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public Branch getBracnh() {
		return bracnh;
	}

	public void setBracnh(Branch bracnh) {
		this.bracnh = bracnh;
	}
	
	
}


public class LaunchManyToMany_16th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Branch bracnh = new Branch();
		bracnh.setBid("1");
		bracnh.setBname(" Java ");
		
		Branch bracnh2 = new Branch();
		bracnh2.setBid("2");
		bracnh2.setBname(" devops ");
		
		
		Student00 st=new Student00();
		st.setSid(10);
		st.setSname(" Sachin ");
		st.setSadd(" Hyd ");
		st.setBracnh(bracnh);
		
		Student00 st2=new Student00();
		st2.setSid(12);
		st2.setSname(" Kohli ");
		st2.setSadd(" DEL ");
		st2.setBracnh(bracnh2);
		
		Student00 st3=new Student00();
		st3.setSid(13);
		st3.setSname(" Yuvi ");
		st3.setSadd(" PUN ");
		st3.setBracnh(bracnh);
		
		Student00 st4=new Student00();
		st4.setSid(14);
		st4.setSname(" Phani ");
		st4.setSadd(" Hyd ");
		st4.setBracnh(bracnh2);
		
		
		System.out.println(" Student detals are :: ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" Id of student is "+st.getSid());
		System.out.println(" Name of student is "+st.getSname() );
		System.out.println("  He is from "+st.getSadd());
		System.out.println(" Branch Id "+st.getBracnh().getBid());
		System.out.println(" Branch Name "+st.getBracnh().getBname());
		System.out.println("======================================");
		
		System.out.println(" Id of student is "+st2.getSid());
		System.out.println(" Name of student is "+st2.getSname() );
		System.out.println("  He is from "+st2.getSadd());
		System.out.println(" Branch Id "+st2.getBracnh().getBid());
		System.out.println(" Branch Name "+st2.getBracnh().getBname());
		System.out.println("======================================");
		
	
		System.out.println(" Id of student is "+st3.getSid());
		System.out.println(" Name of student is "+st3.getSname() );
		System.out.println("  He is from "+st3.getSadd());
		System.out.println(" Branch Id "+st3.getBracnh().getBid());
		System.out.println(" Branch Name "+st3.getBracnh().getBname());
		System.out.println("======================================");
		
		
		System.out.println(" Id of student is "+st4.getSid());
		System.out.println(" Name of student is "+st4.getSname() );
		System.out.println("  He is from "+st4.getSadd());
		System.out.println(" Branch Id "+st4.getBracnh().getBid());
		System.out.println(" Branch Name "+st4.getBracnh().getBname());
		System.out.println("======================================");
		

	}

}
