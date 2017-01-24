package db;

import model.Bicicleta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jl.jasso on 19/01/2017.
 */
public class AltaBicicletaDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfavehiculos";
    private static final String USER = "root";
    private static final String PASS = "luces@1989";

    public int registrarBicicleta(Bicicleta bici)throws ClassNotFoundException,
            SQLException
    {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement consulta = conexion.createStatement();

        String query = String.format(bici.alta(),
                Integer.parseInt(bici.getId()), bici.getColor(), bici.getMarca(), bici.getRodada(), bici.getTipo());

        int res = consulta.executeUpdate(query);
        //respuesta = consulta.execute(query);
        conexion.close();
        consulta.close();

        return  res;
    }
}