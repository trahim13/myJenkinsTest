package by.teza.jimm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String imHealthy() {
        return "{healthy:true}";
    }

}
