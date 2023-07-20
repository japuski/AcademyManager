package person;

import lombok.Data;

import java.time.LocalDate;
import java.time.Year;

@Data
public class Employee extends Person {

    private String position;
    private double salary;

    public Employee(int personID, String name, Year initialYear) {
        super.setID(personID);
        super.setName(name);
        super.setInitialYear(initialYear);
    }

}
