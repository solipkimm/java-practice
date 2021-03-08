import java.io.*;
import java.util.ArrayList;

public class WriteStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		String select1 = "y";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			while (select1.equals("y")) {
				System.out.print("Add a student? (y or n): ");
				select1 = br.readLine();
				
				if (select1.equals("y")) {
					ArrayList<String> courseList = new ArrayList<String>();
					
					String stdID = "", fName = "", lName = "", course = "";
					String select2 = "y";
					
					while (stdID.length() == 0) {
						System.out.print("Enter Student ID: ");
						stdID = br.readLine();
					}
					
					while (fName.length() == 0) {
						System.out.print("Enter First Name: ");
						fName = br.readLine();
					}
					
					while (lName.length() == 0) {
						System.out.print("Enter Last Name: ");
						lName = br.readLine();
					}
					
					while (select2.equals("y")) {
						System.out.print("Add your course? (y or n): ");
						select2 = br.readLine();
						if (select2.equals("y")) {
							System.out.print("Enter Your course: ");
							course = br.readLine();
							courseList.add(course);
						}
					}
					studentList.add(new Student(Integer.parseInt(stdID), fName, lName, courseList));
				}	
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("file.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(studentList);
			
			oos.flush();
			fos.close();
		} catch (Throwable e) {
			System.err.println(e);
		}
		
//		ArrayList<String> courseList = new ArrayList<String>();
//		courseList.add("JAC444");
//		courseList.add("WEB422");
//		courseList.add("BCI433");
//		
//		Student s = new Student(120618194, "Solip", "Kim", courseList);
//		
//		try {
//			FileOutputStream fos = new FileOutputStream("file.out");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(s);
//			
//			oos.flush();
//			fos.close();
//		} catch (Throwable e) {
//			System.err.println(e);
//		}
	}
}
