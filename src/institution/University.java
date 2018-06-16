package institution;

import person.Student;
import java.util.ArrayList;

public class University {
	public String name;
	
	public Double avarageKnowledge;
	private ArrayList<Student> students = new ArrayList<Student>(); // or use HashMap to store student id as a key 
	
    public University(String name) {
    	this.name = name;
    }

    public void setStudent(Student student) {
    	this.students.add(student);
    }
    
    public ArrayList<Student> getStudents() {
    	return this.students;
    }

    public Student getStudent(String name) {
    	for (Student student : this.students){
    		if(student.getName() == name) {	
    	    	return student;
    		}    			
    	}
		return null;
    }
    
    public void addStudent(Student student) {
       this.setStudent(student);
       int summ = 0;
       
   		try {
   			for(Student s : this.getStudents()) {
   				summ += s.getKnowledge().level;
   			}
   			this.avarageKnowledge = (double) (summ / this.getStudents().size());
   		}catch (Exception e){}
    }
}
