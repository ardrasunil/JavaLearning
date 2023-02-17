class Course{
	
	private String courseId;
	private String courseTitle;
	private double credit;
	
	public String getCourseId() {
		return courseId;
	}


	public String getCourseTitle() {
		return courseTitle;
	}

	

	public double getCredit() {
		return credit;
	}

	
	Course(){
		
	}
	
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