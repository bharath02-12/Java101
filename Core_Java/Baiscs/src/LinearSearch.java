import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar= {10,20,30,40,50,60};
		boolean flag=false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element");
		
		int ele=sc.nextInt();
		
		for( int i=0;i<ar.length;i++) {
			if(ar[i]==ele) 
			{
				System.out.println(ele+" is present in Array at "+i+" Index ");
				flag=true;
				break;
			}		
			
		}
		
		if( flag==false) {
			System.out.println(" Element is not present in array !!");
		}
		
		

	}

}
