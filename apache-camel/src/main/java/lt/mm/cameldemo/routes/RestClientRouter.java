package lt.mm.cameldemo.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestClientRouter extends RouteBuilder {

    @Override
    public void configure() {

        from("direct:getPsw")
                .setHeader(Exchange.HTTP_METHOD, simple("POST"))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                .to("https://www.passwordrandom.com/query?command=password")
        .end();
    }

}
