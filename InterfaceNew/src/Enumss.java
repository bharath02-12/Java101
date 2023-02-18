enum Jobs{
	IT,SALES,MARKETING,GENERAL;
	Jobs(){
		System.out.println(" I am constructor !!");
	}
	public void hello() {
		System.out.println(" Hello ");
	}
	
	int employecount;
	void setec(int employecount) {
		this.employecount = employecount;
	}
	
}
public class Enumss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jobs j=Jobs.IT;
		j.hello();
		System.out.println(j);

	}

}
