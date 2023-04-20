import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("John", 1990));
        persons.add(new Person("Mary", 1981));
        persons.add(new Person("Tom", 2000));
        persons.add(new Person("Elisabeth", 1999));
        Collections.sort(persons, new PersonBirthComparator());
        System.out.println(persons);
        Collections.sort(persons, new PersonNameComparator());
        System.out.println(persons);
    }

    static class Person {
        int birthYear;
        String name;
        Person(String name, int birthYear) {
            this.birthYear = birthYear;
            this.name = name;
        }
        @Override
        public String toString() {
            return String.format("%s %d", name, birthYear);
        }
    }

    static class PersonBirthComparator implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            if (person1.birthYear < person2.birthYear)  return -1;
            if (person1.birthYear == person2.birthYear) return 0;
            return 1;
        }
    }

    static class PersonNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {

            int l;
            if (p1.name.length() < p2.name.length()) {
                l = p1.name.length();
            }
            else l = p2.name.length();

            for (int i = 0; i < l; i++) {
                char c1 = p1.name.charAt(i);
                char c2 = p2.name.charAt(i);
                if (c1 < c2) return -1;
                if (c1 > c2) return 1;
            }

            if (p1.name.length() == p2.name.length()) return 0;
            if (p1.name.length() > p2.name.length()) return 1;
            return -1;
        }
    }

}
