import lombok.Data;
import person.Person;
import subject.Subject;

import java.util.ArrayList;
import java.util.List;

@Data
public class Academy {

   private String name;
   private List<Person> persons;
   private List<Subject> subjects;

   public Academy(String name){
      this.name = name;
      this.persons = new ArrayList<>();
      this.subjects = new ArrayList<>();
   }

   public void addSubjects(Subject subject) {
      subjects.add(subject);
   }

   public void addPerson(Person person) {
      persons.add(person);
   }

   public void changePersonData(){

   }

   public void changeSubjectData(){

   }
}
