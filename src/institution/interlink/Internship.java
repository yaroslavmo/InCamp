package institution.interlink;

import institution.KnowledgeSource;
import institution.KnowledgeSourceScills;
import person.Student;
import java.util.ArrayList;

public class Internship extends KnowledgeSourceScills implements KnowledgeSource {
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

    private boolean isPresent(Student student) {
        return intershipStudents .stream()
                .anyMatch(intershipStudent -> intershipStudent.getName().equals(student.getName()));
    }
    @Override
    public void tutor(Student student) {
        if (this.isPresent(student)) {
            student.incresePractiseScills(practicalKnowledge);
            student.increseTheoryScills(theoryKnowledge);
        }
    }
}
