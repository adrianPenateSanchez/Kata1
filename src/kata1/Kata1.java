package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1984, 12, 26);
        
        Person person = new Person("Pepito", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años ");
    }
    
}
