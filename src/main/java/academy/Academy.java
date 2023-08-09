package academy;

import lombok.Data;
import person.Person;

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

   protected void addSubjects(Subject subject) {
      subjects.add(subject);
   }

   protected void addPerson(Person person) {
      persons.add(person);
   }

   protected void changePersonData(){

   }

   protected void changeSubjectData(){

   }
}
