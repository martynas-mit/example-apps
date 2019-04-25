package lt.mm.cameldemo.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceTwo {

    public String getInfo() {
        return "This info is from SECOND service";
    }

}
