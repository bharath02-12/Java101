// Method Reference !! with Instance Method !!!!!!!11
interface inter
{
	public int m1(int i);
}


public class FIMethodBindingInstanceMethod 
{
	
	public int logicCoded(int i)
	{
		System.out.println("  method reference !");
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" This is Method refrence ");
		inter i1 = new FIMethodBindingInstanceMethod()::logicCoded;
		System.out.println(i1.m1(100));
		
	
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		
		System.out.println(" This is with Lambda expression !!!!");
		 inter t =i->i*i;
		 
		System.out.println(t.m1(10));
		
		
		

	}

	

}
