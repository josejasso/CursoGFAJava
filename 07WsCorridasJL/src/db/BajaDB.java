package db;

import model.Servicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jl.jasso on 25/01/2017.
 */
public class BajaDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfaservicios";
    private static final String USER = "root";
    private static final String PASS = "luces@1989";

    public static String bajaServicios(String id) throws ClassNotFoundException, SQLException {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conexion.createStatement();
        String queryBaja = String.format("DELETE FROM servicio WHERE id = " + id);

        int res = st.executeUpdate(queryBaja);
        //respuesta = consulta.execute(query);
        conexion.close();
        st.close();

        String respuesta = "";

        if(res == 1)
            return respuesta = "Baja correcta";
        else
            return respuesta = "Error en datos de entrada";


    }

}
