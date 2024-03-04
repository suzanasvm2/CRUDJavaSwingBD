package org.example;
import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class FabricaConexao {
    public static Connection getConexao() throws SQLException, RuntimeException {
        try {
            final String database = "conversor";
            final String url = "jdbc:mysql://localhost/" + database + "?useSSL=false";
            final String usuario = "root";
            final String senha = "Camp6929!";

            System.out.println("Conectado com sucesso!");
            return getConnection(url, usuario, senha);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
