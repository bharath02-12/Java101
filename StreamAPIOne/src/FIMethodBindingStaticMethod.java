// Method Binding !!--> Static method --> Using class Name !!
public class FIMethodBindingStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		Runnable r1=()->{
			for(int i=1;i<=10;i++) {
				System.out.println(" Child Thread");
			}
		};
		Thread t = new Thread(r1);
		t.start();
		
		System.out.println("***************************");
		
		System.out.println(" Method Biding !!!!!!!11");

		Runnable r=FIMethodBindingStaticMethod::m1;
		Thread t1 = new Thread(r);
		t1.start();
		
		

	}
	
	public static void m1() {
		for( int i=0;i<10;i++) {
			System.out.println(" Hello Thread By method binding  !");
		}
	}

}
