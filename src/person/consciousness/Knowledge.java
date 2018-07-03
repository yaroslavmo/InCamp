package person.consciousness;


public class Knowledge {


    private double level;
    private double practicalScills;
    private double theoryScills;
    private double studentKnowledgeCoefficcient;

    public double getLevel() {
        return level;
    }

    public double getPracticalScills() {

        return practicalScills;
    }

    public void Practise(double practicalScills) {

        this.practicalScills =+ practicalScills;
    }

    public double getTheoryScills() {
        return theoryScills;
    }

    public void studyTheoryScills(double theoryScills) {

        this.theoryScills =+ theoryScills;
    }


    public Knowledge(double theoryScills, double practicalScills, double studentKnowledgeCoefficcient) {
        this.theoryScills = theoryScills;
        this.practicalScills = practicalScills;
        this.studentKnowledgeCoefficcient = studentKnowledgeCoefficcient;
        this.level = (this.theoryScills + this.practicalScills) * this.studentKnowledgeCoefficcient;
    }

}
