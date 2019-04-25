package lt.mm.cameldemo.controllers;

import lt.mm.cameldemo.dto.DemoResponse;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cameldemo")
public class Controller {

    private final ProducerTemplate producerTemplate;
    private final ConsumerTemplate consumerTemplate;

    @Autowired
    public Controller(ProducerTemplate producerTemplate, ConsumerTemplate consumerTemplate) {
        this.producerTemplate = producerTemplate;
        this.consumerTemplate = consumerTemplate;
    }

    @GetMapping("/get")
    public DemoResponse getDemoResponse() {
        producerTemplate.sendBody("direct:getDemoResponse", "");
        DemoResponse response = consumerTemplate.receiveBody("seda:getDemoResponseResult", DemoResponse.class);
        return response;
    }

}