import java.util.Locale;

public class PersonBuilder {
    String name;
    String surname;
    int age;
    String address;



    public PersonBuilder setName(String name) {
               this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age)  throws  IllegalArgumentException {
        if (age <= 0) {
            throw new IllegalArgumentException("Возраст недопустимый");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build()  throws IllegalStateException {
        if (this.name == null && this.surname == null){
            throw new IllegalStateException("Не хватает обязательных полей");
        }
        Person person = new Person(this.name, this.surname, this.age);
        person.setAddress(this.address);
        return person;
    }

}






