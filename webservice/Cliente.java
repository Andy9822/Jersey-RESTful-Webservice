package webservice;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import java.util.Scanner; 


public class Cliente {
     
    private static void soma() {
        // Lê operandos do usuário
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite primeiro operando");
        int a = scan.nextInt();
        System.out.println("Digite segundo operando");
        int b = scan.nextInt();

        ClientConfig config = new DefaultClientConfig();
        Client cliente = Client.create(config);
        WebResource servico = cliente.resource("http://localhost:9000/calculadora");
        WebResource servicoSomarInt = servico.path("somarInt").path(a + "/" + b);
        ClientResponse respostaSomarInt = servicoSomarInt.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        String respostaJsonSomarInt = respostaSomarInt.getEntity(String.class);
        System.out.println("Resposta da adicao: " + respostaJsonSomarInt);
    }

    private static void multiplica() {
        // Lê operandos do usuário
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite primeiro operando");
        int a = scan.nextInt();
        System.out.println("Digite segundo operando");
        int b = scan.nextInt();

        ClientConfig config = new DefaultClientConfig();
        Client cliente = Client.create(config);
        WebResource servico = cliente.resource("http://localhost:9000/calculadora");
        WebResource servicomultiplicarInt = servico.path("multiplicarInt").path(a + "/" + b);
        ClientResponse respostamultiplicarInt = servicomultiplicarInt.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        String respostaJsonmultiplicarInt = respostamultiplicarInt.getEntity(String.class);
        System.out.println("Resposta da multiplicacao: " + respostaJsonmultiplicarInt);
    }
    public static void main(String[] args) {
        System.out.println("Digite 1 para somar ou 2 para multiplicar");
        Scanner scan = new Scanner(System.in);
        String operacao = scan.next();
        if(operacao.equals("1")) {
            soma();
        }
        else if(operacao.equals("2")) {
            multiplica();
        }
        else {
            System.out.println("Opção inexistente");
        }
    }
}
