

class Birth{
	private String name;
	String gender;
	int weight;
	
	{
		System.out.println(" Hello I am baby");
	}
	
	public Birth() {
		System.out.println(" I am non para parent !");
	}
	
	 public Birth(String name, String gender, int weight) {
		this();
		this.name = name;
		this.gender = gender;
		this.weight = weight;
	}



	void action() {
		System.out.println(" Cry");
	}
	
}

class Grow extends Birth{
	public Grow() {
		super();
		System.out.println(" I Just went back to my Birth from Parent ");
	}
	
	public Grow(String name, String gender, int weight) {
		super(name, gender, weight);
		System.out.println(" I Just went back to my Birth from both Parentss ");
		
	}
	
	public Grow(String name,int weight) {
		this("Hall","kaka",40);
		System.out.println(" I Just went back to my Birth through came class constructor ! "+name+weight);

	}
	public Grow(String name) {
		this("papa",50);
		System.out.println(" I just have ame "+name);
	}

	void growaction() {
		System.out.println(" Crwel, walk , eat , play ");
		System.out.println(" I am "+gender);
		//System.out.println(" My Name is "+name);//-------> ERROR --> PRIVATE VARIABLES/ methods  WILL NOT PARTICIPATE IN INHERITANCE
	}
	
}
public class LaunchInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birth b = new Birth("Zoom","Male",35);
		Grow g= new Grow();
		b.action();
		g.action();// --> You dont need to create obj for the Parent , child class obj is enough --> 
	g.growaction();
	Grow g1= new Grow("chinni");
		
		

	}

}
