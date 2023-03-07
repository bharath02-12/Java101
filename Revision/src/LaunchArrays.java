import java.util.Arrays;

class Fan{
	int cost;
	String brand;
	int noofwings;
	
	public String toString() {
		return this.cost+" "+this.brand+" "+this.noofwings;
	}
	
	
}
public class LaunchArrays {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int b[][]=new int[2][2];
		System.out.println(b[0]);
		System.out.println(b[0][0]);
		
		int[] a= {20,40,10,55,13};
		Arrays.sort(a);
		System.out.println(a);
	
		
		

		
		Fan[] f = new Fan[3];
		f[0]=new Fan();
		f[0].brand="Nike";
		f[0].cost=200;
		f[0].noofwings=3;
		
		f[1]=new Fan();

		f[1].brand="Puma";
		f[1].cost=260;
		f[1].noofwings=30;
		
		f[2]= new Fan();
		f[2].brand="Rebook";
		f[2].cost=300;
		f[2].noofwings=3;
		
		
		for(Fan f1:f) {
			System.out.println(f1);
		}
		
		
	}

}
