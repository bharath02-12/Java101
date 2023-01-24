import java.util.Arrays;
import java.util.Scanner;

public class StringsLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	//System.out.println("Enter the upper char");	
	
	
	/*
	 * // Upper to lower for( int i=0;i<s1.length();i++ ) { int upper=s1.charAt(i);
	 * 
	 * char low= (char)(upper+32); s2=s2+low; }
	 * 
	 * System.out.println(s2);
	 */
	
		
	/*
	 * for( int i=0;i<s1.length();i++) { int lower=s1.charAt(i);
	 * 
	 * char upper = (char) ( lower-32);
	 * 
	 * s2=s2+upper; }
	 * 
	 * System.out.println(s2);
	 */
	
	
	/*
	 * for( int i=0;i<s1.length();i++) {
	 * 
	 * char c1=s1.charAt(i);
	 * 
	 * int ascii=c1; //System.out.println(c1 +" "+ ascii);
	 * 
	 * if( ascii<=122&&ascii>=97) { // it is lower ---> convert to upper
	 * 
	 * char upper=(char)(ascii-32); s2=s2+upper;
	 * 
	 * } else if( ascii>=65 && ascii<=90) { // it is upper ----> convert to lower
	 * 
	 * char lower=(char)( ascii+32); s2=s2+lower;
	 * 
	 * 
	 * } }
	 */
	
	/*
	 * for(int i=s1.length()-1;i>=0;i--) { s2=s2+s1.charAt(i); }
	 * System.out.println(s2);
	 */
	
	/*
	 * String s1="ineuron java";
	 * 
	 * String s2="";
	 * 
	 * String sarr[]=s1.split(" ");
	 * 
	 * for( String ele:sarr) { for( int i=ele.length()-1;i>=0;i--) {
	 * s2=s2+ele.charAt(i);
	 * 
	 * } s2=s2+" ";
	 * 
	 * }
	 * 
	 * System.out.println(s2);
	 * 
	 * s2="";
	 * 
	 * for( int i=sarr.length-1;i>=0;i--) { s2=s2+sarr[i]; s2=s2+" ";
	 * 
	 * }
	 * 
	 * System.out.println(s2);
	 * 
	 * String s3=" "; s3.trim();
	 * 
	 * System.out.println(s3.equals("")+" "+s3.isEmpty());
	 * 
	 * System.out.println("" == "");
	 * 
	 */
	
	
	// Palaindrom : 
	/*
	String s1="Nitin";
	s1=s1.toLowerCase();
	boolean flag=true;
	
	for( int i=0;i<(s1.length())/2;i++) 
	{	
		//System.out.println(s1.charAt(i));
		//System.out.println(s1.charAt(s1.length()-1-i));
		if( s1.charAt(i)!=s1.charAt(s1.length()-1-i)) 	
		{
			flag=false;
		
		}
		
		
	}
	
	if( flag==false) {
		System.out.println("String is not Palindrome");
	}
	else {
		System.out.println("String is Palindrome");
	}
	
	*/
		
		/*
		String s1="NITIN";
		String s2="";
		
		for( int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		
		if(s1.equals(s2))
			System.out.println("it is Palindromr");
		else 
			System.out.println("Not palindrome !!");
			
			*/
		
		
		/*
		// Anagram :
		
		String s1="Rave";
		String s2="care";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("It is Anagram !!");
		}
		else {
			System.out.println("Not a Anagram !");
		}

		
		
		*/
		
		/*
		
		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		s1=s1.replace(" ","");
		
		char[] ch =s1.toCharArray();
		
		int[] arr= new int[26];
		
		for( int i=0;i<ch.length;i++) 
		{
			int index=ch[i]-65;
			arr[index]++;
			
		}
		boolean flag=true;
		
		for( int i=0;i<arr.length;i++) 
		{
			
			if(arr[i]==0) 
			{
				System.out.println("It is not  panagaram");
				flag=false;
				break;
				
			}
		}
		
		
		*/
		
		
		
	
	
		}
	}
