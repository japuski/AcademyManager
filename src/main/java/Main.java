import academy.Academy;
import academy.AcademyManager;
import markSource.MarkSourceType;
import person.Employee;
import person.Student;
import academy.Subject;

import java.time.Year;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Jack", Year.of(2020));
        Student student2 = new Student("Mark", Year.of(2012));
        Student student3 = new Student("Tom", Year.of(2025));
        Student student4 = new Student("Tom", Year.of(2035));

        Employee professor1 = new Employee("Josef", Year.of(2010));

        Subject kombinatoryka =  new Subject("Kombinatoryka", Year.of(2023), professor1);

        Academy academy = new Academy("Politechnika Gdańska");

        AcademyManager academyManager = new AcademyManager(academy);

        academyManager.addSubjectToAcademy(kombinatoryka);
        academyManager.addPersonToAcademy(professor1);
        academyManager.addPersonToAcademy(student1);
        academyManager.addPersonToAcademy(student2);
        academyManager.addPersonToAcademy(student3);
        academyManager.addPersonToAcademy(student4);

        academyManager.addMarkSourceToSubject(kombinatoryka, MarkSourceType.EXAM,"Egzamin 1", 100);


    }

}
