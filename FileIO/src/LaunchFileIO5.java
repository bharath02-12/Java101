import java.io.*;
public class LaunchFileIO5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String loc="C:\\Program Files";
		
		File f1 = new File(loc);
		
		String[] files=f1.list();
		
		for( String content:files) {
			
			File f= new File(f1,content); 
			if(f.isDirectory()) {
				System.out.println(" The Directory name is : "+content);
				System.out.println("----------------------------------------------");
			}
			else if( f.isFile()) {
				
				System.out.println(" The File name is : "+content);
				System.out.println("__________________________________________");

			}
			
		}
		
		

	}

}
