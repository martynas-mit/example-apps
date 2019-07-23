package lt.mm.pinglistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class PingListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingListenerApplication.class, args);
	}

}
