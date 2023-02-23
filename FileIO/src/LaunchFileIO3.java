import java.io.*;
public class LaunchFileIO3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location ="E:java";
		File f1= new File("E:java");
		f1.mkdir();
		int count=0;
		
		File f2 = new File(f1,"One.txt");
		System.out.println(f2.exists());
		f2.createNewFile();
		System.out.println(f2.exists());
		
		String contents[]=f1.list();
		
		for(String s: contents ) {
			count++;
			System.out.println(s);
		}
		
		count=0;
		System.out.println(count);
		
		String location1="D:\\Downloads";
		File f3= new File(location1);
		String[] data= f3.list();
		
		
		for(String d:data) {
			count++;
			System.out.println(d);
		}
		
		System.out.println(count);

		int dirCount=0;
		int fileCount=0;
		
		for(String d:data) 
		{
			File f= new File(f3,d);
			if(f.isDirectory()) 
			{
				dirCount++;
				
			}
			
			else if(f.isFile())
			{
				fileCount++;
			}
		}
		
		System.out.println(dirCount);
		System.out.println();
		System.out.println(fileCount);
		
		
		
	}

}
