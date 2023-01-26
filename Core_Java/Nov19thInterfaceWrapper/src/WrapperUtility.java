
public class WrapperUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i1=  Integer.valueOf(10);
		System.out.println(i1);
		Integer i2=  Integer.valueOf("10");
		System.out.println(i2);
		/*
		 * 
		// NumberFormatException ----> String Input >> NF exception 
		Integer i3=  Integer.valueOf("True");
		System.out.println(i3);
		
		*/
		
		Integer i10=Integer.valueOf("100",2);
		System.out.println(i10);
		Integer i37=Integer.valueOf("100",10);
		System.out.println(i37);
		System.out.println("Max_Radix "+Character.MIN_RADIX);//----> 2 is MIN Radix 
		
		System.out.println("Max_Radix "+Character.MAX_RADIX); // ----> 36 is MAX Radix 
		
		//================================ XXXVALUE()============================================//
		
		Integer i = new Integer(130);// Primitve ---> Wrapper
		
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.intValue());
		System.out.println(i.floatValue());
		System.out.println(i.doubleValue());
		System.out.println(i.longValue());
		

		Character c=new Character('a');
		char c1= c.charValue();
		System.out.println(c1);//---> Out put is same char a 
		
		//<========== PARSEXXX()===================>
		
		// STRING TO PRIMITIVE TYPE 
		int a =Integer.parseInt("10");
		System.out.println(a);
		boolean b1=Boolean.parseBoolean("sachin");
		System.out.println(b1);
		
		float f1= Float.parseFloat("2.5f");
		System.out.println(f1);
		
		
		//<==== toString()===========>
		
		String s= Integer.toString(10);
		System.out.println(s);
		
		
		
		

	}

}
