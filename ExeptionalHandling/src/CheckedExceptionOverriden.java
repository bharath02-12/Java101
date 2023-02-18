
class Parent{
	public void m1() {}
}
class Child extends Parent{
	 /* 
	  * Checked exception ,If child throws exception then then  parent should h  child 
	public void m1() throws Exception{}
    }
    
    */
	// Unchecked exception ---> No rule 
	public void m1() throws NullPointerException{}
}
public class CheckedExceptionOverriden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
