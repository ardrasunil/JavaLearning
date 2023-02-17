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

