import java.util.*;
public class LaunchCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 100 50 150 25 75 125 175 
		
		TreeSet ts = new TreeSet();
		
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(" I am Tree set I will give Sorted : "+ts);
		
		ArrayList a = new ArrayList();
		a.add(100);
		a.add(50);
		a.add(150);
		a.add(25);
		a.add(75);
		a.add(125);
		a.add(175);
		//a.sor
		
		System.out.println(" I am Array List  I will not give Sorted : "+a);
		
		Collections.sort(a);
		
		System.out.println(a);
		
		
		/*
		 * 
		 * 
		ArrayList a1= new ArrayList();
		//a1.add(20);
		a1.add("Hyder");
		a1.add("iNEURON");
		a1.add("877wr9");
		Collections.sort(a1);
		System.out.println(a1);
		
		
		*/
		
		ArrayList<String> as = new ArrayList<String>();
		as.add("Hello ");
		as.add(" Goggoins ");
		as.add(" Here !");
		Collections.sort(as);
		System.out.println(as);
		
		ArrayList<Integer> ai =new ArrayList<Integer>();
		ai.add(29);
		
		
		
		

	}

}
