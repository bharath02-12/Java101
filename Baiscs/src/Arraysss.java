import java.util.Scanner;

class A{
	void add( long a, long b) {
		System.out.println("Hello ");
	}
}

public class Arraysss {
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		
		A obj = new A();
		obj.add(10, 20);
		
		for( int i=0;i<3;i++)
		{
			for ( int j=0;j<3;j++) {
				if(i==j)
					break;
				System.out.println(i+" "+j);
			}
		}
		
		

}
}