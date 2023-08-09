package academy;

import markSource.MarkSource;
import markSource.MarkSourceCreator;
import markSource.MarkSourceType;
import markSource.Score;
import person.Person;
import person.Student;
import utils.StudentHelper;

import java.util.ArrayList;
import java.util.List;

public class AcademyManager {

    private Academy academy;

    public AcademyManager(Academy academy){
        this.academy = academy;
    }

    // --Academy Manager

    // dodawanie osób
    public void addPersonToAcademy(Person person){
        if (StudentHelper.isStudent(person)) {
            Student student = (Student) person;
            ((Student) person).setActiveStudent();
        }
        academy.addPerson(person);
    }

    // dodowanie przedmiotów
    public void addSubjectToAcademy(Subject subject) {
        academy.addSubjects(subject);
    }

    // --SubjectManager

    //add Student to Subject
    public void addStudentToSubject (Student student, Subject subject){
        subject.addStudent(student);
    }

    //add Students to Subject
    public void addStudentsToSubject(Subject subject, List<Student> students){
        subject.addStudents(students);
    }

    //add MarkSource to Subject
    public void addMarkSourceToSubject(Subject subject, MarkSourceType type, String name, int maxPoints){
        subject.addMarkSource(type,name,maxPoints);
    }

    //add score to MarkSource
    public void addScoreToMarkSource(Subject subject, MarkSource markSource, Student student, int score){
        subject.addScoreToMarkSource(markSource,student,score);
    }

    //add scores to MarkSource
    public void addScoresToMarkSource(Subject subject, MarkSource markSource, ArrayList<Score> scores){
        subject.addScoresToMarkSource(markSource,scores);
    }




}
