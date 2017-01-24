package db;

import model.Automovil;
import model.Avion;
import model.Bicicleta;

import java.sql.*;

/**
 * Created by jl.jasso on 19/01/2017.
 */
public class BuscaBiciDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfavehiculos";
    private static final String USER = "root";
    private static final String PASS = "luces@1989";

    public Bicicleta buscarBici(String id)throws ClassNotFoundException,
            SQLException
    {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);

        Bicicleta bici = new Bicicleta("", "", "", "", "");

        String query = String.format(bici.busqueda() + id);
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(query);

        if(rs.next()){

            bici.setId(id);
            bici.setColor(rs.getString("color"));
            bici.setRodada(rs.getString("rodada"));
            bici.setMarca(rs.getString("marca"));
            bici.setTipo(rs.getString("tipo"));
        }

        conexion.close();
        st.close();
        rs.close();

        return  bici;
    }
}