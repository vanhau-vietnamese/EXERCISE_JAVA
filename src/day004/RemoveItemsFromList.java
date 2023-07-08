package day004;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RemoveItemsFromList {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Person p1 = new Person("1", "Hậu", LocalDate.of(2003, 3, 13));
        Person p2 = new Person("2", "Công",  LocalDate.of(2023, 6, 1));
        Person p3 = new Person("3", "Văn A", LocalDate.of(2013, 6, 1));
        Person p4 = new Person("4", "Văn B", LocalDate.of(2023, 6, 1));

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        System.out.println("before remove: " + list);

        removeItemUsingAnSpecificFilter(list);
        removeItemUsingEquals(list);

        System.out.println("after remove: " + list);
    }

    private static void removeItemUsingAnSpecificFilter(List<Person> list){
        list.removeIf(person -> "Hậu".equals(person.getName()));
    }
    private static void removeItemUsingEquals(List<Person> list){
        Person p = new Person("2", "Công",  LocalDate.of(2023, 6, 2));
        list.remove(p);
    }
}
