package institution;

import person.Student;

public class MeetUp extends KnowledgeSourceScills implements KnowledgeSource {
    @Override
    public void tutor(Student student) {
        student.increseTheoryScills(theoryKnowledge);
        if (student.hasNotebook()){
            student.incresePractiseScills(practicalKnowledge);
        }
    }
}
