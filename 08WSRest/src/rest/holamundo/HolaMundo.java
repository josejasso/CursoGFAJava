package rest.holamundo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

/**
 * Created by jl.jasso on 25/01/2017.
 */

@Path("/HolaMundo")
public class HolaMundo {

    @GET
    @Produces (MediaType.TEXT_PLAIN)
    public String holaMundoText(){
        return "Hola Mundo";
    }

    @GET
    @Produces (MediaType.TEXT_XML)
    public String HolaMundoXML(){
        return "<?xml version=\"1.0\">" +
                "<hola>Hola Mundo</hola>";
    }

    @GET
    @Produces (MediaType.TEXT_HTML)
    public String HolaMundoHTML(){

        return  "<html>" +
                "<body>" +
                "<h1>Hola Mundo</h1>" +
                "</body>" +
                "</html>";
    }

}
