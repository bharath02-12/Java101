enum Ineuron{
	JAVA,DEVOPS,WEBDEV,DATASCIENCE;
	
	int courseId;
	void setCourseId(int courseId) {this.courseId=courseId;}
	int getCourseId() {return courseId;}
	
	
	Ineuron(){
		System.out.println(" We Offer  Course");
		
	}
}
public class LaunchEnum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ineuron in[]=Ineuron.JAVA.values();
		
		for( Ineuron course:in ) {
			System.out.println(" We Offer "+course.name()+" course  at Affordable Price !");
		}
		
		
		Ineuron.DATASCIENCE.setCourseId(101);
		System.out.println(Ineuron.DATASCIENCE.getCourseId());

	}

}

/*
 * OUT PUT :
 *  We Offer  Course
 We Offer  Course
 We Offer  Course
 We Offer  Course
 We Offer JAVA course  at Affordable Price !
 We Offer DEVOPS course  at Affordable Price !
 We Offer WEBDEV course  at Affordable Price !
 We Offer DATASCIENCE course  at Affordable Price !
101
*/
