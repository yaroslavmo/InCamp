package person;

import institution.KnowledgeSource;
import institution.KnowledgeSourceScills;
import java.util.Random;

public class SelfEducation extends KnowledgeSourceScills implements KnowledgeSource {

    public void setTheoryKnowledge() {

        super.setTheoryKnowledge(new Random().nextInt( 20 - 5 + 1) + 5);
    }

    public void setPracticalKnowledge() {
        super.setPracticalKnowledge(new Random().nextInt( 15 - 1 + 1) + 1);
    }

    @Override
    public void tutor(Student student) {

        student.incresePractiseScills(practicalKnowledge);
        student.increseTheoryScills(theoryKnowledge);
    }

}
