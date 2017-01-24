package db;

import model.Automovil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jl.jasso on 19/01/2017.
 */
public class AltaAutoDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfavehiculos";
    private static final String USER = "root";
    private static final String PASS = "luces@1989";

    public int registrarAutomovil(Automovil auto)throws ClassNotFoundException,
            SQLException
    {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement consulta = conexion.createStatement();


        String query = String.format(auto.alta(),
                Integer.parseInt(auto.getId()), auto.getColor(), auto.getMarca(), auto.getModelo(), auto.getKilometraje());

        int res = consulta.executeUpdate(query);
        //respuesta = consulta.execute(query);
        conexion.close();
        consulta.close();

        return  res;
    }
}
