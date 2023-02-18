
import java.util.function.Function;

class Myfun implements Function<String,Integer>{

	@Override
	public Integer apply(String s) 
	{
		return s.length();
		
	}
	
}

public class FIFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String,Integer> f1 = new Myfun();
		System.out.println(f1.apply("Kamalaa"));
		
		
		Function<String,Integer> f2 = s->s.length();
		f2.apply("Hello");
		
	}

}
