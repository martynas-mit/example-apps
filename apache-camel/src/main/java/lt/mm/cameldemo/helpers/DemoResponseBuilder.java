package lt.mm.cameldemo.helpers;

import lt.mm.cameldemo.dto.DemoResponse;

public class DemoResponseBuilder {

    public DemoResponse buildDemoResponse(String param1, String param2) {
        return new DemoResponse(param1, param2);
    }

}
