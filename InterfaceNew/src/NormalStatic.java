class Hello{
	void disp() {
		System.out.println(" Hello I am Parent static");
	}
}
class Bollo extends Hello{
	void disp() {
		System.out.println(" I a child ");
	}
}
public class NormalStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bollo b= new Bollo();
		b.disp();
		

	}

}
