import java.io.*;
public class LaunchFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter f=new FileWriter("Write.txt",true);
		f.write(100);
		f.write("\n");
		
		f.write("Hello Welcome WeLCome");
		f.write("\n");
		char[] ch= {'A','B','C','D'};
		f.write(ch);
		
		// Close the Resoursce
		f.flush();
		f.close();
	}

}
