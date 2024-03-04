package org.example;

import java.sql.Connection;
import java.sql.SQLException;

import static org.example.FabricaConexao.getConexao;

public class TesteConexao {
    public static void main(String[] args) throws SQLException{
        Connection conexao = getConexao();
    }
}
