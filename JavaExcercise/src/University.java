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
		
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		
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
	ArrayList<String> courseTaken = new ArrayList();
	Scanner sc = new Scanner(System.in);
	
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
	
	public void showCourse() {
		
		for(String s: courseTaken) {
			System.out.print(s+" ");
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
	
	//method to drop course
	public void dropCourse(String drop) {
		
		for(String s: courseTaken) {
			if(Objects.equals(s, drop))
				courseTaken.remove(s);
		}
		
	}
	
}
class Faculty extends Person{
	
	
	int facultyId;
	String department;
	String position;
	String courseName;
	
	Faculty(){
		
	}
	
	/*Faculty(String name, String email, String department,int facultyId,String position) {
		super(name, email, department);
		this.facultyId = facultyId;
		this.position = position;
		
	}*/
	
	@Override public void dispDetails() {
		
		System.out.println("Faculty Id: "+facultyId);
		super.dispDetails();
		System.out.println("Position :"+position);
		System.out.println("Department :" + department);
		System.out.println("Courses :"+courseName);
	}
	
	@Override public void addDetails() {
		
		
		System.out.println("Enter Faculty Id :");
		facultyId = sc.nextInt();
		super.addDetails();
		System.out.println("Enter Faculty Position");
		position = sc.next();
		System.out.println("Enter Department");
		department = sc.next();
		System.out.println("Enter Course ");
		courseName = sc.next();
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
				
				System.out.println("Do you want to register course(true/false)");
				boolean reg = sc.nextBoolean();
				if(reg)
					S.registerCourse();
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
				break;
				
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
			System.out.println("4 : Print the information of a student");
			System.out.println("5 : Print the information of a faculty");
			System.out.println("6 : Print the information of a course");
			System.out.println("7 : Print the student list and faculty of the course");
			System.out.println("8 : Print course taken by astudent ");
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
			case 4: //Print information of a student
					System.out.println("Enter the student Id");
					int studId = sc.nextInt();
					for(Student s :studentList)
						if(s.studentId == studId) {
							s.dispDetails();
						}
					break;
			case 5: //Print information of faculty
					System.out.println("Enter the student Id");
					int facId = sc.nextInt();
					for(Faculty f :facultyList)
						if(f.facultyId == facId) {
							f.dispDetails();
						}
					break;
			case 6: //Print information of course
					System.out.println("Enter the Course Name ");
					String crName1 = sc.next();
					System.out.println("Course Details of "+crName1);
					for(Course c :courseList)
						if(Objects.equals(c.courseTitle,crName1)) {
							c.dispDetails();
						}
					break;
			case 7:	//Print the student list and faculty
					System.out.println("Enter the Course Name ");
					String crName2 = sc.next();
					System.out.println("Faculty for the course"+ crName2);
					for(Faculty f :facultyList)
						if(Objects.equals(f.courseName,crName2)) {
							f.dispDetails();
						}
					//add the course of every student and then print student list
					
					break;
					
			case 8: //Print Courses taken by a student
					break;
			default: System.out.println("Choice Invalid.");
			}
		System.out.println("Do you want to make more choices in print(true/false)");
		more = sc.nextBoolean();
		}
	}
	
	//to update
	public void update() {
		
		int choiceUpdate;
		Scanner sc = new Scanner(System.in);
		boolean more = true;
		
		while(more) {
		System.out.println("1 : Update the cgpa of student ");
		System.out.println("2 : Update email Id of student");
		System.out.println("3 : Update email Id of Faculty");
		System.out.println("4 : Register for a course");
		System.out.println("5 : Drop a course");
		System.out.println("Make your choice");
		choiceUpdate = sc.nextInt();
		switch(choiceUpdate) {
			
		case 1: //Update a student's cgpa
				System.out.println("Enter the Id of the student to be updated");
				int studId1 = sc.nextInt();
				System.out.println("Enter the new CGPA ");
				double cgpa = sc.nextDouble();
				for(Student s: studentList)
				{
					if(s.studentId==studId1) {
						s.cgpa = cgpa;
					}
				}
				
				break;
		
		case 2:	//Update email Id of student
				System.out.println("Enter the Id of the student to be updated");
				int studId2 =sc.nextInt();
				System.out.println("Enter the new email id ");
				String emailId1 = sc.next();
				for(Student s: studentList)
				{
					if(s.studentId==studId2) {
						s.email = emailId1;
					}
				}
				
			
				break;
				
		case 3: //Update email Id of faculty
				System.out.println("Enter the Id of the faculty to be updated");
				int facId =sc.nextInt();
				System.out.println("Enter the new email id ");
				String emailId2 = sc.next();
				for(Faculty f: facultyList)
				{
					if(f.facultyId==facId) {
						f.email = emailId2;
					}
				}
				
				break;
		case 4:// register for a course
				System.out.println("Enter the Id of the student to be updated");
				int studId3 =sc.nextInt();
				
				//displaying the details of the course list
				System.out.println("Available Courses");
				for(Course course :courseList)
					course.dispDetails();
				
				
				for(Student s: studentList)
				{
					if(s.studentId==studId3) {
						s.registerCourse();
					}
				}
				
				break;
		case 5: //Drop a course
				System.out.println("Enter the Id of the student to be updated");
				int studId4 =sc.nextInt();
				for(Student s: studentList)
				{
					if(s.studentId==studId4) {
						System.out.println("Currently opted Courses");
						s.showCourse();
						System.out.println("Enter the course name you have to drop");
						String drop = sc.next();
						s.dropCourse(drop);
					}
				}
				break;
				
		default: System.out.println("Choice Invalid.");
				
		}
		System.out.println("Do you want to make more choices in print(true/false)");
		more = sc.nextBoolean();	
	}	
		
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
