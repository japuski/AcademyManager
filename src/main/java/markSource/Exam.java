package test;

import person.Person;
import person.Student;
import utils.StudentHelper;

import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.HashMap;

public class Exam implements MarkSource{

    private ArrayList<Score> scores;
    private final double markWeight = 0.5;
    private int maxPoints;

    public Exam(String name, ) {

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
    public void addScores(HashMap<Student, Integer> scores) {

    }

}
