package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTabelaConversao {
    public static void main(String[] args) throws SQLException, RuntimeException {
        Connection  conexao = FabricaConexao.getConexao();

        String create_table_sql = "CREATE TABLE conversao_nova (codigo INT AUTO_INCREMENT PRIMARY KEY, entrada float NOT NULL, conversao VARCHAR(80) NOT NULL, saida float NOT NULL)";

        Statement stmt = conexao.createStatement();
        try{
            stmt.execute(create_table_sql);
            System.out.println("A tabela foi criada com sucesso");
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
