package institution;

import person.Student;
import java.util.ArrayList;

public class University extends KnowledgeSourceScills implements KnowledgeSource{
	public String name;
	
	public Double avarageKnowledge;
	private ArrayList<Student> studentsList = new ArrayList<Student>(); // or use HashMap to store student id as a key
	
    public University(String name) {
    	this.name = name;
    }

    public void setStudent(Student student) {
    	this.studentsList.add(student);
    }
    
    public ArrayList<Student> getStudentsList() {
    	return this.studentsList;
    }

    public Student getStudent(String name) {
    	for (Student student : this.studentsList){
    		if(student.getName().equals(name)) {
    	    	return student;
    		}    			
    	}
		return null;
    }
    
    public void addStudent(Student student) {
       this.setStudent(student);

    }


	private boolean isPresent(Student student) {
		return studentsList.stream()
				.anyMatch(universityStudent -> universityStudent.getName().equals(student.getName()));
	}


    @Override
    public void tutor(Student student) {
        if (this.isPresent(student)) {
            student.incresePractiseScills(practicalKnowledge);
            student.increseTheoryScills(theoryKnowledge);
        }
    }
}
