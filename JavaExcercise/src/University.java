import java.util.*;
public class University {
	
	static ArrayList<Student> studentList = new ArrayList<>();
	static ArrayList<Faculty> facultyList = new ArrayList<>();
	static ArrayList<Course> courseList = new ArrayList<>();
	
	
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
		System.out.println("Do you want to make more choices in ADD(true/false)");
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
					if(s.getStudentId()==studId) {
						studentList.remove(s);
					}
				}
				
				break;
		
		case 2:	//Delete a faculty
				System.out.println("Enter the Id of the faculty to be deleted");
				int facId =sc.nextInt();
				for(Faculty f: facultyList)
				{
					if(f.getFacultyId()==facId) {
						facultyList.remove(f);
					}
				}
			
				break;
				
		case 3: //Delete a course
				System.out.println("Enter the Id of the course to be deleted");
				String crId =sc.next();
				for(Course c: courseList)
				{
					if(Objects.equals(crId, c.getCourseId())) {
						courseList.remove(c);
					}
				}
				
				break;
		default: System.out.println("Choice Invalid.");
				
		}
		System.out.println("Do you want to make more choices in DELETE(true/false)");
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
			System.out.println("8 : Print course taken by a student ");
			System.out.println("Make your choice");
			choicePrint = sc.nextInt();
			switch(choicePrint) {
			
			case 1: //Print all students
			 		System.out.println("STUDENT LIST");
			 		for(Student student :studentList)
					System.out.println(student.getName());
			 		break;
			case 2:	//Print all faculty
					System.out.println("FACULTY LIST");
					for(Faculty faculty :facultyList)
					System.out.println(faculty.getName());
					break;
			case 3: //Print all courses
					System.out.println("COURSE LIST");
					for(Course course :courseList)
					System.out.println(course.getCourseTitle());
					break;
			case 4: //Print information of a student
					System.out.println("Enter the student Id");
					int studId = sc.nextInt();
					for(Student s :studentList)
						if(s.getStudentId() == studId) {
							s.dispDetails();
						}
					break;
			case 5: //Print information of faculty
					System.out.println("Enter the faculty Id");
					int facId = sc.nextInt();
					for(Faculty f :facultyList)
						if(f.getFacultyId() == facId) {
							f.dispDetails();
						}
					break;
			case 6: //Print information of course
					System.out.println("Enter the Course Name ");
					String crName1 = sc.next();
					System.out.println("Course Details of "+crName1);
					for(Course c :courseList)
						if(Objects.equals(c.getCourseTitle(),crName1)) {
							c.dispDetails();
						}
					break;
			case 7:	//Print the student list and faculty
					System.out.println("Enter the Course Name ");
					String crName2 = sc.next();
					System.out.println("Faculty for "+ crName2);
					for(Faculty f :facultyList)
						if(Objects.equals(f.courseName,crName2)) {
							f.dispDetails();
						}
					//add the course of every student and then print student list
					System.out.println("\nList of Students in "+ crName2);
					for(Student s :studentList)
						if(s.courseTaken.contains(crName2)) {
							System.out.println(s.getName());
						}
					
					break;
					
			case 8: //Print Courses taken by a student
					System.out.println("Enter the Id of the student ");
					int studId2 =sc.nextInt();
					for(Student s:studentList){
						if(studId2==s.getStudentId()) {
							s.showCourse();
						}
					}
					
					break;
			default: System.out.println("Choice Invalid.");
			}
		System.out.println("Do you want to make more choices in PRINT(true/false)");
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
					if(s.getStudentId()==studId1) {
						s.setCgpa(cgpa);
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
					if(s.getStudentId()==studId2) {
						s.setEmail(emailId1);
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
					if(f.getFacultyId()==facId) {
						f.setEmail(emailId2);
					}
				}
				
				break;
		case 4:// register for a course
				System.out.println("Enter the Id of the student to be updated");
				int studId3 =sc.nextInt();
				
				
				for(Student s: studentList)
				{
					if(s.getStudentId()==studId3) {
						s.registerCourse();
					}
				}
				
				break;
		case 5: //Drop a course
				System.out.println("Enter the Id of the student to be updated");
				int studId4 =sc.nextInt();
				for(Student s: studentList)
				{
					if(s.getStudentId()==studId4) {
						System.out.println("Currently opted Courses");
						s.showCourse();
						s.dropCourse();
					}
				}
				break;
				
		default: System.out.println("Choice Invalid.");
				
		}
		System.out.println("Do you want to make more choices in UPDATE(true/false)");
		more = sc.nextBoolean();	
	}	
		
	}
	
	//to search
	public void search() {
		int choiceSearch;
		Scanner sc = new Scanner(System.in);
		boolean more = true;
		
		while(more) {
			System.out.println("1 : Search a Student ");
			System.out.println("2 : Search a Faculty");
			System.out.println("3 : Search a Course");
			System.out.println("4 : Search whether a student takes a course");
			System.out.println("5 : Search whether a faculty takes a course");
			System.out.println("Make your choice");
			choiceSearch = sc.nextInt();
			switch(choiceSearch) {
			case 1: //to Search a Student
					boolean flag1 = false;
					Student S = new Student();
					System.out.println("Enter the Student ID");
					int studId1 = sc.nextInt();
					for(Student s:studentList) {
						if(s.getStudentId()==studId1) {
							flag1 = true;
							S=s;
							break;
						}
					}
					if(flag1) {
						System.out.println("Student Details Found");
						S.dispDetails();
					}
					else {
						System.out.println("Student Id invalid");
					}
				
					break;
					
			case 2: //to search a faculty
					boolean flag2 = false;
					Faculty F = new Faculty();
					System.out.println("Enter the Faculty ID");
					int studId2 = sc.nextInt();
					for(Faculty f:facultyList) {
						if(f.getFacultyId()==studId2) {
							flag2 = true;
							F=f;
							break;
						}
					}
					if(flag2) {
						System.out.println("Faculty Details Found");
						F.dispDetails();
					}
					else {
						System.out.println("Faculty Id invalid");
					}
			
					break;
			case 3: //to search a faculty
					boolean flag3 = false;
					Course C = new Course();
					System.out.println("Enter the Course Name");
					String Cname = sc.next();
					for(Course c:courseList) {
						if(Objects.equals(Cname, c.getCourseTitle())) {
							flag3 = true;
							C=c;
							break;
						}
					}
					if(flag3) {
						System.out.println("Course Details Found");
						C.dispDetails();
					}
					else {
						System.out.println("Course not available");
					}
		
					break;
					
			case 4: //
					boolean flag4 = false;
					System.out.println("Enter the student Id");
					int studId3 = sc.nextInt();
					System.out.println("Enter the Course you want to search");
					String cName2 = sc.next();
					for(Student s : studentList) {
						if(s.getStudentId() == studId3) {
							if(s.courseTaken.contains(cName2)) {
								flag4 = true;
								break;
							}
						}
					}
					if(flag4) {
						System.out.println("Yes,the student has taken the course :"+ cName2);
					}
					else {
						System.out.println("Student not taken the course");
					}
					break;
					
			case 5: //
					boolean flag5 = false;
					System.out.println("Enter the faculty Id");
					int facId = sc.nextInt();
					System.out.println("Enter the Course you want to search");
					String cName3 = sc.next();
					for(Faculty f : facultyList) {
						if(f.getFacultyId() == facId) {
							if(Objects.equals(cName3, f.courseName)) {
								flag5 = true;
								break;
							}
						}
					}
					if(flag5) {
						System.out.println("Yes,the student has taken the course :"+ cName3);
					}
					else {
						System.out.println("Faculty not taking the course");
					}
					break;
					
			
				
			default: System.out.println("Choice Invalid.");
			}
			System.out.println("Do you want to make more choices in SEARCH(true/false)");
			more = sc.nextBoolean();
		}
	}
	
	//main 
	public static void main(String[] args) {
		Course c1 = new Course("ECT1","MAA",4);
		Course c2 = new Course("ECT2","DSD",3);
		Course c3 = new Course("ECT3","ML",3);
		Course c4 = new Course("ECT4","RTOS",4);
		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);
		courseList.add(c4);
		
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
