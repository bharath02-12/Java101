import java.util.*;
class Collection2LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add("Ineuron !");
		System.out.println(ll);
		
		ll.add(1, 35);
		System.out.println(ll);

		ll.addFirst("prime");
		ll.addLast("final");
		ll.get(4);
		System.out.println(ll);
		System.out.println("***************");
		LinkedList ll2= new LinkedList();
		ll2.add(100);
		ll2.add(99);
		ll2.add(98);
		
		
		
		System.out.println(ll2.getFirst());
		System.out.println(ll2.getLast());
		ll2.addFirst(101);
		ll2.addLast(97);
		System.out.println(ll2);
		
		System.out.println(ll2.indexOf(100));
		System.out.println(ll2.indexOf(101));
		System.out.println(ll2.indexOf(1010));
		
	}

}

/*
 * 
 * [10, 20, 30, Ineuron !]
[10, 35, 20, 30, Ineuron !]
[prime, 10, 35, 20, 30, Ineuron !, final]

*/
 