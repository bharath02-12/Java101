import java.util.function.Predicate;

class MyPredicateArray implements Predicate<Integer>
{

	@Override
	public boolean test(Integer t) 
	{
		// TODO Auto-generated method stub
		return false;
	}
	
}

class MyPredicateStringArray implements Predicate<String>
{
	
	@Override
	public boolean test(String s) 
	{
		// TODO Auto-generated method stub
		return false;
	}
	
}
public class FIPredicateOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,10,15,20,25};
		
//		int[] arr1 = new int[arr.length];
//		int j=0;
//		for( int i=0;i<arr.length;i++) {
//			if(arr[i]>=10) {
//				arr1[j]=arr[i];
//				j++;
//			}
//		}
		
		Predicate<Integer> p1= t->t>10;
		Predicate<Integer> p2=t-> t%2==0;
		
		System.out.println(" Elements with ele greater than 10");
		m1(p1,arr);
		System.out.println(" Elements with Even");
		m1(p2,arr);
		
		System.out.println(" Elements with Even and Greater than 10");
		m1(p1.and(p2),arr);

		System.out.println(" Elements with Even or Greater than 10");
		m1(p1.or(p2),arr);
		

		String[] s= {"Phatan","War","TIGER!!"};
		Predicate<String> ps= s1->s1.length()>5;
		System.out.println(" Lambda wrt String length");
		m1(ps,s);
		
		
		Predicate<String> ps1= s1->s1.charAt(0)=='P';
		System.out.println(" Lambda wrt String char");
		m1(ps1,s);
		
		Predicate<String> ps2= s1->s1.charAt(1)=='I';
		System.out.println(" Lambda wrt String char");
		m1(ps2,s);
		
		
		
	}
		
		public static void m1(Predicate<Integer> p ,int[]x) 
		{
			for(int ele:x) {
				if(p.test(ele))
					System.out.println(ele);
			}
			
		}
		
		public static void m1(Predicate<String> p ,String[]x) 
		{
			for(String ele:x) {
				System.out.println(" Input = "+ele);

				if(p.test(ele))
					System.out.println(ele);
			}
			
		}
		
		
		

	}


