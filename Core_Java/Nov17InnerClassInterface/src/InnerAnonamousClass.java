class Company{
	public void stock(){
		System.out.println(" Hello My company Stock is !!");
		
	}
	
}
public class InnerAnonamousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company com= new Company(){

			public void stock(){
				System.out.println(" Hello My company Stock is 500 !!");
				
			}
			
			
		};
		com.stock();

	}

}
