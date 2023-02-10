import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class CollectionsFFFS {

	public static void main(String[] args) 
	{
		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al1.add(400);
		al1.add(500);
		
		for( int i=0;i<al1.size();i++) {
			
			System.out.println(al1.get(i));
			//al1.add(10);--> INFINITE --> SIZE KEEP INCREASING-->  
		}
		
		System.out.println("*********** Iterator *********" );
		System.out.println(" ");
	
		/*
		 * IN-FINATE LOOP....
		Iterator itr =al1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			try 
			{
			al1.add(10);
			}catch(ConcurrentModificationException e ) {
				System.out.println(" Sorry there is exception !!");
			}
		}
		*/
	
		
		
		CopyOnWriteArrayList coa=new CopyOnWriteArrayList();
		coa.add(10000);
		coa.add(20000);
		coa.add(30000);
		coa.add(40000);
		
		Iterator it=coa.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			coa.add(24233);
		}
		
		

	}

}
