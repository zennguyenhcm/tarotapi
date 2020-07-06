package zenn.hcm.tarot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import zenn.hcm.tarot.representation.model.Greeting;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingController {
    private static final String template ="Hello, %s";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }
}
