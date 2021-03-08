import java.io.*;
import java.util.ArrayList;

public class ReadStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		try {
			FileInputStream fis = new FileInputStream("file.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			studentList = (ArrayList<Student>)ois.readObject();
			fis.close();
		} catch (Throwable e) {
			System.err.println(e);
		}
		System.out.println("================================");
		System.out.println("      Student Information       ");
		System.out.println("================================");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("Student # " + studentList.get(i).getStdID());
			System.out.println("Student Name : " + studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName());
			System.out.println("Courses");
			ArrayList<String> courses = new ArrayList<String>(studentList.get(i).getCourses());
			int count = 1; 
			for (String course : courses) {
				System.out.println(count++ + ". " + course);
			}
			System.out.println("================================");	
		}
	}
}
