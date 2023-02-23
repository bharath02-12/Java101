import java.io.*;

class BankAccount implements Serializable{
	String username="Nitin";
	transient String password="java";
	transient int balanace=200000;
	
	private void writeObject(ObjectOutputStream oos ) throws Exception{
		oos.defaultWriteObject();
		String encryppass="hello"+password;
		int encrypbalance=balanace+5555;
		oos.writeObject(encryppass);
		oos.writeInt(encrypbalance);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception{
		ois.defaultReadObject();
		String enpass=(String)ois.readObject();
		Integer enbal=(Integer)ois.readInt();
		password=enpass.substring(5);
		balanace=enbal-5555;
		
		
	}
	
}
public class LaunchSer4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BankAccount ac= new BankAccount();


		System.out.println("Starting the Serialization !");
		FileOutputStream fo= new FileOutputStream("accbal.ser");
		
		ObjectOutputStream oos=new ObjectOutputStream(fo);
		
		oos.writeObject(ac);
		System.out.println(" The Account Obj that was serialized is : "+ac);
		System.out.println(" Serialization Ended !");
		System.out.println("*************************************************");
		
		System.in.read();
		
		System.out.println(" De-Seralization Starting ....");
		
		FileInputStream fi = new FileInputStream("accbal.ser");
		ObjectInputStream ois= new ObjectInputStream(fi);
		Object obj=ois.readObject();
		BankAccount ac1= (BankAccount) obj;
		System.out.println(" The account user is "+ac1.username);
		System.out.println(" The account password is "+ac1.password);
		System.out.println(" The account balance is "+ac1.balanace);
		
		
	}

}
