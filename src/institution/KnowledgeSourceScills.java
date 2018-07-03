package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;


public abstract class KnowledgeSourceScills {
    protected double practicalKnowledge = 0;
    protected double theoryKnowledge = 0;

    public void setPracticalKnowledge(double practicalKnowledge) {

        this.practicalKnowledge = practicalKnowledge;
    }

    public void setTheoryKnowledge(double theoryKnowledge) {

        this.theoryKnowledge = theoryKnowledge;
    }
}

