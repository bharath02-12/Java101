class My extends Thread{
	public void run() {
		System.out.println(" Child !");
	}
}
public class LaunchNormalMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		My m = new My();
		m.start();
		Thread t = new Thread();
		t.start();
		System.out.println(" Hello Main");

	}

}
