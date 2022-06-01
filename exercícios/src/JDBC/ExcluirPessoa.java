package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE from pessoas where cidigo = ?;";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		System.out.print("Informe o código: ");
		int codigo = entrada.nextInt();
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		} else {
			System.out.println("Nada feito!");
		}
		System.out.println("Linhas afetadas: " + contador);
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
