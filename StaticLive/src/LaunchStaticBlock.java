
class Demo101{
	int a ;
	int b;
	static  int count;
	static {
		count=20;
		System.out.println("----------- Whats up !!!!!!!!!!!");
	}
	
	{
		count++;
		System.out.println("Hello !!!!");
		System.out.println("count = "+count);
	}
	
	Demo101()
	{
		this(200);
		System.out.println("a = "+a);
		System.out.println(" 1st ------------");
	}
	Demo101(int a){
		this(100,300);
		System.out.println(" a1 ="+a);
		this.a=a;
		System.out.println("2nd ------------");
		
	}
	Demo101(int a , int b){
		
		this.a=a;
		this.b=b;
		System.out.println(" a2 ="+a);
		System.out.println(" b ="+b);
		System.out.println("3rd ------------");
	}
	
	
}
public class LaunchStaticBlock {
	
	public static void main(String[] args) {
		Demo101 d1= new Demo101();
		System.out.println(" donr with d1");
		Demo101 d2= new Demo101(10);
		System.out.println(" donr with d2");
		Demo101 d3= new Demo101(20,30);
		System.out.println(" donr with d3");
		System.out.println(Demo101.count);
		
		
	}

}
