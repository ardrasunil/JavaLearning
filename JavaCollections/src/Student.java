import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	int rollNo;
	String name;
	public Student(int rollNo,String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Golu");
		Student s2 = new Student(2,"Molu");
		
		ArrayList<Student> sList = new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		
		Iterator<Student> itr = sList.iterator();
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.rollNo+" "+st.name);
			}
		for(Student st : sList) {
			System.out.println(st.rollNo+" "+st.name);
		}
	}
	
}
