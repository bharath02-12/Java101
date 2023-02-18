enum Department{
	CS,EC,EEE,MECH,CIVIL;
	int totalStudents;
	void settotalStudents(int totalStudents) {
		this.totalStudents=totalStudents;
		
	}
	
	int gettotalStudents() {
		return totalStudents;
	}
	Department(){
		System.out.println(" Welcome come !!");
	}
	
	
}
public class LaunchEnum00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department.CS.settotalStudents(100);
		Department d[] = Department.CS.values();
		for(Department ele:d ) {
			System.out.println(ele);
		}
		System.out.println(Department.CS.gettotalStudents());


	}

}
