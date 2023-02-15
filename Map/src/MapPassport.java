import java.util.*;
import java.util.Map.Entry;
class Information{
	private String firstName;
	private String lastName;
	private int age;
	private String fatherName;
	private String city;
	public Information(String firstName, String lastName, int age, String fatherName, String city) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.fatherName = fatherName;
		this.city = city;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getFatherName() {
		return fatherName;
	}
	public String getCity() {
		return city;
	}
	
	
	@Override
	public String toString() {
		return firstName+" "+lastName+" "+age+" "+" "+fatherName+" "+city;
	}
	
	
}

//class Key{
//	int key;
//	public Key(int key) {
//		this.key=key;
//	}
//}
public class MapPassport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Information im1 = new Information("Rohan","Sharma",18,"Rahul Sharma","Delhi");
		Information im2 = new Information("Rafi","Mohamood",19," Zakir Mohamood","Mumbai");
		Information im3 = new Information("Rakesh","Reddy",18,"Langa Reddy","Hyd");
		Information im4 = new Information("Lalit","Modi",20,"Niraj Modi","Gujrath");
		
		HashMap hm = new HashMap();
		hm.put(100, im1);
		hm.put(101, im2);
		hm.put(102, im3);
		hm.put(103, im4);
		System.out.println(" Welcome to Passport Details Api");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter the Passport Number !!");
		Integer i=sc.nextInt();
		
		
		Set set =hm.entrySet();
		Iterator itr =set.iterator();
		
		while(itr.hasNext()) 
		{
		
			Map.Entry pass=(Entry) itr.next();
			
			if((pass.getKey()).equals(i)) 
			{
				System.out.println("Passport Number : " +pass.getKey()+" Passport Value: "+pass.getValue());

				System.exit(0);
			}
			
			//.out.println(pass.getValue().getClass());

		}
		System.out.println("Passport number not found !");
		
		
		
		
		
		

	}

}
