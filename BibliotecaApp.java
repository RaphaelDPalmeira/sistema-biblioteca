import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BibliotecaApp {
    public static void main(String[] args) {
        // Conectar ao banco de dados MySQL
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "seuUsuario", "suaSenha")) {
            public void cadastrarUsuario(Usuario usuario) throws SQLException {
                // Insere o usuário no banco de dados
                String sql = "INSERT INTO usuarios (nome, cpf, email, telefone) VALUES (?, ?, ?, ?)";
                PreparedStatement statement = this.connection.prepareStatement(sql);
                statement.setString(1, usuario.getNome());
                statement.setString(2, usuario.getCpf());
                statement.setString(3, usuario.getEmail());
                statement.setString(4, usuario.getTelefone());
                statement.executeUpdate();
            }

            public Usuario consultarUsuario(String cpf) throws SQLException {
                // Consulta o usuário no banco de dados
                String sql = "SELECT * FROM usuarios WHERE cpf = ?";
                PreparedStatement statement = this.connection.prepareStatement(sql);
                statement.setString(1, cpf);
                ResultSet resultSet = statement.executeQuery();
        
                if (resultSet.next()) {
                    // Retorna o usuário
                    Usuario usuario = new Usuario();
                    usuario.setId(resultSet.getInt("id"));
                    usuario.setNome(resultSet.getString("nome"));
                    usuario.setCpf(resultSet.getString("cpf"));
                    usuario.setEmail(resultSet.getString("email"));
                    usuario.setTelefone(resultSet.getString("telefone"));
                    return usuario;
                } else {
                    return null;
                }
            }

            public void emprestarLivro(Usuario usuario, Livro livro, Date dataEmprestimo) throws SQLException {
                // Insere o empréstimo no banco de dados
                String sql = "INSERT INTO emprestimos (usuario, livro, data_emprestimo, data_devolucao) VALUES (?, ?, ?, ?)";
                PreparedStatement statement = this.connection.prepareStatement(sql);
                statement.setInt(1, usuario.getId());
                statement.setInt(2, livro.getId());
                statement.setDate(3, dataEmprestimo);
                statement.setDate(4, null);
                statement.executeUpdate();
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
