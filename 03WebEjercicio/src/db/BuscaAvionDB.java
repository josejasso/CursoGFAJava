package db;

import model.Automovil;
import model.Avion;

import java.sql.*;

/**
 * Created by jl.jasso on 19/01/2017.
 */
public class BuscaAvionDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfavehiculos";
    private static final String USER = "root";
    private static final String PASS = "luces@1989";

    public Avion buscarAvion(String id)throws ClassNotFoundException,
            SQLException
    {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);

        Avion avion = new Avion("", "", "", "", "");

        String query = String.format(avion.busqueda() + id);
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(query);

        if(rs.next()){

            avion.setId(id);
            avion.setColor(rs.getString("color"));
            avion.setTamañoTanque(rs.getString("capacidadTanque"));
            avion.setMarca(rs.getString("marca"));
            avion.setLineaAerea(rs.getString("lineaAerea"));
        }

        conexion.close();
        st.close();
        rs.close();

        return  avion;
    }
}
