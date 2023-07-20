import person.Person;
import person.Student;
import subject.Subject;

import java.time.Year;
import java.util.List;

public class AcademyManager {

    private Academy academy;

    public AcademyManager(Academy academy){
        this.academy = academy;
    }

    //get all subjects from academy
    public List<Subject> getAllSubjects(){
        return academy.getSubjects();
    }

    //get all subjects from session
    public List<Subject> getAllSubjectsFromSession(Year session){
        return academy.getSubjects().stream().filter(subject -> subject.getSession().equals(session)).toList();
    }

    //get all students from sessions
    public List<Person> getAllStudentsFromSession(Year year){
        return academy.getPersons().stream()
                .filter(
                        person -> person.getClass().equals(Student.class)
                        && (year.isAfter(person.getInitialYear()) || year.equals(person.getInitialYear()))
                        //&&  (person.getEndYear().equals(NullPointerException.class) || year.isBefore(person.getEndYear()))
                        ).toList();
    }

    //assign student to subject

    //get all students from subject
    public List<Student> getAllStudentsFromSubject(int subjectId){
        List<Subject> resultList = academy.getSubjects().stream().filter(subject -> subject.getID() == subjectId).toList();
        return resultList.get(0).getStudents();
    }

    //create Test


}
