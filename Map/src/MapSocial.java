import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

class Details{
	private String firstName;
	private String lastName;
	private String  dob;
	private Address add;
	public Details(String firstName, String lastName, String dob, Address add) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.add = add;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDob() {
		return dob;
	}
	public Address getAdd() {
		return add;
	}
	
	@Override
	public String toString() {
		return firstName+" "+lastName+" "+dob+" "+" "+add.getDeatils();
	}
	
	
	 
}

class Address{
	private String streetname;
	private String city;
	private String state;
	private int zip;
	public Address(String streetname, String city, String state, int zip) {
	
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public String getStreetname() {
		return streetname;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZip() {
		return zip;
	}
	
	public String getDeatils() {
		return streetname+" "+city+" "+state +" "+zip;
	
	}
	
	
	
	
	
}
public class MapSocial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad1= new Address("Wilmington Avene", "Dayton", "Ohio", 45420);
		
		Details d1 = new Details("Bharat Raj", "Keesari ", "02/02/1996",ad1 );
		
	//	Address ad2= new Address("Wilmington Avene", "Dayton", "Ohio", 45420);
		
		Details d2 = new Details("Komal", "Vinod ", "09/18/1998",ad1 );
		
		HashMap hm = new HashMap();
		hm.put("123456789", d1);
		hm.put("987654321", d2);
		
		// Iterator !!!!
		
		Set s=hm.entrySet();
		Iterator ir=s.iterator();
		while(ir.hasNext()) {
			Map.Entry mp=(Entry) ir.next();
			System.out.println("SSN Details "+mp.getKey()+" :: "+mp.getValue());
		}
		
		
		
		
		
		
	

	}

}
