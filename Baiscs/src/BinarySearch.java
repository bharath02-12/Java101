import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,30,40,50,60,70,80,90};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		int key=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		boolean flag=false;
		
		
		for( int i=0;i<=high;i++) 
		{
			int mid=(low+high)/2;
			
			if( key==arr[mid]) 
			{
				System.out.println("the "+key+" is found at "+mid);
				flag=true;
				break;
				
			}
			else if(key<arr[mid]) {
				high=mid-1;
				i=-1;
			}
			else if( key>arr[mid]) {
				low=mid+1;
			}
		
			
		}
		if( flag==false)
		{
			System.out.println(key+" does not exists in array ");
			
		}
		
		int res=Arrays.binarySearch(arr, 0);
		System.out.println(res);
		

	}

}
