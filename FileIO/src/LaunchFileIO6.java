import java.io.*;
public class LaunchFileIO6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f= new File("GPT.txt");
		f.createNewFile();
		
		FileWriter f1= new FileWriter("GPT.txt");
		f1.write("veryone has an opinion about Chat-GPT and AI. Engineers and entrepreneurs see it as a new frontier: a bold new world to invent products, services, and solutions. Social scientists and journalists are worried, with one prominent NYT author Ezra Klein calling it an “information warfare machine.” What has god wrought?\r\n"
				+ "\r\n"
				+ "Let me just say up front, I see enormous possibilities here. And as with all new technologies, we cannot fully predict the impact quite yet. There will be problems and failures, but the ultimate story is “hooray.”\r\n"
				+ "\r\n"
				+ "What Is Chat-GPT?\r\n"
				+ "\r\n"
				+ "To put it quite simply, this technology (and there are many others like it) is what is often called a “language machine” that uses statistics, reinforcement learning, and supervised learning to index words, phrases, and sentences. While it has no real “intelligence” (it doesn’t know what a word “means” but it knows how it is used), it can very effectively answer questions, write articles, summarize information, and more.");
		f1.flush();
		f1.close();
		
		FileReader f2= new FileReader("GPT.txt");
		char[] ch= new char[(int) f.length()];
		System.out.println(f2.read(ch));
		for(char data:ch) {
			System.out.print(data);
			
		}

	}

}
