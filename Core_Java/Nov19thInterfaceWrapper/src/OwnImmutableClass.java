class Test
{
	int i;

	 Test(int i) 
	{
	
		this.i = i;
	  }
	


public Test modify(int i) 
   {
	if( this.i==i) 
        return this;
	else
		return new Test(i);

	
}
}

public class OwnImmutableClass 
{

	public static void main(String[] args) {
		
		Test t1= new Test(10);
		
		Test t2= t1.modify(10);
		
		Test t3= t2.modify(100);
		
		System.out.println(t1==t2);
		
		System.out.println(t1==t3);
		
		System.out.println(t2==t3);
		
		}
	}


