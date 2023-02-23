import java.io.*;

class Dog implements Serializable{
	static{
		System.out.println(" I am Static Block");
	}
	
	
	int i=10;
	int j=20;
	
	Dog(){
		System.out.println(" I am the constructor ");
	}
	
}
class Cat implements Serializable{
	static{
		System.out.println(" I am Static Block");
	}
	
	
	int i=1;
	int j=2;
	
	Cat(){
		System.out.println(" I am the constructor ");
	}
	
}

public class LaunchSer1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		
		System.out.println(" We have to do seralization to keep the Obj in File");
		System.out.println(" Seralization started ......");
		//1: FileOutPutStream 
		FileOutputStream f1=new FileOutputStream("abc.ser");
		
		//2:ObjectOutputStream
		ObjectOutputStream obj=new ObjectOutputStream(f1);
		
		// public final void writeObject(java.lang.Object) throws java.io.IOException;
		
		
		//3. Writing the Obj to the 
		obj.writeObject(d1);
		obj.writeObject(c1);
	
		System.out.println(" The Ref is "+d1);
		System.out.println(" The Ref is "+c1);
		System.out.println(" Seralization Ended ......");
		
		System.in.read();
		
		System.out.println(" De-Seralization Started......");
		
		FileInputStream fi= new FileInputStream("abc.ser");
		
		ObjectInputStream ojis= new ObjectInputStream(fi);
		Object objf=ojis.readObject();
		Dog d = (Dog)objf;
		
		Object objf1=ojis.readObject();

		Cat c = (Cat)objf1;
		System.out.println(" The Ref is "+d);
		System.out.println(" The Ref is "+c);
		System.out.println(d);
		
		System.out.println(" De- Seralization Ended ....");

	}

}
