import java.io.*;
public class LaunchFileIOBufferWriter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		File f1 = new File("Bard.txt");
		f1.createNewFile();
		FileWriter fw=new FileWriter("Bard.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Google Bard is a new chatbot tool launched in the wake of competitor artificial intelligence (AI) like ChatGPT. It’s designed to simulate conversations with a human and uses a combination of natural language processing and machine learning, to provide realistic, and helpful responses to questions you might ask it. Such tools may become particularly useful for smaller companies who want to offer natural language support to their customers without hiring large teams of support staff, or for augmenting Google’s own search tools."
			+"Bard can be integrated into websites, messages platforms, applications on desktop and mobile, and a range of digital systems. At least it will be. It’s not readily available outside of a limited beta test run; at least for now."
				+ "It has been under development for some years and uses LaMDA (Language Model for Dialogue Applications) technology. It’s built on top of Google’s Transformer neural network architecture, which was also the basis for other AI generative tools, like ChatGPT’s GPT-3 language model."
				+ " Showcased for the first time on February 6, 2023, Google Bard was off to a rocky start, as in its preview demonstration, Google Bard made a mistake in answering a question about the James Webb Space Telecsope’s recent discoveries. It claimed that it had been the first to take a picture of an exoplanet outside of our solar system, but in fact, that happened many years earlier. That Google Bard displayed this erroneous information with such confidence caused heavy criticism of the tool, drawing comparisons with some of ChatGPT’s weaknesses. Google’s stock price fell several points in response.");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		char[] ch= {'P',' ','W',' ',':','S',' ','K'};
		
		bw.write(ch);
		bw.write("10");
		bw.write("20");
		bw.write("30");
		
		
		bw.close();
		
		// Read Operation : 
		
		FileReader fr = new FileReader(f1);
		
		
		BufferedReader br = new BufferedReader(fr);
		String line =br.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}

	}

}
