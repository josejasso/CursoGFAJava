package db;

import model.Motocicleta;

import java.sql.*;

/**
 * Created by jl.jasso on 19/01/2017.
 */
public class BuscaMotoDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfavehiculos";
    private static final String USER = "root";
    private static final String PASS = "luces@1989";

    public Motocicleta buscarMoto(String id)throws ClassNotFoundException,
            SQLException
    {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);

        Motocicleta moto = new Motocicleta("", "", "", "", "");

        String query = String.format(moto.busqueda() + id);
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(query);

        if(rs.next()){

            moto.setId(id);
            moto.setColor(rs.getString("color"));
            moto.setModelo(rs.getString("modelo"));
            moto.setMarca(rs.getString("marca"));
            moto.setTransmision(rs.getString("transmision"));
        }

        conexion.close();
        st.close();
        rs.close();

        return  moto;
    }
}
