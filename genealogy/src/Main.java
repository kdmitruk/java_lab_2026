import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Person> people=new ArrayList<>();
        people.add(new Person("Mike", "Tyson", LocalDate.of(1966, 5, 18)));
        people.add(new Person("Daniło", "Korzemiakin", LocalDate.of(2015, 5, 12)));
        people.add(new Person("Muhammad", "Ali", LocalDate.of(1944, 1, 2)));
        {
            Person parent = people.get(0);
            Person child = people.get(1);
            System.out.println(parent.adopt(child));
            System.out.println(parent.adopt(people.get(2)));
            System.out.println(parent.getYoungestChild());
        }



    }
}
