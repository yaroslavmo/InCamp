package institution.interlink;

import person.Student;
import java.util.ArrayList;

public class Internship {
	public String name;
	private ArrayList<Student> intershipStudents = new ArrayList<Student>();
	
    public Internship(String name) {
    	this.name = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
    	this.intershipStudents.add(student);
    }

    public String getStudents() {
        return this.intershipStudents.toString();
    }
}
