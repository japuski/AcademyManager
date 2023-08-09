package markSource;

import person.Student;

import java.util.ArrayList;
import java.util.HashMap;


public interface MarkSource {

    int getMarkByStudentId();
    int getScoreByStudentId();
    void addScore(Student student, int score);
    void addScores(ArrayList<Score> scores);
}
