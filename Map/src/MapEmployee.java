import java.util.*;
import java.util.Map.Entry;
class Employee100{
	String eName;
	int eId;
	String eDep;
	public Employee100(String eName, int eId, String eDep) {
		
		this.eName = eName;
		this.eId = eId;
		this.eDep = eDep;
	}
	
	
	public String geteName() {
		return eName;
	}


	public int geteId() {
		return eId;
	}


	public String geteDep() {
		return eDep;
	}


	@Override
	public String toString() {
		return eName+" "+eId+" "+eDep;
	}
	
}
public class MapEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee100 e1=new Employee100("Yadgiri",100,"Maths");
		Employee100 e2=new Employee100("Shivashankar",101,"chem");
		Employee100 e3=new Employee100("Deepak",102,"Hindi");
		Employee100 e4=new Employee100("Phani",103,"Physics");
		
		HashMap hm = new HashMap();
		
		hm.put(1,e1);
		hm.put(2,e2);
		hm.put(3, e3);
		hm.put(4,e4);
		
		
	
		
		System.out.println(hm);
		
		// To Fetch Values : 
		
		Collection c =hm.values();
		Iterator itv=c.iterator();
		while(itv.hasNext()) 
		{
			System.out.println(itv.next());
		}
		
		
		 Set s1=hm.keySet();
		Iterator itk=s1.iterator();
		while(itk.hasNext()) 
		{
			System.out.println(itk.next());
		}
		
		Set s2=hm.entrySet();
		Iterator ites=s2.iterator();
		while(ites.hasNext()) 
		{
			Map.Entry mp = (Entry) ites.next();
			System.out.println(" The keys are "+mp.getKey() + " the values are "+mp.getValue());
		}
		
		
		
		System.out.println("*********************");
		
		HashMap hm2 = new HashMap();
		hm2.put(1, 200);
		hm2.put(2, 50);
		hm2.put(3, 300);
		hm2.put(4, 400);
		System.out.println(hm2);
		
		LinkedHashMap lhm2 = new LinkedHashMap();
		lhm2.put(1, 200);
		lhm2.put(2, 50);
		lhm2.put(3, 300);
		lhm2.put(4, 400);
		System.out.println(lhm2);
		
		System.gc();
		System.out.println(" Hello GC");

	}

}
