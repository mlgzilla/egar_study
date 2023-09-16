import entity.Person;
import enums.Access;

public class main {
    public static void main(){
        System.out.println("egar moment");

        Person person = new Person(0, "John", "None", "Doe", 351, "Manager", Access.None);
        System.out.println(person.toString());
    }

}