@FunctionalInterface
interface Square{
	public int area(int a);
}


public class LaunchLambda6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square s= new Square() {
			public int area(int a) {
				return a*a;
				
			}
			
		};
		
		System.out.println(s.area(5));
		
		///////////////////////////////////////////////
		
		/// Lambda expression : 
		
		
		Square s1= x->x*x;
		System.out.println(s1.area(10));

	}

}
