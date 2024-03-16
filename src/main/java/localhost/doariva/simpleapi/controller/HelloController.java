package localhost.doariva.simpleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
}