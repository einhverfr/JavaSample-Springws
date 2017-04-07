package starter;

/**
 * Created by Christopher Travers on 06/04/2017.
 */
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class StarterController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public MessageStruct greeting() {
        return new MessageStruct(counter.incrementAndGet(),
                String.format(template, "World"));
    }
    @GetMapping("/{name}")
    public MessageStruct greeting(@PathVariable String name) {
        return new MessageStruct(counter.incrementAndGet(),
                String.format(template, name));
    }
}
