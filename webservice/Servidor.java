package webservice;
import java.io.IOException;
import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

public class Servidor {

    public static void main(String[] args) {
        URI endpoint = UriBuilder.fromUri("http://localhost/").port(9000).build();
        System.out.println(endpoint + "/application.wadl");
        System.out.println("http://127.0.0.1:9000/application.wadl");
        
        ResourceConfig calculadora_rc = new PackagesResourceConfig("webservice");
        try {
            HttpServer server = HttpServerFactory.create(endpoint, calculadora_rc);
            server.start();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
}
