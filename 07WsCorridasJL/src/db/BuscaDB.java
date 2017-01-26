package db;

import model.Servicio;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by jl.jasso on 25/01/2017.
 */
public class BuscaDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfaservicios";
    private static final String USER = "root";
    private static final String PASS = "luces@1989";

    public static ArrayList buscaServicios(String fechaMin, String horaMin,
                                        String fechaMax, String horaMax) throws ClassNotFoundException, SQLException {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conexion.createStatement();
        String queryBusca = String.format("select * from  servicio where concat(" +
                "fechaSalida,' ',horaSalida) between " +
                "('"+fechaMin+" "+horaMin+"') and ('"+fechaMax+" "+horaMax+"')");
        ResultSet rs = st.executeQuery(queryBusca);



        ArrayList<Servicio> lista = new ArrayList<Servicio>();

        while(rs.next()){

            Servicio s = new Servicio();
            s.setId(rs.getInt("id"));
            s.setOrigen(rs.getString("origen"));
            s.setDestino(rs.getString("destino"));
            s.setFechaSalida(rs.getString("fechaSalida"));
            s.setHoraSalida(rs.getString("horaSalida"));
            s.setFechaLlegada(rs.getString("fechaLlegada"));
            s.setHoraLlegada(rs.getString("horaLlegada"));
            s.setEscalas(rs.getInt("escalas"));
            lista.add(s);
        }

        conexion.close();
        st.close();
        rs.close();

        return lista;

    }

}
