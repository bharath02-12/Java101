
class MyThread6 extends Thread{
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println("Run method is executed by  "+name);
	} 
	
}
public class LaunchMulti6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		
		System.out.println(" Main Methid is executed by  = "+name);
		
		MyThread6 t6=new MyThread6();
		System.out.println(t6);
		System.out.println(t6.getName());
		
		t6.start();
		System.out.println(t6.getName());

	}

}
