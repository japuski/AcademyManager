package person;

import lombok.Data;

import java.time.LocalDate;
import java.time.Year;

public class Student extends Person {

    boolean activeStudent;

    public Student(String name, Year initialYear) {
        super(name, initialYear);
        activeStudent = false;
    }
}
