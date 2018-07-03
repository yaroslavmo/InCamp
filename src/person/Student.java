package person;

import institution.KnowledgeSource;
import person.consciousness.Knowledge;

import java.util.concurrent.ThreadLocalRandom;

public class Student implements KnowledgeSource {
    private Knowledge knowledge;
    public String name;
    public double learningCoefficient = 0.5;
    private boolean hasNotebook = true;


    public void setHasNotebook(boolean hasNotebook) {
        this.hasNotebook = hasNotebook;
    }


    public Student(String name, double learningCoefficient) {
        this.name = name;
        this.learningCoefficient = learningCoefficient;
        this.setKnowledge(new Knowledge(1, 1, learningCoefficient));
    }

    public String getName() {
        return this.name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return this.knowledge;
    }

    public void incresePractiseScills(double level) {
        this.knowledge.Practise(level);
    }


    public void increseTheoryScills(double level) {
        this.knowledge.studyTheoryScills(level);
    }


    public boolean hasNotebook() {
        return this.hasNotebook;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public void tutor(Student student) {
        student.incresePractiseScills(5);
        student.increseTheoryScills(4);
    }
}
