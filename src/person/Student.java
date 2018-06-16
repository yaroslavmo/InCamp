package person;

import person.consciousness.Knowledge;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
	private Knowledge knowledge;
	public String name;
	
	
    public Student(String name) {
    	this.name = name;
    	this.setKnowledge(new Knowledge(ThreadLocalRandom.current().nextInt(10, 99 + 1)));   //knowledge that will come from file or db
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
    
    @Override
    public String toString() {
        return this.getName();
    }

}
