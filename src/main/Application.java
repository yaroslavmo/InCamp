package main;

import java.util.ArrayList;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
    	ArrayList<University> universities = new ArrayList<University>();
    	universities.add(new University("CH.U.I."));
        universities.get(0).addStudent(new Student("Andrew Kostenko", 0.5));
        universities.get(0).addStudent(new Student("Julia Veselkina", 0.5));
        universities.get(0).addStudent(new Student("Maria Perechrest", 0.5));
        universities.get(0).addStudent(new Student("Bogdan Kulimov", 0.5));
        System.out.println(universities.get(0).name);
    	for(Student student : universities.get(0).getStudents()) {
            System.out.println(student.getName());
        }
    	System.out.println("Avarage:" + universities.get(0).avarageKnowledge);
    	
        universities.add(new University("CH.N.U."));
        universities.get(1).addStudent(new Student("Josie Sewell", 0.5));
        universities.get(1).addStudent(new Student("Tiffani Allan", 0.5));
        universities.get(1).addStudent(new Student("Johnson Straker", 0.5));
        universities.get(1).addStudent(new Student("Marc Kriger", 0.5));
        System.out.println(universities.get(1).name);
    	for(Student student : universities.get(1).getStudents()) {
            System.out.println(student.getName());
        }
    	System.out.println("Avarage:" + universities.get(0).avarageKnowledge);
    	
    	universities.add(new University("CH.D.T.U."));
    	universities.get(2).addStudent(new Student("Evelina Steven", 0.5));
    	universities.get(2).addStudent(new Student("Harrison Lobb", 0.5));
    	universities.get(2).addStudent(new Student("Sheldon Wilborn", 0.5));
    	universities.get(2).addStudent(new Student("Lynna Nordeen", 0.5));
        System.out.println(universities.get(2).name);
        for(Student student : universities.get(2).getStudents()) {
            System.out.println(student.getName());
        }
        System.out.println("Avarage:" + universities.get(0).avarageKnowledge);

        
        Internship internship = new Internship("Interlink");
        for(University university : universities) {
        	for(Student student : university.getStudents()) {
                	internship.setStudent(student);
            }
        }
        
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
        

    }
}
