import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private final String  firstName;
    private final String lastName;
    private final LocalDate birthday;

    private final Set<Person> children = new HashSet<>();

    public Person(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", children=" + children +
                '}';
    }

    public boolean adopt(Person child){
        if (child == this) return false;
        return children.add(child);
    }
}
