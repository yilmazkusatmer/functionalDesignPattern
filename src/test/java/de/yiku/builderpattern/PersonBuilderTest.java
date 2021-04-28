package de.yiku.builderpattern;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonBuilderTest {
    @Test
    void testBuilder() {
        // given + when
        Person testPerson = new PersonBuilder().with(
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

        // then
        assertThat(testPerson.getFirstName()).isEqualTo("John");
        assertThat(testPerson.getAddress().getCity()).isEqualTo("Hamburg");
        assertThat(testPerson.getAddress().getStreet()).isEqualTo("Mönckebergstraße 1");
    }
}