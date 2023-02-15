import java.util.*;
import java.util.Map.Entry;

class Student{
	private String name;
	private int age;
	private String city;
	public Student(String name, int age, String city) {
		
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return name+" "+age +" "+ city;//---> everything i
		
	}
	
}
public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1 = new Student("Rohan",18,"Bangaluru");
		Student st2 = new Student("Rahul",18,"Hyd");
		Student st3 = new Student("Rohan",18,"Hyd");
		
		
		HashMap hm = new HashMap();
		
		hm.put(1, st1);
		hm.put(2, st2);
		hm.put(3 ,st3);
		
		System.out.println(hm);
		
		// Output : {1=Student@5a07e868, 2=Student@76ed5528, 3=Student@2c7b84de}
		
		
		// TO GET THE VALUES 
		System.out.println(" These are Only Values ");
		Collection c = hm.values();
		Iterator itr=c.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("**********************");
		// To Get Keys 
		System.out.println(" This aere Keys !");
		
		Set s=hm.keySet();
		
	    Iterator itrs=s.iterator();
		
		while(itrs.hasNext()) {
			System.out.println(itrs.next());
		}
//		
//		Set both =hm.entrySet();
//		Iterator itrb = both.iterator();
//		while(itrb.hasNext()) {
//		System.out.println(itrb.next());
//			
//		}
//		
	   Set both1 =hm.entrySet();
		Iterator itrb1 = both1.iterator();
		while(itrb1.hasNext()) {
			Map.Entry data1=(Entry) itrb1.next();
			System.out.println(data1.getKey()+" "+" ::"+data1.getValue());
			
		}
		
		
		
		
		
		
	
	


		
		
		
		

	}

}
