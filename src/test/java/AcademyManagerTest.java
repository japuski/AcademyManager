import academy.Academy;
import academy.AcademyManager;
import org.junit.Before;
import org.junit.Test;
import person.Person;
import person.Student;

import java.time.Year;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AcademyManagerTest {

    private Academy academy;
    private AcademyManager academyManager;

    @Before
    public void setUp() {
        academy = new Academy("Politechnika Gdańska");
        academyManager = new AcademyManager(academy);
        Student student1 = new Student("Jack", Year.of(2020));
        Student student2 = new Student("Mark", Year.of(2012));
        Student student3 = new Student("Tom", Year.of(2025));
        Student student4 = new Student("Tom", Year.of(2035));
        academyManager.addPersonToAcademy(student1);
        academyManager.addPersonToAcademy(student2);
        academyManager.addPersonToAcademy(student3);
        academyManager.addPersonToAcademy(student4);
    }

//    @Test
//    public void shouldReturnStudentsFrom2020InitialYear() {
//        // given
//        Year initialYear = Year.of(2020);
//
//        // when
//        List<Person> allStudentsFromSession = academyManager.getAllStudentsFromSession(initialYear);
//
//        // then
//        assertEquals(1, allStudentsFromSession.size());
//    }
//
//    @Test
//    public void shouldThrowExceptionWhenProvidedYearIsNull() {
//        Year nullYear = null;
//
//        RuntimeException exception = assertThrows(RuntimeException.class,
//                () -> academyManager.getAllStudentsFromSession(nullYear));
//
//        assertEquals("Year cannot be null", exception.getMessage());
//    }


}
