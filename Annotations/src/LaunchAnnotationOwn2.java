import java.lang.annotation.ElementType;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
	String country() default "India";
	int runs() default 100;
	
}

@CricketPlayer
class Virat{
	private int innings;
	private String name;
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class LaunchAnnotationOwn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Virat vk = new Virat();
		vk.setInnings(100);
		vk.setName("VK");
		
		System.out.println(vk.getInnings());
		System.out.println(vk.getName());
		
		
		
	}

}
