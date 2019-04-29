package lt.mm.cameldemo.helpers;

import lt.mm.cameldemo.dto.DemoResponse;

public class DemoResponseBuilder {

    public static DemoResponse buildDemoResponse(String param1, String param2) {
        return new DemoResponse(param1, param2);
    }

    public static DemoResponse buildDemoResponse(String param1) {
        return new DemoResponse(param1, null);
    }

}
