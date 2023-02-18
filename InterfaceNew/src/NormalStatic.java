interface Hello{
	
	default void disp() {
		System.out.println(" Hello I am Parent static");
	}
	static void play() {
		System.out.println(" I want to play ");
	}
}
class Bollo implements Hello{
	public void disp() {
		System.out.println(" I a child ");
	}
	
}
public class NormalStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bollo b= new Bollo();
		//b.play();
		b.disp();
		Hello.play();
		

	}

}
