package localhost.doariva.simpleapi;

import localhost.doariva.simpleapi.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SimpleApiApplicationTests {

	@Autowired
	private HelloController helloController;

	@Test
	void contextLoads() {
	}

	@Test
	void add() {
		assertEquals(5, helloController.add(2, 3));
	}

	@Test
	void subtract() {
		assertEquals(1, helloController.subtract(3, 2));
	}

}
