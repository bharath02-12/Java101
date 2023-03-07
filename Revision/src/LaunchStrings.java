
public class LaunchStrings {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		
		String s1="Sachin";
		String s2="Sachin";
		String s3 = new String("Sachin");
		String s4=new String("Sachin");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1.hashCode()+"**"+s2.hashCode()+"**"+s3.hashCode()+"**"+s4.hashCode());
		
		
		/*String s2=s1.concat("Tendulkar");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		StringBuffer sb1= new StringBuffer("Hello");
		StringBuffer sb2=sb1.append("Ram");
		System.out.println(sb1.hashCode()+"***"+sb2.hashCode());
		System.out.println(s1==s2);
		String s3 = new String("Dhoni");*/
		
		String s5="sachin";
		//.concat("DOHMI");
		
		String s6=s5.toLowerCase();
		String s7=s5.toUpperCase();
		System.out.println(s5==s6);
		System.out.println(s5==s7);
		
		StringBuffer sb1= new StringBuffer();
		System.out.println(sb1.capacity());
		StringBuffer sb2= new StringBuffer("Hello");
		System.out.println(sb2.capacity());
		
		StringBuffer sb3=new StringBuffer("Java");
		String s="Java";
		String s0=sb3.toString();
		System.out.println(s==s0);
		
		String s100="JavaWorld";
		String s110="Java";
		String s115="World";
		String s200=s110+s115;
		System.out.println(s100.hashCode());
		System.out.println(s200.hashCode());
		String s300="Java"+"World";
		System.out.println(s300.hashCode());
		System.out.println(s100==s200);
		System.out.println(s100==s300);
		
		

	}

}
