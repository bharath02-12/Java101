class Gen<T >
{
	T obj;
	Gen(T obj){
		this.obj=obj;
	}
	
	public void show() {
		System.out.println(" The type of Objct is "+obj.getClass().getName());
		
	}
	
	public T getObj() {
		return obj;
	}
	
}

public class Generics2Own {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer> g1=new Gen<Integer>(10);
		g1.show();
		System.out.println(g1.getObj());
		
		System.out.println();
		
		Gen<String> g2=new Gen<String>("Naveen");
		g2.show();
		System.out.println(g2.getObj());




	}

}

/* The type of Objct is java.lang.Integer
10

The type of Objct is java.lang.String
Naveen
*/
