import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.*;

class Animal {
	int i=10;
	
	Animal(int i){
		System.out.println(" Hello");
	}
	
}


class D extends Animal implements Serializable
{
	

	D(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	int j=20;

	
	
}
public class LaunchSer8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		D d = new D(10);
		d.i=200;
		d.j=400;

		System.out.println(" Seralization Started !!");
		FileOutputStream fo = new FileOutputStream("d.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fo);
		oos.writeObject(d);
		System.out.println(" Searlization Ended !");
		
		FileInputStream fi = new FileInputStream("d.ser");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Object obj=oi.readObject();
		D d1=(D) obj;
		System.out.println(d1.i);
		System.out.println(d1.j);
		
	
		System.out.println(d1);
		
		

	}

}
