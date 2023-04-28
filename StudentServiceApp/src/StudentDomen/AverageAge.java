package StudentDomen;

import java.security.Permission;
import java.util.List;
//Класс AverageAge является обобщенным и предназначен для подсчета среднего возраста объектов классов, которые наследуются от класса Person. 
//Он содержит список объектов типа T (наследник Person) и метод calculate, который вычисляет средний возраст объектов в списке.
public class AverageAge<T extends Permission> {

    private List<T> persons;

    public AverageAge(List<T> persons) {
        this.persons = persons;
    }

    public double calculate() {
        double sum = 0;
        for (T person : persons) {
            sum += person.getAge();
        }
        return sum / persons.size();
    }
}
