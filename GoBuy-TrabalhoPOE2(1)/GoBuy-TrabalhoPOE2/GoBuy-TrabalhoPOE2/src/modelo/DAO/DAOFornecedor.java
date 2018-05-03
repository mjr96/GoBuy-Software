package modelo.DAO;

import controlador.CFornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.dominio.Fornecedor;

public class DAOFornecedor {

    //Classe responsável pela conexão (sessão) com um banco de dados específico. 
    //As instruções SQL são executadas e os resultados são retornados dentro do contexto de uma conexão.
    private Connection con;

    //Pre-compila a query para o banco de dados
    // Cria um objeto PreparedStatement para enviar instruções SQL parametrizadas para o banco de dados.
    //Uma instrução SQL com ou sem parâmetros IN pode ser pré-compilada e armazenada em um objeto PreparedStatement.
    //Esse objeto pode ser usado para executar essa instrução de forma eficiente várias vezes. 
    private PreparedStatement comando;

    private final FabricaConexao fCobexao = FabricaConexao.getInstancia();

    // Método acessado internamente para conectar com o banco
    private void conectar() {
        con = fCobexao.conexao();
    }

    //Método que fecha a conexão com o banco
    private void fechar() {
        try {
            comando.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("Erro ao fechar conexão\n" + e.getMessage());
        }
    }

    public boolean insereFornecedor(Fornecedor fornecedor) {

        conectar();
        String sql = "INSERT INTO FORNECEDOR(nome_fornecedor, cnpj, telefone, cidade, endereco, grupo_comprador) "
                + "VALUES(?,?,?,?,?,?)";

        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, fornecedor.getNomeFornecedor());
            comando.setString(2, fornecedor.getCnpj());
            comando.setString(3, fornecedor.getTelefone());
            comando.setString(4, fornecedor.getCidade());
            comando.setString(5, fornecedor.getEndereco());
            comando.setString(6, fornecedor.getGrupoComprador());

            comando.execute();

            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao inserir Fornecedor\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }

    public ArrayList<Fornecedor> selecionarTodosRegistros() {
        conectar();
        //interface utilizada pra guardar dados vindos de um banco de dados
        ResultSet rs;
        String sql = "SELECT * FROM FORNECEDOR";
        //lista que conterá todas as informações de pessoas no banco de dados
        ArrayList<Fornecedor> listaFornecedores = new ArrayList();
        try {
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rs.getInt("ID"));
                fornecedor.setNomeFornecedor(rs.getString("NOME_FORNECEDOR"));
                fornecedor.setCnpj(rs.getString("CNPJ"));
                fornecedor.setTelefone(rs.getString("TELEFONE"));
                fornecedor.setCidade(rs.getString("CIDADE"));
                fornecedor.setEndereco(rs.getString("ENDERECO"));
                fornecedor.setGrupoComprador(rs.getString("GRUPO_COMPRADOR"));
                listaFornecedores.add(fornecedor);
            }
            return listaFornecedores;
        } catch (SQLException e) {
            System.err.println("Erro visualizar Fornecedores\n" + e.getMessage());
            return null;
        } finally {
            fechar();
        }
    }

    public boolean alteraFornecedor(Fornecedor fornecedor) {
        conectar();
        String sql = "UPDATE FORNECEDOR SET NOME_FORNECEDOR = ?, CNPJ = ?, TELEFONE = ?, CIDADE = ?, ENDERECO = ?, GRUPO_COMPRADOR = ?"
                + "WHERE ID = ?";
        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, fornecedor.getNomeFornecedor());
            comando.setString(2, fornecedor.getCnpj());
            comando.setString(3, fornecedor.getTelefone());
            comando.setString(4, fornecedor.getCidade());
            comando.setString(5, fornecedor.getEndereco());
            comando.setString(6, fornecedor.getGrupoComprador());
            comando.setInt(7, fornecedor.getId());
            
            comando.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.err.println("Erro visualizar Fornecedor\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }

     public boolean removeFornecedor(Integer id) {
        conectar();
        String sql = "DELETE FROM FORNECEDOR WHERE ID=?";
        try {
            comando = con.prepareStatement(sql);
            comando.setInt(1, id);
            comando.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao deletar Fornecedor\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }

}
