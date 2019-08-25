package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetingController {

    private static final String template = "Hello second, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Value("${WELCOME_STRING:default}")
    private String welcome;
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	
    	final String uri = "http://first-service:8080/greeting";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        
        return new Greeting(counter.incrementAndGet(),
                            String.format(template+welcome+"a"+result, name));
    }
}
