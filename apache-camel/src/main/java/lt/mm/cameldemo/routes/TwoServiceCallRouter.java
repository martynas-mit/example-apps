package lt.mm.cameldemo.routes;

import lt.mm.cameldemo.helpers.DemoResponseBuilder;
import lt.mm.cameldemo.services.ServiceOne;
import lt.mm.cameldemo.services.ServiceTwo;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TwoServiceCallRouter extends RouteBuilder {

    private final ServiceOne serviceOne;
    private final ServiceTwo serviceTwo;

    @Autowired
    public TwoServiceCallRouter(ServiceOne serviceOne, ServiceTwo serviceTwo) {
        this.serviceOne = serviceOne;
        this.serviceTwo = serviceTwo;
    }

    @Override
    public void configure() {

        from("direct:getDemoResponse")
                .bean(serviceOne, "getInfo")
                .setProperty("firstProperty", body())
                .bean(serviceTwo, "getInfo")
                .setProperty("secondProperty", body())
                .bean(DemoResponseBuilder.class, "buildDemoResponse(${exchangeProperty.firstProperty}, ${exchangeProperty.secondProperty})")
                .log(LoggingLevel.INFO, "body: ${body}")
                .to("seda:getDemoResponseResult")
        .end();

    }
}
