import java.io.*;

// Write a Program to Display only the file names under the location D:Downloads
public class LaunchFileIO4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String location="D://Downloads";
		File f = new File(location);
		
		System.out.println(" The No Of Files are : ");

		
		String[] contents = f.list();
		for(String a:contents) 
		{
			File f1= new File(f,a);
			if(f1.isFile())
			{
				System.out.println(a);
				System.out.println("----------------------------");
				
			}
		}
		System.out.println("*********************************************");
		
		System.out.println(" The No Of Directories are : ");
		
		for(String a:contents) {
			File f1= new File(f,a);
			if(f1.isDirectory())
			{
				System.out.println(a);
				
			}
		}
		
		 System.out.println("*******************************************");
		System.out.println(" All the Word Doc files :");
	
		
		for(String a:contents) {
			File f1= new File(f,a);
			if(f1.isFile())
			{
				if(a.endsWith(".pdf"))
				{
					System.out.println(a);
					System.out.println("+++++++++++++++++++++++++++++++++");
				}
				
				
			}
		}
		
		
		
	}

}
