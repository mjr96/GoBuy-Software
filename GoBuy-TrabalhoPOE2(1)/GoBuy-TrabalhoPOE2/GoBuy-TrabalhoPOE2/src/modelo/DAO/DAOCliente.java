package modelo.DAO;

import controlador.CCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.dominio.Cliente;

public class DAOCliente {

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

    public boolean insereCliente(Cliente cliente) {

        conectar();
        String sql = "INSERT INTO CLIENTE(nome, endereco, cpf, telefone, tipo_pessoa, forma_pagamento, observacao ) "
                + "VALUES(?,?,?,?,?,?,?)";

        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, cliente.getNomeCliente());
            comando.setString(2, cliente.getEndereco());
            comando.setString(3, cliente.getCpf());
            comando.setString(4, cliente.getTelefone());
            comando.setString(5, cliente.getTipoPessoa());
            comando.setString(6, cliente.getFormaPagamento());
            comando.setString(7, cliente.getObservacao());

            comando.execute();

            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao inserir Cliente\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }

    public ArrayList<Cliente> selecionarTodosRegistros() {
        conectar();
        //interface utilizada pra guardar dados vindos de um banco de dados
        ResultSet rs;
        String sql = "SELECT * FROM CLIENTE";
        //lista que conterá todas as informações de pessoas no banco de dados
        ArrayList<Cliente> listaClientes = new ArrayList();
        try {
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("ID"));
                cliente.setNomeCliente(rs.getString("NOME"));
                cliente.setEndereco(rs.getString("ENDERECO"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setTelefone(rs.getString("TELEFONE"));
                cliente.setTipoPessoa(rs.getString("TIPO_PESSOA"));
                cliente.setFormaPagamento(rs.getString("FORMA_PAGAMENTO"));
                cliente.setObservacao(rs.getString("OBSERVACAO"));
                listaClientes.add(cliente);
            }
            return listaClientes;
        } catch (SQLException e) {
            System.err.println("Erro visualizar Clientes\n" + e.getMessage());
            return null;
        } finally {
            fechar();
        }
    }

    public boolean alteraCliente(Cliente cliente) {
        conectar();
        String sql = "UPDATE CLIENTE SET NOME = ?, ENDERECO = ?, CPF = ?, TELEFONE = ?, TIPO_PESSOA = ?, FORMA_PAGAMENTO = ?, OBSERVACAO = ? "
                + "WHERE ID = ?";
        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, cliente.getNomeCliente());
            comando.setString(2, cliente.getEndereco());
            comando.setString(3, cliente.getCpf());
            comando.setString(4, cliente.getTelefone());
            comando.setString(5, cliente.getTipoPessoa());
            comando.setString(6, cliente.getFormaPagamento());
            comando.setString(7, cliente.getObservacao());
            comando.setInt(8, cliente.getId());
            comando.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.err.println("Erro visualizar Cliente\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }

    public boolean removeCliente(Integer id) {
        conectar();
        String sql = "DELETE FROM CLIENTE WHERE ID=?";
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
