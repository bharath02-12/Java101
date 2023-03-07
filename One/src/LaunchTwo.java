
interface Disp{
	void m1();
	void m2();
}
public class LaunchTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Disp d= new Disp(){
			public void m1(){
				System.out.println(" Hello ");
			}

			@Override
			public void m2() {
				System.out.println(" I am m2");
				
			}
			
		};

		d.m1();
		d.m2();
	}

}
