package com.xavier.config.client.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

@RestController
public class HelloWorldFlux {
    @GetMapping("/hello")
    public Flux<String> flux() {
        return Flux.fromArray(new String[]{"小黑", "小胖", "小六", "一鑫"}).publishOn(Schedulers.boundedElastic()).map(s -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "二班：" + s + "<br />";
        });
    }
}
