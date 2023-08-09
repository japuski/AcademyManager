package test;

import lombok.Data;
import person.Student;

import java.util.HashMap;


public interface MarkSource {

    int getMarkByStudentId();
    int getScoreByStudentId();
    void addScore(Student student, int score);
    void addScores(HashMap<Student,Integer> scores);
}
