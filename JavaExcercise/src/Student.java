import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;


class Student extends Person{
	
	private int studentId;
	private double cgpa;
	String department;
	ArrayList<String> courseTaken = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
	public int getStudentId() {
		return studentId;
	}

	
	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	
	Student(){
		
	}
	
	/*Student(String name, String email, String department,int studentId,double cgpa) {
		super(name, email, department);
		this.studentId = studentId;
		this.cgpa = cgpa;
		
	}*/
	
	@Override public void dispDetails() {
		System.out.println("Student ID: "+studentId);
		super.dispDetails();
		System.out.println("Department : "+department);
		System.out.println("CGPA : "+cgpa);
		System.out.print("Courses Opted : ");
		this.showCourse();
		
	}
	
	//show course details of each student
	public void showCourse() {
		
		for(String s: courseTaken) {
			System.out.print(s+",");
		} 
		System.out.println();
	}
	
	@Override public void addDetails() {
		
		System.out.println("Enter Student Id :");
		studentId = sc.nextInt();
		super.addDetails();
		System.out.println("Enter Department");
		department = sc.next();
		System.out.println("Enter Student cgpa");
		cgpa = sc.nextDouble();
		
	}
	
	//method to register course
	public void registerCourse() {
		boolean more = true;
		
		University u = new University();
		System.out.println("Available Courses");
		for(Course course :u.courseList)
			course.dispDetails();
		
		while(more) {
			
	 	
			System.out.println("Enter the Course you want register");
			String course = sc.next();
			courseTaken.add(course);
				
			
			System.out.println("Do you want to register more courses(true/false");
			more = sc.nextBoolean();
		}
		
	}
	
	//not working
	//method to drop course
	//exception error here
	//last element not getting deleted
	//tried with iterator(Collections):resolved
	public void dropCourse() {
		System.out.println("Enter the course name you have to drop");
		String delCourse = sc.next();
		
		Iterator<String> itr = courseTaken.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals(delCourse)) {
				itr.remove();
				
			}
		}
	
	}
}
