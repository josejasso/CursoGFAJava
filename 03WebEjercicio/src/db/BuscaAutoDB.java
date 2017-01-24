package db;

import model.Automovil;

import java.sql.*;

/**
 * Created by jl.jasso on 19/01/2017.
 */
public class BuscaAutoDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfavehiculos";
    private static final String USER = "root";
    private static final String PASS = "luces@1989";

    public Automovil buscarAutomovil(String id)throws ClassNotFoundException,
            SQLException
    {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);

        Automovil auto = new Automovil("", "", "", "", "");

        String query = String.format(auto.busqueda() + id);
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(query);

        if(rs.next()){

            auto.setId(id);
            auto.setColor(rs.getString("color"));
            auto.setModelo(rs.getString("modelo"));
            auto.setMarca(rs.getString("marca"));
            auto.setKilometraje(rs.getString("kilometraje"));
        }

        conexion.close();
        st.close();
        rs.close();

        return  auto;
    }
}
