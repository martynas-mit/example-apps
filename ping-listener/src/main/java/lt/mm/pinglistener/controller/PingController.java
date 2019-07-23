package lt.mm.pinglistener.controller;

import lt.mm.pinglistener.model.PingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/ping")
    public PingResponse ping() {
        return new PingResponse("Service is UP");
    }

}

