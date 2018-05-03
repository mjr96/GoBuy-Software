package modelo.DAO;

import controlador.CFuncionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.dominio.Funcionario;

public class DAOFuncionario {

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

    public boolean insereFuncionario(Funcionario funcionario) {

        conectar();
        String sql = "INSERT INTO FUNCIONARIO(nome_funcionario, salario_funcionario, cpf, endereco, telefone, matricula, data_admicao, sexo) "
                + "VALUES(?,?,?,?,?,?,?,?)";

        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, funcionario.getNomeFuncionario());
            comando.setDouble(2, funcionario.getSalarioFuncionario());
            comando.setString(3, funcionario.getCpf());
            comando.setString(4, funcionario.getEndereco());
            comando.setString(5, funcionario.getTelefone());      
            comando.setInt(6, funcionario.getMatricula());
            comando.setDate(7, CFuncionario.converteDateSQL(funcionario.getDataAdmicao()));
            comando.setString(8, funcionario.getSexo());
            comando.execute();

            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao inserir Funcionario\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }

    public ArrayList<Funcionario> selecionarTodosRegistros() {
        conectar();
        //interface utilizada pra guardar dados vindos de um banco de dados
        ResultSet rs;
        String sql = "SELECT * FROM FUNCIONARIO";
        //lista que conterá todas as informações de pessoas no banco de dados
        ArrayList<Funcionario> listaFuncionarios = new ArrayList();
        try {
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while (rs.next()) {
                Funcionario Funcionario = new Funcionario();
                Funcionario.setId(rs.getInt("ID"));
                Funcionario.setNomeFuncionario(rs.getString("NOME_FUNCIONARIO"));
                Funcionario.setSalarioFuncionario(rs.getDouble("SALARIO_FUNCIONARIO"));
                Funcionario.setCpf(rs.getString("CPF"));
                Funcionario.setEndereco(rs.getString("ENDERECO"));
                Funcionario.setTelefone(rs.getString("TELEFONE"));
                Funcionario.setMatricula(rs.getInt("MATRICULA"));
                Funcionario.setDataAdmicao(rs.getDate("DATA_ADMICAO"));
                Funcionario.setSexo(rs.getString("SEXO"));
                listaFuncionarios.add(Funcionario);
            }
            return listaFuncionarios;
        } catch (SQLException e) {
            System.err.println("Erro visualizar Funcionarios\n" + e.getMessage());
            return null;
        } finally {
            fechar();
        }
    }

    public boolean alteraFuncionario(Funcionario funcionario) {
        conectar();
        String sql = "UPDATE FUNCIONARIO SET NOME_FUNCIONARIO = ?, SALARIO_FUNCIONARIO = ?, CPF = ?, ENDERECO = ?, TELEFONE = ?, MATRICULA = ?, DATA_ADMICAO = ?, SEXO = ?"
                + "WHERE ID = ?";
        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, funcionario.getNomeFuncionario());
            comando.setDouble(2, funcionario.getSalarioFuncionario());
            comando.setString(3, funcionario.getCpf());
            comando.setString(4, funcionario.getEndereco());
            comando.setString(5, funcionario.getTelefone());      
            comando.setInt(6, funcionario.getMatricula());
            comando.setDate(7, CFuncionario.converteDateSQL(funcionario.getDataAdmicao()));
            comando.setString(8, funcionario.getSexo());
            comando.setInt(9, funcionario.getId());

            comando.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.err.println("Erro visualizar Funcionario\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }

     public boolean removeFuncionario(Integer id) {
        conectar();
        String sql = "DELETE FROM FUNCIONARIO WHERE ID=?";
        try {
            comando = con.prepareStatement(sql);
            comando.setInt(1, id);
            comando.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao deletar Funcionario\n" + e.getMessage());
        } finally {
            fechar();
        }
        return false;
    }

}
