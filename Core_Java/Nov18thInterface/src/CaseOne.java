class Sample{
	public void m1() {
		System.out.println(" hELLO M1");
		
	}
}

interface IDemo{
	void m2();
}

class IDemoImpl extends Sample implements IDemo {/// First Extends ---> Than Implement it 
	public void m2() {
		System.out.println(" Hello M2");
	}
	public void m1() {
		System.out.println(" Hello Mamam");
		
	}
}
public class CaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDemo id= new IDemoImpl();
		id.m2();
		((IDemoImpl) id).m1();

	}

}
