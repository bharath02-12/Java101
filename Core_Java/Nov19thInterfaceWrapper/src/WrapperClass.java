

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1= new Integer(10);
		System.out.println(i1);// toString() is called when we print somethong 
		Integer i2= new Integer("10");
		System.out.println(i2);
		//Integer i3= new Integer("Ten");----> This is exception 
		//System.out.println(i3);
		Float f1 = new Float(10.5f);
		System.out.println(f1);
		
		Float f2 = new Float("10.5f");
		System.out.println(f2);

		Float f3 = new Float("10.5");
		System.out.println(f3);
		
		Float f4 = new Float(10.5);
		System.out.println(f4);
	
		Character c = new Character('a');
		System.out.println(c);
		
		Boolean b1 = new Boolean(true);
		System.out.println("b1 = "+b1);
		
		Boolean b2 = new Boolean(false);
		System.out.println("b2 = "+b2);
		
		
		Boolean b3 = new Boolean("true");
		System.out.println("b3 = "+b3);
		
		
		Boolean b4 = new Boolean("TRUE");
		System.out.println("b4 = "+b4);
		
		
		Boolean b5 = new Boolean("false");
		System.out.println("b5 = "+b5);
		
		
		Boolean b6 = new Boolean("yes");
		System.out.println("b6 = "+b6);
		
		Boolean b7 = new Boolean("true");//---> false
	
		Boolean b8 = new Boolean("no");//--->fasle
		
		System.out.println(b7.equals(b8));// true.equals(false)-->> false
		System.out.println(b7==b8);// Reference --. False 
		
		
		
		
		
		
		
		

	}

}
