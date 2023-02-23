import java.io.*;
class Dog1 implements Serializable{
	 static transient int i =10;//--> To Stop This Variable to not Participate in Seralization !!
	 int j=20;
	
}
public class LaunchSer2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Dog1 d1 = new Dog1();
		
		System.out.println("Starting the Serialization !");
		FileOutputStream fo= new FileOutputStream("xyz.ser");
		
		ObjectOutputStream oos=new ObjectOutputStream(fo);
		
		oos.writeObject(d1);
		System.out.println(" The Obj that was serialized is : "+d1);
		System.out.println(" Serialization Ended !");
		
		System.in.read();
		
		System.out.println(" De-Seralization Starting ....");
		
		FileInputStream fi = new FileInputStream("xyz.ser");
		ObjectInputStream ois= new ObjectInputStream(fi);
		Object obj=ois.readObject();
		
		Dog1 d=(Dog1) obj;
		System.out.println(" The Obj was De-Seralized is "+d);
		System.out.println(" The values are "+d.i+" --> "+d.j);
		System.out.println(" De-Seralization Ended !");

	}

}
