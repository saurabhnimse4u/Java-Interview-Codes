package Package1;

public class Test1 {

	public static void main(String[] args) {


		Student s1=new Student();
		
		System.out.println(s1.name1);  
	// 	System.out.println(s1.name2);  not access directly because access modifier is private
  	    System.out.println(s1.name3); // can access directly because access modifier is protected but not outside of package
	
  	    s1.display();
  //    s1.display2();  // can not access because its private
	}

}
