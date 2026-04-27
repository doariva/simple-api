package localhost.doariva.simpleapi.controller;

import localhost.doariva.simpleapi.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * simple-apiのコントローラー
 */
@RestController
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    /**
     * Hello API
     *
     * @return Hello!
     */
    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
    }

    /**
     * Add API
     *
     * @param a a
     * @param b b
     * @return a + b
     */
    @GetMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return helloService.add(a, b);
    }

    /**
     * Multiply API
     *
     * @param a a
     * @param b b
     * @return a * b
     */
    @GetMapping("/multiply")
    public int multiply(@RequestParam("a") int a, @RequestParam("b") int b) {
        return helloService.multiply(a, b);
    }

    /**
     * Subtract API
     *
     * @param a a
     * @param b b
     * @return a - b
     */
    @GetMapping("/subtract")
    public int subtract(@RequestParam("a") int a, @RequestParam("b") int b) {
        return helloService.subtract(a, b);
    }
}
