package localhost.doariva.simpleapi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloServiceTest {

    private HelloService helloService;

    @BeforeEach
    void setUp() {
        helloService = new HelloService();
    }

    @Test
    void helloReturnsCorrectGreeting() {
        assertEquals("Hello!", helloService.hello());
    }

    @Test
    void addReturnsCorrectSum() {
        assertEquals(5, helloService.add(2, 3));
        assertEquals(-1, helloService.add(2, -3));
        assertEquals(0, helloService.add(0, 0));
    }

    @Test
    void multiplyReturnsCorrectProduct() {
        assertEquals(6, helloService.multiply(2, 3));
        assertEquals(-6, helloService.multiply(2, -3));
        assertEquals(0, helloService.multiply(0, 5));
        assertEquals(0, helloService.multiply(5, 0));
    }
}
