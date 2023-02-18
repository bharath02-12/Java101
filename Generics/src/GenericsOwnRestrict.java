class Demo<T extends Number>
{
	
}

class DemoInterface<T extends Runnable>{}

public class GenericsOwnRestrict 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo<Number> d1 = new Demo<Number>();
		Demo<Integer> d2 = new Demo<Integer>();
		//Demo<String> d2 = new Demo<String>();
		DemoInterface<Runnable> di= new DemoInterface<Runnable>();
		

	}

}

// 	CE : Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type Demo<T>

