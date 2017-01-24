package db;

import model.Autobus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jl.jasso on 18/01/2017.
 */
public class AutobusDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfajava";
    private static final String USER = "root";
    private static final String PASS = "luces@1989";

    public int registrarAutobus(Autobus autobus)throws ClassNotFoundException,
            SQLException
    {
        boolean respuesta = true;

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement consulta = conexion.createStatement();
        String query = String.format("INSERT INTO autobus(num_autobus, siglas, modelo, capacidad, base)" +
                "values ('%d', '%s', '%d', '%d', '%s')",
                autobus.getNum_autobus(), autobus.getSiglas(), autobus.getModelo(), autobus.getCapacidad(), autobus.getBase());

        int res = consulta.executeUpdate(query);
        //respuesta = consulta.execute(query);
        conexion.close();
        consulta.close();

        return  res;
    }

    public List<Autobus> getAutobuses()
            throws ClassNotFoundException,
            SQLException{
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT * FROM autobus");

        ArrayList<Autobus> lista = new ArrayList<>();
        //Autobus autobus = new Autobus();

        while (resultado.next()){

            /*
            int num_autobus = resultado.getInt("num_autobus");
            String siglas = resultado.getString("siglas");
            int modelo = resultado.getInt("modelo");
            int capacidad = resultado.getInt("capacidad");
            String base = resultado.getString("base");
            */
            Autobus autobus = new Autobus();
            autobus.setNum_autobus(resultado.getInt("num_autobus"));
            autobus.setSiglas(resultado.getString("siglas"));
            autobus.setModelo(resultado.getInt("modelo"));
            autobus.setCapacidad(resultado.getInt("capacidad"));
            autobus.setBase(resultado.getString("base"));

            lista.add(autobus);

        }

        resultado.close();
        consulta.close();
        conexion.close();

        return lista;
    }

}
