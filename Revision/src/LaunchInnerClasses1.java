
// Inner Classes 
interface Holla{
	public void welcome();
	
}
class Dem{
	public void sum(int a , int b) {
		System.out.println("The sum is "+(a+b));
	}
	
	public void sub() {
		System.out.println(" The Sub");
	}
}
public class LaunchInnerClasses1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Holla h=new Holla() 
		{

			@Override
			public void welcome() {
				 System.out.println(" WELCOME to Mexico !!");
				
			}
			
		};
		
		Dem d= new Dem(){
			@Override
			public void sum(int a , int b) {
				System.out.println("The Hello  Sorry mo more additions  ");
			}
			
			
		};
		
		h.welcome();
		d.sub();
		d.sum(1, 2);
		
		
	}

}
