package person;

import person.consciousness.Knowledge;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
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
    	this.setKnowledge(new Knowledge(1,1, learningCoefficient));   //knowledge that will come from file or db
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

    public void incresePractiseScills(double level){
        this.knowledge.setPracticalScills(this.knowledge.getPracticalScills() + level);
    };

    public void increseTheoryScills(double level){
        this.knowledge.setTheoryScills(this.knowledge.getTheoryScills() + level);
    };

    public boolean hasNotebook() {
        return this.hasNotebook;
    };
    @Override
    public String toString() {
        return this.getName();
    }

}
