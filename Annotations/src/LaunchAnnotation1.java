
@FunctionalInterface
interface Trail{
	void getNum();
}

class JavaLearning{
	public void disp1() {
		System.out.println(" Parent disp");
	}
}

class Focus extends JavaLearning{
	@Override
	public void disp1() {
		System.out.println(" Focus is Key");
	}
	
}
public class LaunchAnnotation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       // Inner class
		Trail t=new Trail()
			{
			public void getNum() {
				 System.out.println(" Hello I am Inner class");
				
			};
		
	};
	t.getNum();
	
	Trail t1=()->System.out.println(" Hello I am Lambda ");
	t1.getNum();

}
}
