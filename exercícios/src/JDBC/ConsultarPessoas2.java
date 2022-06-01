package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		String sql = "select * from pessoas where nome like ?;";
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		System.out.print("Digite parte da busca: ");
		String consulta = "%" + entrada.nextLine() + "%";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, consulta);
		
		ResultSet resultado = stmt.executeQuery();
		
		while(resultado.next()) {
			pessoas.add(new Pessoa(resultado.getInt("cidigo"), resultado.getString("nome")));
		}
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getCodigo() + " ===> "+ pessoa.getNome());
		}
		stmt.close();
		conexao.close();
		entrada.close();
		
		
	}
}
