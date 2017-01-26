package ws;

import db.BDCorrida;
import model.Corrida;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;

/**
 * Created by jl.jasso on 25/01/2017.
 */

@Path("/")
public class CorridaWS {

    @Path("Insertar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Corrida insertar(@FormParam("origen")String origen,
                            @FormParam("destino")String destino,
                            @FormParam("fechaInicio") String fechaInicio,
                            @FormParam("fechaFin") String fechaFin,
                            @FormParam("horaSalida") String horaSalida,
                            @FormParam("horaLlegada") String horaLlegada,
                            @FormParam("escalas") int escalas){

        Corrida corrida = new Corrida(0,
                origen,
                destino,
                Date.valueOf(fechaFin),
                Date.valueOf(fechaInicio),
                Time.valueOf(horaSalida),
                Time.valueOf(horaLlegada),
                0);

        try {
            BDCorrida.insertaCorrida(corrida);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return corrida;

    }


}
