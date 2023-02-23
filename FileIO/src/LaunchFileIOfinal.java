import java.io.*;
public class LaunchFileIOfinal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//File class--> create file obj 
		
		File f1 = new File("cool.txt");
		System.out.println(f1.exists());
		System.out.println(" File Obj is Created ,Not the File !!");
		f1.createNewFile();
		System.out.println(" File is created using the method :: createNewFile() ");
		System.out.println(" But this is created in a current running directory ");
		
		// Create a directory : 
		System.out.println("*************************************************");
		
		String location = "Cool Stuff";
		File f2 = new File(location,"verycool.txt");
		f2.mkdir();
		System.out.println(f2.exists());
		System.out.println(" Create the Dir First Dude !");
		System.out.println("---------------------------------------");

		
		File f3 = new File(location);
		f3.mkdir();
		System.out.println(" Dictinoary is created !");
		System.out.println(f3.exists());
		
		System.out.println(" Create the File in that directory !");
		File f4 = new File(location , "verycool.txt");
		f4.createNewFile();
		System.out.println(f4.exists());
		System.out.println(f4.isDirectory());
		System.out.println(f4.isFile());
		
		System.out.println("-------------------------------------------");
		
		File f5 = new File("local");
		f5.mkdir();
		System.out.println(f5.exists());
		System.out.println(" Is it a Directory "+f5.isDirectory());
		System.out.println(" Is it a File "+f5.isFile());
		
		File f6 = new File("local","local1.txt");
		f6.createNewFile();
		System.out.println(" IS file ?? : "+f6.isFile());
		
		System.out.println("-------------------------------------------");
		String loc="Butter";

		File f7 = new File(loc);
		f7.mkdir();
		System.out.println(" Dictinoary is created !");
		System.out.println(f7.exists());
		
		System.out.println(" Create the File in that directory !");
		File f8 = new File(loc , "Amul.txt");
		f8.createNewFile();
		System.out.println(f8.exists());
		System.out.println(f8.isDirectory());
		System.out.println(f8.isFile());
		System.out.println("-------------------------------------------");
		String lol="lol";

		File f9 = new File(lol);
		f9.mkdir();
		System.out.println(" Dictinoary is created !");
		System.out.println(f9.exists());
		File f10 = new File(lol,"laugh.txt");
		f10.createNewFile();
		System.out.println(" Is F10 the File ?"+f10.isFile());
		System.out.println(" Is F10 the File ?"+f10.isDirectory());
		
		System.out.println("-------------------------------------");
		System.out.println(" Creation of File in Other Dir");
		
		File f11= new File("E://projects");
		f11.mkdir();
		System.out.println(f11.exists());
	
		
		System.out.println(" If you want to get all the names of the files we use ::==> list function on Directory  = "+f9.list());
		
		System.out.println(" If you want to get all the names of the files we use ::==> list function can not be used on File  = "+f10.list());
		
		System.out.println("##################################################################");

		System.out.println(" Now Files arw Scuccesfully Created , Write SOmething in It ");
		System.out.println(" File Writers are used to Write Something to the File");
		
		System.out.println(" FILE-WRITER");
		
		FileWriter f20 = new FileWriter("no.txt");
		f20.write("Hello All");
		char[] ch= {'A','B','C','D','E','F'};
		f20.write(ch);
		
		
		FileWriter f21 = new FileWriter("no.txt",true);
		f21.write("Hello All");
		char[] ch1= {'K',' ','B',' ','C',' ','D',' ','E',' ','F'};
		f21.write(ch);
		f21.write(ch1);
		f21.flush();
		f20.flush();
		
		

		
	}

}
