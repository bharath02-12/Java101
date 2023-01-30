import java.util.Scanner;

class Dog{
	static int a;
	
	static {
		a=10;
		System.out.println( " we have "+a+" Dogs ");
	}
	
	public Dog(){
		System.out.println(" Hello Doggi ! ");
	}
}
public class NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		args[0]=sc.next();
		
		String className=args[0];
		Class c = Class.forName(className);
		Object obj= c.newInstance();
		
		// Perorm type casting to get Student Obh 
		
		Dog d= (Dog)obj;
		System.out.println(d);
		
		
		

	}

}
