
package javaapplication1;

import java.util.Date;
public class JavaApplication1 {

    public static void main(String[] args) {
    Person person = new Person("Manu", new Date(95,10,27));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    
    }
}
