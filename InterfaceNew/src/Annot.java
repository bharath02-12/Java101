import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Money{
	String countrY() default "USA";
	
}

@Money
public class Annot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
