public class CollegeStudent extends Student {
	private String collegeName;
	
	public static void main(String[] args) {
		CollegeStudent collegeStudent1 = new CollegeStudent();
		// -> error because there is no default constructor in Student
	}
}
