public class Person {
    private static String name;

    public Person(String name) {
        Person.name = name;
    }

    public String getName() {
        return name;
    }
}
