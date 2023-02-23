// Customized Seralization !!

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String userName="sachin";
	transient String password="tendulkar";//
	
	// Write a logic of Deserialization
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();
		String encypwd="123"+password;
		oos.writeObject(encypwd);
		System.out.println("writeObject method is called...");
	}
	
	// Write a logic of Deserialization
	private void readObject(ObjectInputStream ois) throws IOException, Exception{
		ois.defaultReadObject();
		String pass=(String)ois.readObject();
		password=pass.substring(3);
		
		System.out.println("ReadObject method is called...");
	}
	
	
}
public class LaunchSer3 {

	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
		Account ac= new Account();


		System.out.println("Starting the Serialization !");
		FileOutputStream fo= new FileOutputStream("acc.ser");
		
		ObjectOutputStream oos=new ObjectOutputStream(fo);
		
		oos.writeObject(ac);
		System.out.println(" The Account Obj that was serialized is : "+ac);
		System.out.println(" Serialization Ended !");
		System.out.println("*************************************************");
		
		System.in.read();
		
		System.out.println(" De-Seralization Starting ....");
		
		FileInputStream fi = new FileInputStream("acc.ser");
		ObjectInputStream ois= new ObjectInputStream(fi);
		Object obj=ois.readObject();
		Account ac1= (Account) obj;
		System.out.println(" The account user is "+ac1.userName);
		System.out.println(" The account password is "+ac1.password);
		
		
		System.out.println(" De-Seralization Ended !");

	}

}
