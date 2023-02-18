import java.util.*;
import java.util.stream.Collector;
import java.util.stream.*;
public class StreamOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		System.out.println(al);//[0, 10, 15, 20, 25, 30]
		
		// From JDK 1.7V
		ArrayList<Integer> actionList=new ArrayList<Integer>();
		for(Integer i1 :al) 
		{
			if(i1%2==0)
			{
				actionList.add(i1);
				
				
			}
		}
		System.out.println(actionList);
		
		// From 1.8V Streams 
		/*
		Stream st = al.stream();
		System.out.println(st.getClass().getName());
		
		
		*/

		List<Integer> slist=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(slist);
		slist.forEach(System.out::println);// Method reference
		
		

	}

}

/*
 * [0, 10, 15, 20, 25, 30]
[0, 10, 20, 30]
[0, 10, 20, 30]
0
10
20
30
*/
