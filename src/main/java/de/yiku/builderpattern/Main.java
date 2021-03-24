package de.yiku.builderpattern;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder().with(
                personBuilder -> {
                    personBuilder.firstName = "John";
                    personBuilder.lastName = "Smith";
                    personBuilder.salutation = "Mr.";
                    personBuilder.address = new PersonBuilder.AddressBuilder().with(
                            addressBuilder -> {
                                addressBuilder.city = "Hamburg";
                                addressBuilder.state = "Hamburg";
                                addressBuilder.street = "Mönckebergstraße 1";
                            }
                    ).createAddress();
                }
        ).createPerson();

        System.out.println(person);
    }
}

