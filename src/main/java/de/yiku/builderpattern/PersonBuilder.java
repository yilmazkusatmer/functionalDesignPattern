package de.yiku.builderpattern;

import java.util.function.Consumer;

public class PersonBuilder {
    String firstName;
    String lastName;
    String salutation;
    Address address;

    public PersonBuilder with(Consumer<PersonBuilder> builderConsumer) {
        builderConsumer.accept(this);
        return this;
    }

    public Person createPerson() {
        return new Person(firstName, lastName, salutation, address);
    }

    public static class AddressBuilder {
        String city;
        String state;
        String street;

        public AddressBuilder with(Consumer<AddressBuilder> builderConsumer) {
            builderConsumer.accept(this);
            return this;
        }

        public Address createAddress() {
            return new Address(city, state, street);
        }
    }
}
