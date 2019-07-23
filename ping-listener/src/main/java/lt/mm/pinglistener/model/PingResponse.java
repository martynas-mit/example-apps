package lt.mm.pinglistener.model;

public class PingResponse {

    private String responseMsg;

    public PingResponse(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public String getResponseMsg() {
        return responseMsg;
    }
}
