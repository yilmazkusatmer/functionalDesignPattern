package de.yiku.builderpattern;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String salutation;
    private final Address address;

    public Person(String firstName, String lastName, String salutation, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salutation = salutation;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSalutation() {
        return salutation;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salutation='" + salutation + '\'' +
                ", address=" + address +
                '}';
    }
}
