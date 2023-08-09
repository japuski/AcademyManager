package academy;

import lombok.Data;
import lombok.ToString;
import markSource.MarkSourceCreator;
import markSource.MarkSourceType;
import markSource.Score;
import person.Employee;
import person.Student;
import markSource.MarkSource;
//import test.Test;

import java.time.Year;
import java.util.*;

@Data
public class Subject {

    private int ID;
    private String name;
    private Year session;
    private Employee lecturer;
    @ToString.Exclude
    private ArrayList<Student> students;  //studenci zapisani do przedmiotu
    private ArrayList<MarkSource> marks;

    public Subject(String name, Year session, Employee lecturer){

        this.ID = SubjectIDGenerator.generateId();
        this.name = name;
        this.session = session;
        this.lecturer = lecturer;
        this.students = new ArrayList<>();
        this.marks = new ArrayList<>();
    }

    //add Student to Subject
    protected void addStudent (Student student){
        students.add(student);
    }

    protected void addStudents(List<Student> students){
        students.addAll(students);
    }

    //add MarkSource to Subject
    protected void addMarkSource(MarkSourceType type, String name, int maxPoints){
        MarkSourceCreator markSourceCreator = new MarkSourceCreator();
        marks.add(markSourceCreator.createMarkSource(type,name,maxPoints));
    }

    //add score to MarkSource
    protected void addScoreToMarkSource(MarkSource markSource, Student student, int score){
        markSource.addScore(student,score);
    }

    //add scores to MarkSource
    protected void addScoresToMarkSource(MarkSource markSource, ArrayList<Score> scores){
        markSource.addScores(scores);
    }


}
