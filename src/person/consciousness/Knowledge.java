package person.consciousness;


public class Knowledge {
    private double level;
    private double practicalScills;
    private double theoryScills;
    private double studentKnowledgeCoefficcient;


    public double getPracticalScills() {
        return practicalScills;
    }

    public void setPracticalScills(double practicalScills) {
        this.practicalScills = practicalScills;
    }

    public double getTheoryScills() {
        return theoryScills;
    }

    public void setTheoryScills(double theoryScills) {
        this.theoryScills = theoryScills;
    }


    public Knowledge(double theoryScills, double practicalScills, double studentKnowledgeCoefficcient) {
        this.theoryScills = theoryScills;
        this.practicalScills = practicalScills;
        this.studentKnowledgeCoefficcient = studentKnowledgeCoefficcient;
        this.level = (this.theoryScills + this.practicalScills) * this.studentKnowledgeCoefficcient;
    }

}
