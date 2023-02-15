import java.util.*;
import java.util.Map.Entry;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		// Can be written like this --> Map m = new HashMap() but can not access specilaized methods
		
		hm.put(10,"Sachin");
		hm.put(7,"MSD");
		hm.put(18,"Kohli");
		hm.put(13,"Rana");
		
		//System.out.println(hm.put(13,"Rana");--> This will give nul 

		
		System.out.println(hm);
		System.out.println(" ");
		System.out.println(" ***********************");
		
		LinkedHashMap lhm = new LinkedHashMap();
		System.out.println(" LinkedHashMap !");
		System.out.println(" To Preserve the order of Insertion , we follow Linked HashMap!");
		System.out.println(" ");
		
		lhm.put(10,"Sachin");
		lhm.put(7,"MSD");
		lhm.put(18,"Kohli");
		lhm.put(13,"Rana");
		
		System.out.println(lhm);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ***********************");

		
		System.out.println("  FOR  Acccessing the HashMap using what should be used ?? ");
		System.out.println(" 1# For the Values only we will use --> use Values() method and it returns in Collection ");
		System.out.println();
		System.out.println(" 2# For the keys we use keySet() , we it will return in SET !!");
		System.out.println();
		System.out.println(" 3# For the KEY and VALUE both we use ---> ENTRYSET()and it will return SET  !!Hahaaaa");
		System.out.println(" ***********************");

		System.out.println(" ***** Acccessing the HashMap Values ************** ");

		Collection c = hm.values();
		//System.out.println(c);
		Iterator itr=c.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(" How I did it ?? Collection c = hm.values() will return Collection ");
		System.out.println(" I will Iterate through Collection , using Iterator !");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println(" ***********************");

		System.out.println(" ******** Now Keys *************");
		System.out.println(" ");
	    Set ts = hm.keySet();
	    Iterator itk=ts.iterator();
		
		while(itk.hasNext()) 
		{
			System.out.println(itk.next());
		}
		System.out.println(" How I did it ?? I will use  Set ts = hm.keySet(); will return SET ON KeySET  ");
		System.out.println(" I will Iterate through Set , using Iterator !");


		System.out.println(" ");
		System.out.println(" ***********************");

		System.out.println(" ******** Now Keys and Values Both !  *************");
		
		
		System.out.println(" How I did it ?? I will use  EntrySet ts = hm.entrySet(); will return entrySet  ");
		System.out.println(" I will Iterate through Set , using Iterator !");


		 Set es=hm.entrySet();
		 
		Iterator its= es.iterator();
		
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		 
		System.out.println(" ***********************");

		
		
		System.out.println(" This are Keys , TypeCasted to Int !");
			
			Set st=hm.keySet();
			
		    Iterator itrst=st.iterator();
			
			while(itrst.hasNext()) {
				Integer i =(Integer)itrst.next();
				System.out.println(i);
			}
			System.out.println(" ***********************");


		
		System.out.println(" This are Values , TypeCasted to String !");
			
		Collection ctp = hm.values();
		Iterator itrtp=ctp.iterator();
			
			while(itrtp.hasNext()) {
				String str =(String)itrtp.next();
				System.out.println(str);
			}
			System.out.println(" ***********************");


			
			
			System.out.println(" This are Keys Values , TypeCasted to Entery !");

		 
		
			 Set est=hm.entrySet();
			 
				Iterator its4= est.iterator();
				
				while(its4.hasNext())
				{
					Map.Entry data=(Entry)its4.next();
					System.out.println(" Keys are : "+data.getKey()+" ****"+" Values are : "+data.getValue());
				
					
				}
		

	

	}

}

/*
 * {18=Kohli, 7=MSD, 10=Sachin, 13=Rana}
{10=Sachin, 7=MSD, 18=Kohli, 13=Rana}

*/
