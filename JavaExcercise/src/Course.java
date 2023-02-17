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