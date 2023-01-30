//WAP to compute length of String 

@FunctionalInterface
interface CLS{
	int getLength(String str);
}

class LOS implements CLS{
	public int getLength(String str) {
		return str.length();
	}
	
}

////////////////////////



public class LaunchLambda5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LOS los= new LOS();
		System.out.println(los.getLength("hELLO "));
		
		
		// Inner Class
		CLS cls = new CLS() {
			public int getLength(String str) {
				return str.length();
				
			}
			
		};
		
		System.out.println(cls.getLength("Inueron!"));
		
		
		// Lambda Experssion ----> As it is functoional interface !!
		
		CLS cls1=str->str.length();
		
		System.out.println(cls1.getLength("Bharath!!"));

	}

}
