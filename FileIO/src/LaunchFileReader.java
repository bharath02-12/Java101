import java.io.*;
public class LaunchFileReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		try {
			
		FileReader f1 = new FileReader("mona.txt");
		
		int i =f1.read();
		
		while(i!=-1) {
			System.out.println("i "+i+" is ==> "+(char)i);
			i=f1.read();
		}
		}
		catch(Exception e){
			System.out.println(" Sorry please reCheck");
		}

	}

}
