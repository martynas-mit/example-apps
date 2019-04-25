package lt.mm.cameldemo.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceOne {

    public String getInfo() {
        return "This info is from FIRST service";
    }

}
