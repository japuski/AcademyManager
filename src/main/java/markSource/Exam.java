package markSource;

import person.Student;
import utils.StudentHelper;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam implements MarkSource{

    private int ID;
    String name;
    private int maxPoints;
    private double markWeight = 1;  //czy mogę to wrzucić do Enuma?
    private ArrayList<Score> scores;



    public Exam(String name, int maxPoints) {
        this.ID = MarkSourceIDGenerator.generateId();
        this.name = name;
        this.maxPoints = maxPoints;
        this.scores = new ArrayList<Score>();

    }

    @Override
    public int getMarkByStudentId() {
        return StudentHelper.calculateMark();
    }

    @Override
    public int getScoreByStudentId() {
        return 0;
    }

    @Override
    public void addScore(Student student, int score) {
        scores.add(new Score(student,score));
    }

    @Override
    public void addScores(ArrayList<Score> scores) {
        scores.addAll(scores);
    }

}
