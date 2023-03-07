class Wrap{}
public class LaunchWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i1 = new Integer(10);
		Integer i2= new Integer("10");
	//	Integer i3= new Integer("ten"); //---> Exception !!
	//	Integer i4 = new Integer("Ten"); //---> Exception !!
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean(false);
		Boolean b2 = new Boolean("True");//--> true 
		Boolean b3 = new Boolean("true");//---? true
		Boolean b4 = new Boolean("False");//---> False
		Boolean b5 = new Boolean("false");// false
		Boolean b6 = new Boolean("Jack");//false
		//System.out.println(b);
		System.out.println(b.equals(b1));
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));
		System.out.println(" Watch this: "+b5.equals(b6));
		
	
		
		Float f1 = new Float(2.5f);
		
		Float f2 = new Float("2.5f");
		System.out.println(f1.equals(f2));
		
		
		System.out.println("********** Primitive/string  to Wrapper** :: Valueof()***************");
        Integer i5 = Integer.valueOf(10);
        Integer i6= Integer.valueOf("10");
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i5.equals(i6));
        
        System.out.println("*****  Wrapper Obj to Primitive Type :: XXXvalue() *****");
        Integer i7=new Integer(100);
        System.out.println(i7.byteValue());
        System.out.println(i7.intValue());
        System.out.println(i7.doubleValue());
        System.out.println("********** Converting String to Primitive Type***** :: ParseXXX()****");
        int a =Integer.parseInt("10");
        System.out.println(a);
        
        System.out.println("******Converting Wrapper to String ****** :: toString() ****");
        String s1 =Integer.toString(10);
        System.out.println(s1);
        
		
		
		
		

		
	}

}
