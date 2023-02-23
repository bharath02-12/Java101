import java.io.*;
public class LaunchFileIOPrint {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("GPT.txt");
		PrintWriter pw=new PrintWriter(fw);
		
		pw.write(100);
		pw.println();
		pw.write("Hello");
		pw.println();

		pw.println(100);
		pw.println();

		pw.close();

	

	}

}
