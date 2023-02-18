class Generic<T>
{
	
	T obj;
	Generic(T obj){
		this.obj=obj;
	
	}
	
	public void show() 
	{
		System.out.println("The current running obj Name is "+obj.getClass().getName());
	}
	
	public T getObj() 
	{
		return obj;
	}
}
public class GenericOwn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generic<Integer> gi = new Generic<Integer>(10); 
		System.out.println(gi.getObj());

	}

}
