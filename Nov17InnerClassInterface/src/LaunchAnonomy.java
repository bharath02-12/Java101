abstract class Tv{
	 public abstract void series() ;
		
}
public class LaunchAnonomy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv remote = new Tv() {
			public void series() {
				System.out.println(" Friends series !!");
			}
		};
		
		
		remote.series();
	}

}
