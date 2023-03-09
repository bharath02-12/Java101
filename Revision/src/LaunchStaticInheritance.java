class Papa{
	public  void disp() {
		System.out.println(" I am Papa");
	}
}


class Betaa extends Papa{
	public  void disp() {
		System.out.println(" I am Beta ");
	}
}
public class LaunchStaticInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Papa p = new Papa();
		
		Papa b=new Betaa();
		
		p.disp();
		b.disp();

	}

}
