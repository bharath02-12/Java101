



class Calci{
	
	int a=10 ;
	int b=20;
	int result ;
	
	int  sum()
	{
		result =a+b;
		
		return result;
	}
	
	
}



public class Launchcalc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calci calc=new Calci();
		int ans=calc.sum();
		System.out.println(ans);
		System.out.println(14%5);
		
		int x=0;
		int y=0;
		
		for( int z=0;z<5;z++) {
			if(++x>2| (++y>2)) 
			{
				x++;
				
			}
		}
		
		System.out.println(x+ " "+y);
		
		int a=10, b=15;
		
		if(++a<10 &++b>15)
		{
			System.out.println("Hello ");
			a++;
		}
		else
		{
			b++;
		}
		
		System.out.println(a+" "+b);
		
		while(true) {
			System.out.println("Hello !");
			
		}
		

	}

}
