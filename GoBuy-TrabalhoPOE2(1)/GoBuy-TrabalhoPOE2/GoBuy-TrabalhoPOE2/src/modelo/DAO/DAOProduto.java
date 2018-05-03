package modelo.DAO;

import controlador.CProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.dominio.Produto;

public class DAOProduto {

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

    public boolean insereProduto(Produto produto) {

        conectar();
        String sql = "INSERT INTO PRODUTO(descricao, quantidade_estoque, preco_custo, porcentagem_lucro, preco_venda, perecivel) "
                + "VALUES(?,?,?,?,?,?)";

        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, produto.getDescricao());
            comando.setInt(2, produto.getQuantidadeEstoque());
            comando.setDouble(3, produto.getPrecoCusto());
            comando.setDouble(4, produto.getPorcentagemLucro());
            comando.setDouble(5, produto.getPrecoVenda());
            comando.setString(6, produto.getPerecivel());

            comando.execute();

            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao inserir Produto\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }

    public ArrayList<Produto> selecionarTodosRegistros() {
        conectar();
        //interface utilizada pra guardar dados vindos de um banco de dados
        ResultSet rs;
        String sql = "SELECT * FROM PRODUTO";
        //lista que conterá todas as informações de pessoas no banco de dados
        ArrayList<Produto> listaProdutos = new ArrayList();
        try {
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("ID"));
                produto.setDescricao(rs.getString("DESCRICAO"));
                produto.setQuantidadeEstoque(rs.getInt("QUANTIDADE_ESTOQUE"));
                produto.setPrecoCusto(rs.getDouble("PRECO_CUSTO"));
                produto.setPorcentagemLucro(rs.getDouble("PORCENTAGEM_LUCRO"));
                produto.setPrecoVenda(rs.getDouble("PRECO_VENDA"));
                produto.setPerecivel(rs.getString("PERECIVEL"));
                listaProdutos.add(produto);
            }
            return listaProdutos;
        } catch (SQLException e) {
            System.err.println("Erro visualizar Produtos\n" + e.getMessage());
            return null;
        } finally {
            fechar();
        }
    }

    public boolean alteraProduto(Produto produto) {
        conectar();
        String sql = "UPDATE PRODUTO SET DESCRICAO = ?, QUANTIDADE_ESTOQUE = ?, PRECO_CUSTO = ?, PORCENTAGEM_LUCRO = ?, PRECO_VENDA = ?, PERECIVEL = ?"
                + "WHERE ID = ?";
        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, produto.getDescricao());
            comando.setInt(2, produto.getQuantidadeEstoque());
            comando.setDouble(3, produto.getPrecoCusto());
            comando.setDouble(4, produto.getPorcentagemLucro());
            comando.setDouble(5, produto.getPrecoVenda());
            comando.setString(6, produto.getPerecivel());
            comando.setInt(7, produto.getId());
            comando.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.err.println("Erro visualizar Produtos\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }

    public boolean removeProduto(Integer id) {
        conectar();
        String sql = "DELETE FROM PRODUTO WHERE ID=?";
        try {
            comando = con.prepareStatement(sql);
            comando.setInt(1, id);
            comando.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao deletar Cliente\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }
}
