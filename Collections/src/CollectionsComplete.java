// [ 100,20,25,300,350,50]
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class CollectionsComplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to Collections World !");
		System.out.println(" I am the Interface, and  I have many Classes that implelement me  ");
		System.out.println(" 1. ArrayList ");
		System.out.println(" Hey I am ArrayList, i follow Dynamic array!");
		System.out.println(" ");
		
		ArrayList a 
		= new ArrayList();
		a.add(100);
		a.add(20);
		a.add(25);
		a.add(300);
		a.add(350);
		a.add(50);
		a.add(50);
		a.add(0, 10);
		a.add(5, 60);
		//a.add("Farzis");
		System.out.println(" I am ArrayList , I accept the duplicates , you can do Indexbased addition( for Queue Behavior "
				+ ""+ " if you are thinking i follow the queue DS , its not me , My brother LinkedList follows it ");
		
		System.out.println(a);
		System.out.println(" You can truct me ! I preserve the Order of Insertion and Duplicats Hahaha");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		System.out.println(" 2. I AM LINKEDLIST !!!!!!!");
		LinkedList ll = new LinkedList();
		// [ 100,20,25,300,350,50]
		ll.add(100);
		ll.add(20);
		ll.add(25);
		ll.add(300);
		ll.add(350);
		ll.add(50);
		ll.add(50);
		ll.add(2, 1000);//-->Index based 
		
		
		System.out.println(ll);
		System.out.println(" You can truct me ! I preserve the Order of Insertion and Duplicats Hahaha ");

		
		System.out.println("Hey Hi I am LinkedlIst I can be accessed through indexes , yes you can add at first and last as in Queue because extend Queue Inteerface!!");
		
		System.out.println(" Adding 12 at the Front ");
		 ll.addFirst(12);
		 
		 System.out.println(" Adding 22 at the End !");
		 System.out.println(" ");
		 ll.addLast(22);
		 
		 System.out.println(ll);
		 System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
		 
			System.out.println( " 3. ArrayDeque");
		  ArrayDeque a2 = new ArrayDeque();
			a2.add(100);
			a2.add(20);
			a2.add(25);
			a2.add(300);
			a2.add(350);
			a2.add(50);
			
			
			a2.add(50);
			
			System.out.println(" This is ArrayDeque , No Index Based ");
			
			System.out.println(a2);
			System.out.println(" You can truct me ! I preserve the Order of Insertion and Duplicats Hahaha ");

			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println(" 4. PriorityQueue ");
			
			
			
			PriorityQueue pq = new PriorityQueue();
			pq.add(100);
			pq.add(20);
			pq.add(25);
			pq.add(300);
			pq.add(350);
			pq.add(50);
			pq.add(50);
			
			System.out.println(" You can Not trust me ! I  Dont preserve the Order of Insertion But But I accpet Duplicats Hahaha ");
			System.out.println(pq);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" I am Priority Queue , No index based ");
			System.out.println(" I am Priorit Queue , I use Min-Heap");
			System.out.println(" I will keep leat number  on Top");
			
			System.out.println(" Wondering how i do that ??");
			System.out.println(" Simple: I first add ele to Left and compare head of that tree and if the ele is less than "
					+ " the root will swap if not then let it be , next ele add to right and compare and do this at every level-left and right ");
			
			System.out.println(" Next is Tree Set !");
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println(" 5. TreeSet ");

			
			TreeSet ts = new TreeSet();
			ts.add(100);
			ts.add(20);
			ts.add(25);
			ts.add(300);
			ts.add(350);
			ts.add(50);
			ts.add(50);
			System.out.println("Hello Here is the Tree Set !! "+ts);
			System.out.println(" I will not preserve the order of  Insertion ");
			System.out.println(" Rather i will sort it , I will Sort the Set and I will not Allow Duplicats Too ! ");
			System.out.println(" I will Follow , BST Data structure and for Traversal I do Inorder-Traversanl ( LVR)");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println(" 6. HashSet !!");
			
			HashSet hs = new HashSet();
			hs.add(100);
			hs.add(20);
			hs.add(25);
			hs.add(300);
			hs.add(350);
			hs.add(50);
			hs.add(50);
			System.out.println(hs);
			System.out.println(" I follow Hashing ( Hash Function + Hash Table), ");
			System.out.println(" I wont preserve the Order of Insertion !!, I dont sort also and No DUPLICATS MY FRIEND HAHAHAHA!!!!");
			System.out.println(" How i allocat is a secret , hahaha .To preserve th Order of INsertion  please use LINKED HASH SET ");
			
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
	System.out.println(" 7.  Linked HashSet !!");
			
			LinkedHashSet lhs = new LinkedHashSet();
			lhs.add(100);
			lhs.add(20);
			lhs.add(25);
			lhs.add(300);
			lhs.add(350);
			lhs.add(50);
			lhs.add(50);
			System.out.println(lhs);
			System.out.println(" Linked Hasset perserves the order of Insertion !");
			
		
		
		// This is Fail Safe !!
		/*	
			System.out.println(" Itration , For Iteration we use Iterator !!!");
			CopyOnWriteArrayList cao=new CopyOnWriteArrayList();
			cao.add(100);
			cao.add(20);
			cao.add(25);
			cao.add(300);
			cao.add(350);
			cao.add(50);	
			
	Iterator itcao=cao.iterator();
			
			while(itcao.hasNext()) {
				System.out.println(itcao.next());
				a.add(8);
			}
			
			*/
			//Sorting 
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println(" For sorting we use , CollectionS.sort() "
					+"But the problem with Collection.sort is it can only sort Same DataType elememts !"
					+ "to restrict the input only we can use generics ArrayList<Integer> ai = new ArrayList<Integer>() will "
					+ "only allow Integer input , this is called GENERICS !");
			
		Collections.sort(a);
		System.out.println("The Sorted ArrayList : "+a);
		Collections.sort(ll);
		
		
	//	Collections.sort(cao);
			
		
		

	}

}
