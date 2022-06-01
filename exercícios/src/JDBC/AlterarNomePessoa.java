package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "select cidigo, nome from pessoas where cidigo = ?;";
		System.out.print("Digite o ID: ");
		int cidigo = entrada.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, cidigo);
		
		ResultSet r = stmt.executeQuery();
		
		if(r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("O nome atual é " + p.getNome());
			entrada.nextLine();
			
		System.out.print("Digite o novo nome: ");
		p.setNome(entrada.nextLine());
		
		String sql2 = "update pessoas set nome = ? where cidigo = ?;";
		
		stmt.close();
		stmt = conexao.prepareStatement(sql2);
		stmt.setString(1, p.getNome());
		stmt.setInt(2, p.getCodigo());
		stmt.execute();
		stmt.close();
		
		System.out.println("Alterado com sucesso");
		
		} else {
			System.out.println("Pessoa não encontrada!");
		}
		
		conexao.close();
		entrada.close();
		
	}

}
