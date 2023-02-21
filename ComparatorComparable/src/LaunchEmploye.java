import java.util.*;
import java.util.TreeSet;

class MyComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) 
	{
		Employe ce = (Employe)o1;
		Employe ce1= (Employe)o2;
		
		return ce.eName.compareTo(ce1.eName);	
		
	}
	
}

// Already this code id avaiale 
class Employe implements Comparable{
	int empId;
	String eName;
	

	public Employe(int empId, String eName) {
		this.empId = empId;
		this.eName = eName;
	}
	
	public String toString() {
		return eName+" ==> "+empId;
		
	}


	@Override
	public int compareTo(Object obj1) {
		
		
		Employe e =(Employe)obj1;
		if(this.empId<e.empId) {
			return -1;
		}
		else if(this.empId>e.empId) {
			return 1;
		}
		else {
			return 0;
		}
				
		
	}
	
}
public class LaunchEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       Employe e1=new Employe(10,"sachin");
				Employe e2=new Employe(14,"pointing");
				Employe e3=new Employe(17,"gayle");
				Employe e4=new Employe(37,"Gopal");
				Employe e5=new Employe(7,"Bond");
		
		TreeSet ts = new TreeSet();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		System.out.println(ts);
		
		MyComp mc = new MyComp();
		TreeSet ts1 = new TreeSet(mc) ;
		
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		System.out.println(ts1);
			
		

	}

}
