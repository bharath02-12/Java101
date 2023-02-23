import java.io.*;
public class LaunchFileIOCopyFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		File f3 = new File("file3.txt");
		f3.createNewFile();
		
	
		
		FileReader fr= new FileReader("file1.txt");
		BufferedReader bf1= new BufferedReader(fr);
		
		FileWriter fw3 = new FileWriter(f3);
		PrintWriter pw3=new PrintWriter(fw3);
		
		String data=bf1.readLine();
		
		while(data!=null) {
			
			pw3.print(data);
			data=bf1.readLine();
		}
		
		//------------------------------------------------
		
	
		
		FileReader fr2= new FileReader("file2.txt");
		BufferedReader bf2= new BufferedReader(fr2);
		
		
       String data2=bf2.readLine();
       pw3.println();
		
		while(data2!=null) {
			
			pw3.print(data2);
			data2=bf2.readLine();
			
		}
		
	pw3.flush();
	pw3.close();
	bf1.close();
	bf2.close();
		
		
	
		
		

	}

}
