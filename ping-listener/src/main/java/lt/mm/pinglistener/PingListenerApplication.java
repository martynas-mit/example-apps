package lt.mm.pinglistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class PingListenerApplication {

	public static void main(String[] args) {
		if (args != null && args.length > 0) {
			String port = args[0];
			System.setProperty("server.port", port);
		}
		SpringApplication.run(PingListenerApplication.class, args);
	}

}
