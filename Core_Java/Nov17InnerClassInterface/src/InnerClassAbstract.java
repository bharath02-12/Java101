abstract class Computer1
{
	
	
	public abstract void config();
}

/*
class Laptop extends Computer1{
	public void config() {
		System.out.println(" It os working !!");
	}*/
	

public class InnerClassAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Computer1 cp = new Laptop() {
//		cp.config();
		
		Computer1 cp= new Computer1() {
			public void config() {
				System.out.println(" Hello !!");
			}
		};
		cp.config();
		
		

	}

}
