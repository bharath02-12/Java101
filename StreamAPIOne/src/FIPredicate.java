import java.util.function.Predicate;

class MyPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		Integer i = (Integer)t;
		if(i>10)
			return true;
		else 
			return false;
	}
	
}


class MyPredicateString implements Predicate<String>{

	@Override
	public boolean test(String s) {
		int len=s.length();
		if(len>5)
			return true;
		else 
			return false;
	}
	
}
public class FIPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  This is for the Integer
		
		Predicate p = new MyPredicate();
		System.out.println(p.test(10));
		System.out.println(p.test(100));
		System.out.println(p.test(true));
		
		Also :
		MyPredicate mp =new MyPredicate();
		Predicate p = new MyPredicate();
		System.out.println(mp.test(10));
		System.out.println(mp.test(100));
		// LAMBDA Only ONE- LINE:
		
		Predicate<Integer> p1 =i->i>10;// One LINE 
		System.out.println(p1.test(100));
		*/
		
		
		
	
		
		Predicate ps = new MyPredicateString();
		System.out.println(ps.test("Hell"));
		System.out.println(ps.test("Hhahahaahah"));
		
		// LAMBDA
		
		
		Predicate<String> ps1=s->s.length()>5;
		System.out.println(ps1.test("NitinsM"));

		
	
		
		
		
		

	}

}
