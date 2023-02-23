import java.io.*;

public class LaunchFileIORemoveDuplic {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f = new File("uni.txt");
		f.createNewFile();
		PrintWriter pw = new PrintWriter(new FileWriter(f));

		BufferedReader bf1 = new BufferedReader(new FileReader("dup.txt"));

		BufferedReader bf2 = new BufferedReader(new FileReader(f));

		String out = bf1.readLine();
		System.out.println(out);
		pw.write(out);

		
		
		  String in=bf2.readLine();
		  boolean isAvailable=true; 
		  while(out!=null)
		  
		  { 
			  
	 while(in!=null)
		   
		  {
			  
	if(out.equals(in)) 
			  
		     { 
			  isAvailable=true; 
			  }
		  else
		      {
		        isAvailable=false; 
		      }
		  
		  }
		  
		  if(isAvailable==false)
		  { pw.write(out);
		  }
		  
		  
		  }
		 
		  pw.flush();
		  pw.close();
		  bf1.close();
		  bf2.close();
		 

	}

}
