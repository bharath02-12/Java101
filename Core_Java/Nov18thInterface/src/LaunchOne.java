interface ISample{
	//void m1();
	int x=10;
}

interface IDemoo{
	//int m1( );
	int x=100;
}

/*
 * class CommonImpl implements ISample,IDemo { public void m1() {}// Valid case
 * public void m1() {}
 * 
 * }
 */
public class LaunchOne {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ISample.x);
		System.out.println(IDemoo.x);

	}

}
