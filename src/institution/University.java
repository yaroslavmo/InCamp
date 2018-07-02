package institution;

import person.Student;
import java.util.ArrayList;
import java.util.List;

public class University extends ListKnowledgeSources implements KnowledgeSource{
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

    }


	private boolean isPresent(Student student) {
		return studentsList.stream()
				.anyMatch(universityStudent -> universityStudent.getName().equals(student.getName()));
	}


    @Override
    public void tutor(Student student) {
        student.incresePractiseScills(practicalKnowledge);
        student.increseTheoryScills(theoryKnowledge);
    }
}
