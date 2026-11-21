package Package2;

import Package1.Student;

public class Test2 extends Student{

	public static void main(String[] args) {

Student s3 = new Student();
System.out.println(s3.name1); // accessible
// System.out.println(s3.name2); // not accessible private
// s3.display(); // using method can access

Test2 t = new Test2();
System.out.println(t.name3); // not accessible directly but when extends inheritance we can access
 
	}

}
