package localhost.doariva.simpleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * simple-apiのコントローラー
 */
@RestController
public class HelloController {

    /**
     * Hello API
     *
     * @return Hello!
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
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
        return a + b;
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
        return a * b;
    }
}
