interface Hyder{
	void teaches();
	void writesCode();
	default void disp() {
		System.out.println(" Hello new JAVA 8 ");
	}
	
	static void disp2() {
		System.out.println("Hello I am the new Display jaja ");
	}
	
}
class Student00 implements Hyder{
	public void teaches() {
		System.out.println(" Teches Java ");
	}
	
	public void writesCode() {
		System.out.println(" Will Write code !");
	}
}
public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student00 s = new Student00();
		Hyder.disp2();
		//Student00.disp2();

	}

}
