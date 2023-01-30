
//
@FunctionalInterface
interface Add{
	//void add();
	
	void add( int a , int b);
	
}

@FunctionalInterface
interface Sub{
	int sub(int num);
}
public class LaunhLambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 * 0-Zero parameter add()
		
		Add a=()->{
			int num=10;
			int num2=20;
			int ref=num+num2;
			System.out.println(" Hello addition = "+ref);
		};
		
		a.add();
		
		*/
		
	
		/* 
		Add add=(int a , int b)->{
			int res=a+b;
			System.out.println(res);
		};
		
		add.add(10, 20);
		
		*/
		
		
		// No need to specify the parametr type 
		Add add=(a ,  b)->{
			int res=a+b;
			System.out.println(res);
		};
		
		add.add(10, 20);
	
		/*
		Sub s=(num1)->{
			int res=num1-5;
			return res;
			
		};
		
		*/
		
		Sub s=(num1)->num1-5;//-----> NO RETURN STATEMENT !!!
		
		System.out.println(s.sub(20));
		

	}

}
