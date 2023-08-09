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




//    //createNewMarkSource
//            // createMarkSource(TYPE.%) if exam then create ExamClass
//    //add
//
//
//    //add one student
//    public void addStudent(Student student) {
//        this.students.add(student);
//    }
//
//    //add many students
//    public void addStudents(List<Student> students){
//        this.students.addAll(students);
//    }
//
//    //remove students by studentId
//    public void removeStudent(int studentId){
//        this.students.removeIf(student -> student.getID() == studentId);
//    }
//
//    //change lecturer
//    public void changeLecturer(Employee lecturer){
//        this.lecturer = lecturer;
//    }
//
////    //add mark
////    public void addMark(int studentId, int mark, int testId) throws StudentNotFoundException {
////        Student student = students.stream().filter(s -> s.getID() == studentId).findFirst().orElse(null);
////        Test test = tests.stream().filter(t -> t.getID() == testId).findFirst().orElse(null);
////        if (student != null || test != null) {
////            Map map = new HashMap();
////            map.put(mark,test);
////            marks.put(student,map);
////        } else {
////            throw new StudentNotFoundException(studentId);
////        }
////    }
//
//    //delete mark
}
