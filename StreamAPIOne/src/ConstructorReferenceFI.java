class Sample{
	private String s;

	public Sample(String s) {

		this.s = s;
		
		System.out.println(" Constructor executed  is "+s);
	}
	
	@Override
	public String toString() {
		return s;
		
	}
	
	
}

@FunctionalInterface
interface in{
	
	public Sample get(String s);
}
public class ConstructorReferenceFI {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// This is Lambda Experssion !!
		in i =s->new Sample(s);
		
		System.out.println(i.get("Microsoft from Lambda Expression "));
		
		
		// Constructor Referenece !!!!!
		// C
		
		in i1=Sample::new;
		i1.get(" From constructor reference !");
		

	}

}
