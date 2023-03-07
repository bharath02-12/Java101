@FunctionalInterface
interface Java{
	void learn();
}

@FunctionalInterface
interface JavaScript{
	void js(String preReq);
}

interface Devops{
	String Dev();
}

@FunctionalInterface
interface DSA{
	void coding(int time,int noOfQuestions);
}

interface Study{
	void learn();
	void practice();
	void write();
	void master();
}
public class LaunchFunctionInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Java j =()->System.out.println(" Learning Java ");
		j.learn();
		
                      // NO NEED OF TYPE 
		JavaScript js=(s)->System.out.println(s+" Needed to Learn JavaScript ");
		
		                // Single parameter , Curly Braces also Optional !
		JavaScript js1=s->System.out.println(s+" Needed to Learn JavaScript ");
		js.js("HTML & CSS");
		
		Devops d =()->{ return " Devops";};
		
		Devops d1 =()-> " Devops";// NO Need of return statement 
		
		
		System.out.println(d.Dev());
		
		
		
		DSA ds =(a,b) ->  System.out.println("In "+a+" Months in you slove "+b +" Questons , You can be Coder !");
		
		ds.coding(6, 650);
		
		// Annonymous Inner Classes !!
		
		 Study s= new Study() {
			public void learn(){
				System.out.println(" First Learn the Stuff ");
			}
			
			public void practice() {
				System.out.println(" Parctie what you have learnt ");
			}
			
			public void write() {
				System.out.println(" Write the Stuff you have learnt ");
			}
			
			public void master() {
				System.out.println(" Here you are you Mastered it @!!");
			}
		};
		
		
		
	}
	
	

	
}
