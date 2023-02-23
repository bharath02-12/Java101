import java.io.*;
public class LaunchFileIO2 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		String fileName="abc0.txt";
		// This line will check ,weather file called abc.txt exsist or not 
		
		// If it==
		File f=new File(fileName);
		System.out.println(f);
		System.out.println(f.exists());
		f.createNewFile();
		
		System.out.println(f.exists());
		
		String directoryName="IPLteams";
		
		File f2=new File(directoryName);
		System.out.println(f2.exists());
		
		f2.mkdir();
		System.out.println(f2.exists());
		
		File f3 = new File("new.txt");
		System.out.println(f3.exists());
		f3.createNewFile();
		System.out.println(f3.exists());
		
		File f4 = new File("Files");
		System.out.println(f4.exists());
		f4.mkdir();
		System.out.println(f4.exists());
		
		File f5 = new File("Files","abc.txt");
		System.out.println(f5.exists());

		f5.createNewFile();
		System.out.println(f5.exists());
		
		File f100= new File("Neuron");
		f100.mkdir();
		System.out.println(" Is this Directory !"+f100.isDirectory());
		
		File f101= new File(f100,"rrr.txt");
		f101.createNewFile();
		System.out.println(" Is file "+f101.isFile());
		
		
		
		
		File f200= new File("Home");
		f200.mkdir();
		File f201= new File("Home","text.txt");
		System.out.println(" Is it pointing to Dir "+f200);
		f200.createNewFile();
		f201.createNewFile();
		System.out.println(" Is it pointing to file"+f200);
		System.out.println(" Is it pointing to file"+f201);
		
		File f99 = new File("jijo");
		System.out.println(f99.exists());

		f99.mkdir();
		System.out.println(f99.exists());
		
		File f88= new File(f99,"roomate.txt");
		System.out.println(f88.exists());
		f88.createNewFile();
		System.out.println(f88.exists());
		
		
		
		File f00 = new File("Killi");
		System.out.println(f99.exists());
		
		f00.mkdir();
		System.out.println(f00.exists());
		
		File f010= new File(f99,"death.xml");
		System.out.println(f010.exists());
		f010.createNewFile();
		System.out.println(f010.exists());
		
		File f011= new File(f99,"death.pdf");
		System.out.println(f011.exists());
		f011.createNewFile();
		System.out.println(f011.exists());
		
		String location="E://pwskills";
		
		File f55= new File(location);
		f55.mkdir();
		
		File f56 = new File(f55,"Holla.txt");
		f56.createNewFile();
		
		File f560 = new File(f55,"H.jpg");
		f56.createNewFile();
		
		
		
		
		
		
		File f506 = new File(f55,"Holla.doc");
		f56.createNewFile();
		
		
		

		


	}

}
