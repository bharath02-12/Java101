
public class BubbleSort {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		int[] a= {7,5,4,2,1,6,3};
		
		for(int i=0;i<a.length;i++) {
			for( int j=1;j<a.length-i;j++) 
			{
				
				if(a[j]<a[j-1]) 
				{
					
					int swap=a[j-1];
					a[j-1]=a[j];
					a[j]=swap;
					
				}
			}
		}
		
		for( int ele :a)
			System.out.print(ele+" ");
		}

	}


