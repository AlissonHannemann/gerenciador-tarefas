package gerenciadortarefas;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TarefaDAO {
    public static boolean cadastrarTarefa(String titulo, String descricao, String prazo, String responsavel) {
        String sql = "INSERT INTO tarefas (titulo, descricao, prazo, responsavel) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, titulo);
            stmt.setString(2, descricao);
            stmt.setString(3, prazo); // deve estar no formato "yyyy-MM-dd"
            stmt.setString(4, responsavel);

            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
