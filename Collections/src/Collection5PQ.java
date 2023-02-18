import java.util.*;

public class Collection5PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(80);
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(15);
		pq.add(100);
		pq.add(50);
		pq.add(50);
		
		System.out.println(pq);
		System.out.println("*************");
		Iterator it=pq.iterator();
		
		
		
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		LinkedList ll = new LinkedList();
		ll.addAll(pq);
		
		System.out.println("&&&&&&&&&&& FOR REVERSE I HAVE TO ADD QUEUE TO LIST &&&&&&&&&&&&&&&&");
		ListIterator li=ll.listIterator(ll.size());
		
		while(li.hasPrevious()) 
		{
			System.out.println(li.previous());
		}
		
		
		

	}

}
