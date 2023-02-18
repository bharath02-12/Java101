import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(0);
		all.add(10);
		all.add(15);
		all.add(20);
		all.add(25);
		all.add(30);
		System.out.println(all);
		
		// Here now we are adding new Obj everytime
		
		ArrayList<Integer> doubleList = new ArrayList<Integer>();
		for(Integer i:all)
			doubleList.add(i*2);
		
		List<Integer> st=all.stream().map(obj->obj*2).collect(Collectors.toList());
		System.out.println(st);
		st.forEach(i->System.out.println(i));
		
		ArrayList<String > ss = new ArrayList<String>();
		ss.add("monday");
		ss.add("tuesday");
		ss.add("wednesday");
		ss.add("thrusday");
		ss.add("friday");
		
		List<String> sl=ss.stream().map(s->s.toUpperCase()).collect(Collectors.toList());

		sl.forEach(s->System.out.println(s));
		
		
	}

}
