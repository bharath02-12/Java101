import java.util.*;
class Collenction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al1= new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println("al1 = "+al1);
		
		ArrayList al2= new ArrayList();

		al2.add("Ineuron");
		al2.add("Banglore");
		al2.add('b');
		al2.add(18.5);
		System.out.println("al2 = "+al2);
		
		System.out.println("**********************");
		
		ArrayList al3 = new ArrayList();
		//al3.add(al2);
		System.out.println("al3 = "+al3);

		al3.addAll(al2);
		System.out.println("al3 = "+al3);
		System.out.println("**********************");
		
		ArrayList al4 = new ArrayList();
		al4.add(11);
		al4.add(22);
		al4.add(33);
		al4.add(44);
		System.out.println("existimg data "+al4);
		al4.add(2, 30);

		System.out.println("after adding  data "+al4);
		



	}

}
