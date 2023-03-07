abstract class Parent100{
	
	Parent100()
	{
		System.out.println(" I am Parent class Constructor !!");
	}
}

class Child100 extends Parent100
{
	
	
}
public class LaunchBasic
{

	public static void main(String[] args) {
		Parent100 c = new Child100();
	}
}
