
class Student{
		private String name;
		private Integer age;
		private Integer sid;
		
		public Student(String name, Integer age, Integer sid) {
			super();
			this.name = name;
			this.age = age;
			this.sid = sid;
		}
	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public Integer getSid() {
			return sid;
		}
		public void setSid(Integer sid) {
			this.sid = sid;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", sid=" + sid + "]";
		}

	
		
		
	}

public class LaunchInterfaceOne {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st =new Student("Sachin ", 50 , 10 );
		System.out.println(st);
		

	}


}
