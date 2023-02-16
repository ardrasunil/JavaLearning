import java.util.*;
class Person{
	
	String name;
	String email;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	Person(){
		
	}
	
	/*Person(String name,String email,String department){
		this.name = name;
		this.email = email;
		this.department = department;
	}*/
	
	public void dispDetails() {
		
		System.out.println(name);
		System.out.println(email);
		
	}
	public void addDetails() {
		System.out.println("Enter Name :");
		name = sc.next();
		System.out.println("Enter Email :");
		email = sc.next();
		
		
	}
}

class Student extends Person{
	
	
	int studentId;
	double cgpa;
	String department;
	Course[] studentCourse;
	Scanner sc = new Scanner(System.in);
	
	Student(){
		
	}
	
	/*Student(String name, String email, String department,int studentId,double cgpa) {
		super(name, email, department);
		this.studentId = studentId;
		this.cgpa = cgpa;
		
	}*/
	
	@Override public void dispDetails() {
		System.out.println(studentId);
		super.dispDetails();
		System.out.println(department);
		System.out.println(cgpa);
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
	
	
	//method to drop course
	
	
}
class Faculty extends Person{
	
	
	int facultyId;
	String department;
	String position;
	
	Faculty(){
		
	}
	
	/*Faculty(String name, String email, String department,int facultyId,String position) {
		super(name, email, department);
		this.facultyId = facultyId;
		this.position = position;
		
	}*/
	
	@Override public void dispDetails() {
		super.dispDetails();
		System.out.println(facultyId);
		System.out.println(position);
		System.out.println(department);
	}
	
	@Override public void addDetails() {
		
		
		System.out.println("Enter Faculty Id :");
		facultyId = sc.nextInt();
		super.addDetails();
		System.out.println("Enter Faculty Position");
		position = sc.next();
		System.out.println("Enter Department");
		department = sc.next();
		
		
	}
}

class Course{
	
	String courseId;
	String courseTitle;
	double credit;
	
	Course(String courseId,String courseTitle,double credit){
		
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.credit = credit;
		
	}
	
	public void dispDetails() {
		
		System.out.println(courseId);
		System.out.println(courseTitle);
		System.out.println(credit);
	}
}

public class University {
	
	ArrayList<Student> studentList = new ArrayList<>();
	ArrayList<Faculty> facultyList = new ArrayList<>();
	ArrayList<Course> courseList = new ArrayList<>();
	
	
	public void add() {
		
		int choiceAdd;
		Scanner sc = new Scanner(System.in);
		boolean more = true;
		
		while(more) {
		System.out.println("1 : Add a student");
		System.out.println("2 : Add a faculty");
		System.out.println("3 : Add a course");
		System.out.println("Make your choice");
		choiceAdd = sc.nextInt();
		switch(choiceAdd) {
			
		case 1: //add a student
				Student S = new Student();
				S.addDetails();
				// add this object to student array
				studentList.add(S);
				
				break;
		
		case 2:	//add a faculty
				Faculty F = new Faculty();
				F.addDetails();
				//add this object to faculty array
				facultyList.add(F);
				
				
				break;
				
		case 3: //add a course
				System.out.println("Enter Course Id :");
				System.out.println("Enter Course Title :");
				System.out.println("Enter credits :");
				Course C = new Course(sc.next(),sc.next(),sc.nextDouble());
				courseList.add(C);
		default: System.out.println("Choice Invalid.");
				
		}
		System.out.println("Do you want to make more choices in add(true/false)");
		more = sc.nextBoolean();
		}
		
	}
	public void delete() {
		
		int choiceDelete;
		Scanner sc = new Scanner(System.in);
		boolean more = true;
		
		while(more) {
		System.out.println("1 : Delete a student");
		System.out.println("2 : Delete a faculty");
		System.out.println("3 : Delete a course");
		System.out.println("Make your choice");
		choiceDelete = sc.nextInt();
		switch(choiceDelete) {
			
		case 1: //Delete a student
				System.out.println("Enter the Id of the student to be deleted");
				int studId =sc.nextInt();
				for(Student s: studentList)
				{
					if(s.studentId==studId) {
						studentList.remove(s);
					}
				}
				
				break;
		
		case 2:	//Delete a faculty
				System.out.println("Enter the Id of the faculty to be deleted");
				int facId =sc.nextInt();
				for(Faculty f: facultyList)
				{
					if(f.facultyId==facId) {
						facultyList.remove(f);
					}
				}
			
				break;
				
		case 3: //Delete a course
				System.out.println("Enter the Id of the course to be deleted");
				String crId =sc.next();
				for(Course c: courseList)
				{
					if(Objects.equals(crId, c.courseId)) {
						courseList.remove(c);
					}
				}
				
				break;
		default: System.out.println("Choice Invalid.");
				
		}
		System.out.println("Do you want to make more choices in Delete(true/false)");
		more = sc.nextBoolean();
		}
		
	}
	public void printOption() {
		int choicePrint;
		Scanner sc = new Scanner(System.in);
		boolean more = true;
		while(more) {
			System.out.println("1 : Print all students");
			System.out.println("2 : Print all faculty");
			System.out.println("3 : Print all course");
			System.out.println("Make your choice");
			choicePrint = sc.nextInt();
			switch(choicePrint) {
			
			case 1: //Print all students
			 		System.out.println("STUDENT LIST");
			 		for(Student student :studentList)
					System.out.println(student.name);
			 		break;
			case 2:	//Print all faculty
					System.out.println("FACULTY LIST");
					for(Faculty faculty :facultyList)
					System.out.println(faculty.name);
					break;
			case 3: //Print all courses
					System.out.println("COURSE LIST");
					for(Course course :courseList)
					System.out.println(course.courseTitle);
					break;
			default: System.out.println("Choice Invalid.");
			}
		System.out.println("Do you want to make more choices in print(true/false)");
		more = sc.nextBoolean();
		}
	}
	
	//to update
	public void update() {
		
	}
	
	//to search
	public void search() {
		
	}
	
	//main 
	public static void main(String[] args) {
		
		University ktu = new University();
		boolean more = true;
		int choice;
		Scanner sc = new Scanner(System.in);
		
		while(more){
			
			System.out.println("WELCOME TO KTU");
			System.out.println("1 : Add");
			System.out.println("2 : Delete");
			System.out.println("3 : Update");
			System.out.println("4 : Print");
			System.out.println("5 : Search");
			System.out.println("6 : Exit");
			System.out.println("Make your choice");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: // add
					ktu.add();
					break;
			case 2: //delete
					ktu.delete();
					break;
			case 3://Update
					ktu.update();
					break;
			case 4: //print
					ktu.printOption();
					break;
			case 5: //Search
					ktu.search();
					break;
			case 6: System.out.println("Thank You");
					more = false;
					break;
			default: System.out.println("Choice Invalid.");
			
			}
		
		}
		
	}
	
}
