package exercises.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Bob", Gender.PREFER_NOT_TO_SAY)

        );
//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> Gender.PREFER_NOT_TO_SAY.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
                .noneMatch(personPredicate);

        System.out.println(containsOnlyFemales);

    }

    static class Person {
        private final String name;
        private final Gender gender;


        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }

    }

    enum Gender{
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
