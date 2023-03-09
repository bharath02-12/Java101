// Functional Interface -> Interface with only one ABSTRACT METHOD !!

@FunctionalInterface
interface Bc{
	public void Service();
	
}

@FunctionalInterface
interface Van{
	public void Service(String name );
}

interface Mast{
	public String Service(String ser,int a);
}
public class LaunchFunctionalInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bc b=()->System.out.println(" We give Health Service !! Tan ta da ");
		
		Van v=s->System.out.println(" We give Services in "+s);
		b.Service();
		v.Service(null);
		
		Mast m=(s,a)->"Yes we do Provide Services in  "+s+" From "+a;
		System.out.println(m.Service("Financial",200));

	}

}
