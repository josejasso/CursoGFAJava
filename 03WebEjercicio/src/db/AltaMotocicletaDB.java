package db;

import model.Bicicleta;
import model.Motocicleta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jl.jasso on 19/01/2017.
 */
public class AltaMotocicletaDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfavehiculos";
    private static final String USER = "root";
    private static final String PASS = "luces@1989";

    public int registrarMotocicleta(Motocicleta moto)throws ClassNotFoundException,
            SQLException
    {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement consulta = conexion.createStatement();

        String query = String.format(moto.alta(),
                Integer.parseInt(moto.getId()), moto.getColor(), moto.getMarca(), moto.getModelo(), moto.getTransmision());

        int res = consulta.executeUpdate(query);
        //respuesta = consulta.execute(query);
        conexion.close();
        consulta.close();

        return  res;
    }
}
