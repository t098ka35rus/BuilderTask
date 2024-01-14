import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return this.getAge().isPresent();
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        OptionalInt optionalIntAge = OptionalInt.of(this.age);
        if (optionalIntAge.isPresent()) {
            return optionalIntAge;
        }
        return OptionalInt.empty();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age++;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        return personBuilder;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return age;
    }

}

