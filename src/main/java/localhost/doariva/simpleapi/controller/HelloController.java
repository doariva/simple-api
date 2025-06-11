package localhost.doariva.simpleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return a + b;
    }

    @GetMapping("/sub")
    public int subtract(@RequestParam("a") int a, @RequestParam("b") int b) {
        return a - b;
    }
}