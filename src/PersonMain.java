import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
List<Person> people = Arrays.asList(
        new Person("Abby","Uye",78),
        new Person("Abigail","Godwin",74),
        new Person("Uyai","Igwe",75),
        new Person("vavyirl","uyai",77),
        new Person("Abby","gold",79)
);

//people.forEach((person -> System.out.println(person.toString())));
//for(Person person:people){
//    if (person.getLastName().startsWith("s")){
//        System.out.println(person.toString());
//    }
//}

    }
}
