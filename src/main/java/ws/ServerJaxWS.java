package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJaxWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8787/";
        Endpoint.publish(url,new banqueService() );
        System.out.println("Web service is deployed at :" +url);
    }
}
