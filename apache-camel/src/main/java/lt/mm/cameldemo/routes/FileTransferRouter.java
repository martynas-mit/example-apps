package lt.mm.cameldemo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileTransferRouter extends RouteBuilder {

    @Override
    public void configure() {

        from("file:C:\\camel-test\\inbox?noop=true")
                .to("file:C:\\camel-test\\outbox");

    }

}
