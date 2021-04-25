package de.yiku.singletonpattern;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingletonManagerTest {

    @Test
    void testSingletonInstance() {
        // given + when
        Singleton instance1 = SingletonManager.getInstance();
        Singleton instance2 = SingletonManager.getInstance();

        // then
        assertThat(instance1).isEqualTo(instance2);

    }
}