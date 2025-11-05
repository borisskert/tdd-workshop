package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {

    @Test
    void shouldGetHelloWorld() throws Exception {
        Greeting greeting = new Greeting();
        assertEquals("Hello world!", greeting.get());
        assertThat(greeting.get()).isEqualTo("Hello world!");
    }
}
