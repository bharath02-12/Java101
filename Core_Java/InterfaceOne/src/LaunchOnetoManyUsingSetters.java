

class Models
{
	private String mname;
	private int myear;
	private int mprice;
	private int milage;
	private String mtype;
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMyear() {
		return myear;
	}
	public void setMyear(int myear) {
		this.myear = myear;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	
	
}


class Brand
{
	private String brandname;
	private int eos;
	
	// Has-A  Array ( Many ) 
	Models[] model1;

	public String getBrandname() 
	{
		return brandname;
	}

	public void setBrandname(String brandname) 
	{
		this.brandname = brandname;
	}

	public int getEos()
	{
		return eos;
	}

	public void setEos(int eos)
	{
		this.eos = eos;
	}

	public Models[] getModel1() 
	{
		return model1;
	}

	public void setModel1(Models[] model1)
	{
		this.model1 = model1;
	}
	
	
	public void getModelDetails() {
		System.out.println(" ******  Hello Welcome to our Brand : "+brandname+" *******  ");
		System.out.println(" We are happy that we are serving from "+eos);
		System.out.println("  we have different models under our brand !! ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		for (Models models : model1) 
		{
			System.out.println(" The name of the Car is "+models.getMname());
			System.out.println(" The Year launch  of the Car is "+models.getMyear());
			System.out.println(" The Model  of the Car is "+models.getMtype());
			System.out.println(" The Price  of the Car is "+models.getMprice());
			System.out.println(" The Milage  of the Car is  "+models.getMilage());
			System.out.println("	");
			System.out.println("	");
			System.out.println("	");
			
			
		}
		
	}
	
	
	
}
public class LaunchOnetoManyUsingSetters {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Models data : 
		
		Models mod1=new Models();
		mod1.setMname("Forte");
		mod1.setMprice(22000);
		mod1.setMilage(37);
		mod1.setMtype("Sedan");
		mod1.setMyear(2016);
		
		Models mod2=new Models();
		mod2.setMname("Soul");
		mod2.setMprice(19000);
		mod2.setMilage(40);
		mod2.setMtype("Compact");
		mod2.setMyear(2018);
		
		
		Models mod3=new Models();
		mod3.setMname("K5");
		mod3.setMprice(32000);
		mod3.setMilage(38);
		mod3.setMtype("Mid Size");
		mod3.setMyear(2021);
		
		Models mod4=new Models();
		mod4.setMname("Soranto");
		mod4.setMprice(39000);
		mod4.setMilage(35);
		mod4.setMtype("Compact SUV ");
		mod4.setMyear(2020);
		
		
		Models mod5=new Models();
		mod5.setMname("Teluraud");
		mod5.setMprice(49000);
		mod5.setMilage(42);
		mod5.setMtype("SUV ");
		mod5.setMyear(2023);
		
		
		Models[] model1= new Models[5];
		
		model1[0]=mod1;
		model1[1]=mod2;
		model1[2]=mod3;
		model1[3]=mod4;
		model1[4]=mod5;
		
		Brand brand=new Brand();
		brand.setBrandname(" KIA ");
		brand.setEos(1995);
		brand.setModel1(model1);
		brand.getModelDetails();
		
		
	
		
		
		
		
		
		

	}

}
