import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/calc")
public class HelloController {

    @GetMapping
    public int calc(@RequestParam(value = "a", defaultValue = "0") Integer a,
                    @RequestParam(value = "b", defaultValue = "0") Integer b) {
        return a + b;
    }
}