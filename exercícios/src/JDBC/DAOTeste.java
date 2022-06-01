package JDBC;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "insert into pessoas (nome) values (?);";
		
		System.out.println(dao.incluir(sql,"João da Silva"));
		System.out.println(dao.incluir(sql,"Ana Julia"));
		System.out.println(dao.incluir(sql,"Djalma Pereira"));
	}
}
