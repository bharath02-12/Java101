import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class Map100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm1 = new HashMap();
		hm1.put(1, "Hello");
		hm1.put(2,"bollo");
		System.out.println(hm1);
		
		Set s = hm1.entrySet();
		Iterator is=s.iterator();
		while(is.hasNext()) {
			Map.Entry me=(Entry) is.next();
			System.out.println(me.getKey()+" "+me.getValue());
			//System.out.println(is.next());
		}
		
	}

}
