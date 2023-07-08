package day005;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateListWithFilterItemsFromOthersList {
    public static void main(String[] args) {

        Person p1 = new Person("1", "Tran Van A", LocalDate.of(2003, 3, 13));
        Person p2 = new Person("2", "Tran Van B", LocalDate.of(2003, 4, 13));
        Person p3 = new Person("3", "Tran Van C", LocalDate.of(2003, 5, 13));
        Person p4 = new Person("4", "Tran Van D", LocalDate.of(2003, 3, 13));
        Person p5 = new Person("5", "Tran Van E", LocalDate.of(2003, 6, 13));

        Person[] persons1 = {p1, p2, p3, p4, p5};
        List<Person> list1 = new ArrayList<>(Arrays.asList(persons1));
        System.out.println("List 1:" + list1);

        Person p10 = new Person("10", "Nguyen Van A", LocalDate.of(2004, 3, 13));
        Person p6 = new Person("6", "Van B", LocalDate.of(2004, 4, 13));
        Person p7 = new Person("7", "Nguyen Van C", LocalDate.of(2004, 5, 13));
        Person p8 = new Person("8", "Nguyen Van D", LocalDate.of(2003, 3, 13));
        Person p9 = new Person("9", "Nguyen Van E", LocalDate.of(2003, 6, 13));

        Person[] persons2 = {p6, p7, p8, p9, p10};
        List<Person> list2 = new ArrayList<>(Arrays.asList(persons2));
        System.out.println("List 2:" + list2);

        List<Person> filteredList = filterList(list1, list2);


        System.out.println("filter lisst: "+ filteredList);
    }
    public static List<Person> filterList(List<Person> list1, List<Person> list2){
        return Stream.concat(list1.stream(), list2.stream())
                .filter(person -> LocalDate.of(2003, 3, 13).equals(person.getDateOfBirth()))
                .collect(Collectors.toList());
    }
}
