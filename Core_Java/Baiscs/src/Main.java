
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		int a=10;
		int b=20;
		int c=30;
		int d=(a<b&&a<c?a:b);
		int e=(a<b?(a<c?a:c):(b<c?b:c));
		System.out.println(e);
		int num=100;
		switch(num) {
			case 1: 
				System.out.println("It is Case num !");
				break;
			case 2: 
				System.out.println("It is case 2");
				break;
			
			case 100 :
				System.out.println("Case 100!!");
				break;
			
			case 110 :
				System.out.println("Case 110!!");
				break;
			
			case 120 :
				System.out.println("Case 120!!");
				break;
	

	}
	}

}
