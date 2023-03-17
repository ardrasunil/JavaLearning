import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	int rolllNo;
	String name;
	Student(int rollNo,String name){
		rollNo = this.rolllNo;
		name = this.name;
	}
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Golu");
		Student s2 = new Student(2,"Molu");
		
		ArrayList<Student> sList = new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		
		Iterator itr = sList.iterator();
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.rolllNo+" "+st.name);
			}
		
	}
	
}
