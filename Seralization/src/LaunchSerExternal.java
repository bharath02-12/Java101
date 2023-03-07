import java.io.*;


class Demo implements Externalizable{
	 String name;
	 transient int i;
	int j;
	
	public Demo(){
		System.out.println(" Public Zero Arugement constructor is called ");
		
	}
	
	public Demo(String name,int i ,int j) {
		this.name=name;
		this.i=i;
		this.j=j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(" writeExternal is called for the Serialization");
		out.writeObject(name);
		out.writeInt(i);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.println(" readExternal is called for the De Serialization");
		
		name=(String)in.readObject();
		i=in.readInt();

	}
}
public class LaunchSerExternal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Demo d = new Demo("Nitin",10,20);
		
		System.out.println(" Seralization Started !");
		FileOutputStream fo= new FileOutputStream("ext.ser");
		
		ObjectOutputStream oos= new ObjectOutputStream(fo);
		oos.writeObject(d);
		
		
		System.out.println(" Seralization Ended ");
		
		System.out.println(" De-Seralization  Started");
		
         FileInputStream fi= new FileInputStream("ext.ser");
		
		ObjectInputStream ois= new ObjectInputStream(fi);
		Demo d1=(Demo)ois.readObject();
		
		System.out.println(d1.name+ " "+d1.i+" "+d1.j);
		
		
		

		

	}



}
