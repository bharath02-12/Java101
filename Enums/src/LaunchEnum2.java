
enum Result1{
	PASS,FAIL,NR;//Staic final
	
	Result1(){
		System.out.println(" Constrctor os called ");
	}
}
public class LaunchEnum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result1 r =  Result1.PASS;
		System.out.println(r);
		
		Result1 r1[] =  Result1.FAIL.values();
		
		for(Result1 a:r1) {
			System.out.println(a.ordinal()+" : "+a.name());
		}

		

	}

}


/*
 *  Constrctor os called 
 Constrctor os called 
 Constrctor os called 
PASS
0 : PASS
1 : FAIL
2 : NR
*/
 