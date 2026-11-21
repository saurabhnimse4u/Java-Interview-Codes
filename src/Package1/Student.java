package Package1;

public class Student {
	
	public String name1 = "Saurabh";
	private String name2 = "Shivani";
	protected String name3 = "Nikita";
	
	public void display() {
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
	}
	
	private void display2() {
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.display();  
		s.display2();
	}
	

}
