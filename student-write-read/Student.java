import java.util.ArrayList;

public class Student implements java.io.Serializable {
	private int stdID;
	private String firstName;
	private String lastName;
	private ArrayList<String> courses;

	public Student() {
		courses = new ArrayList<String>();
	}
	
	public Student(int id, String fName, String lName, ArrayList<String> course) {
		stdID = id;
		firstName = fName;
		lastName = lName;
		courses = new ArrayList<String>(course);
	}
	
	public int getStdID() {
		return stdID;
	}
	
	public void setStdID(int id) {
		this.stdID = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String fName) {
		this.firstName = fName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lName) {
		this.lastName = lName;
	}
	
	public ArrayList<String> getCourses() {
		return courses;
	}
	
	public void setCourses(ArrayList<String> course) {
		this.courses = new ArrayList<String>(course);
	}
}
