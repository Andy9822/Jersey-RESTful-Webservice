package webservice;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("calculadora")
public class CalculadoraRest {   

    @Path("/somarInt/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Calculadora somarInt(@PathParam("op1") int op1,  @PathParam("op2") int op2){
        Calculadora calc = new Calculadora(op1,op2,"+");
        return calc;
    }

    @Path("/multiplicarInt/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Calculadora multiplicarInt(@PathParam("op1") int op1,  @PathParam("op2") int op2){
        Calculadora calc = new Calculadora(op1,op2,"*");
        return calc;
    }
}
