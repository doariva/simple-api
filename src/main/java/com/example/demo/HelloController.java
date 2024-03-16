import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/calc")
public class HelloController {

    @GetMapping
    public int calc(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return a + b;
    }
}