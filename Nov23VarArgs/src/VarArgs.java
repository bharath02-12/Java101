
class Test{
	public void add(int x,int... y){
		System.out.println(" This is Var arg approch !!");
		int sum=0;
		
		for (int i : y) {
			System.out.println(i);
			sum=sum+i;
			
		}
		
		System.out.println(sum);
		
		
		
	}
}
public class VarArgs {
	public static void main(String[] args) {
		Test t= new Test();
		t.add(10);
		t.add(20,30);
		t.add(40,50,60);
		
	}

}
