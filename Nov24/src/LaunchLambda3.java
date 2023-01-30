@FunctionalInterface
interface Mul{
	void mul(int a , int b );
}

@FunctionalInterface
interface Div{
	void div(int d);
}
public class LaunchLambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mul m =(a,b)-> {
			int res=a*b;
			System.out.println(" Mul is "+a*b);
			};
			m.mul(2, 5);
			
			Div v= num-> System.out.println(num/2);

	}

}
