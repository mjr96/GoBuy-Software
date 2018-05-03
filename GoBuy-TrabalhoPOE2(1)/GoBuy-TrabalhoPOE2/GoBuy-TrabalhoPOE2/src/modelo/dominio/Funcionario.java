package modelo.dominio;

import java.util.Date;

public class Funcionario {
    private Integer id;
    private String NomeFuncionario;
    private Double SalarioFuncionario;
    private String Cpf;
    private String Endereco;
    private String Telefone;
    private Integer Matricula;
    private Date DataAdmicao;
    private String Sexo;

    public Funcionario() {
    }

    public Funcionario(Integer Id,String NomeFuncionario, Double SalarioFuncionario, String Cpf, String Endereco, String Telefone, Integer Matricula, Date DataAdmicao, String Sexo) {
        this.id = Id;
        this.NomeFuncionario = NomeFuncionario;
        this.SalarioFuncionario = SalarioFuncionario;
        this.Cpf = Cpf;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Matricula = Matricula;
        this.DataAdmicao = DataAdmicao;
        this.Sexo = Sexo;
    }

    public Funcionario(String NomeFuncionario, Double SalarioFuncionario, String Cpf, String Endereco, String Telefone, Integer Matricula, Date DataAdmicao, String Sexo) {
        this.NomeFuncionario = NomeFuncionario;
        this.SalarioFuncionario = SalarioFuncionario;
        this.Cpf = Cpf;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Matricula = Matricula;
        this.DataAdmicao = DataAdmicao;
        this.Sexo = Sexo;
    }

    

    
    
    public String getNomeFuncionario() {
        return NomeFuncionario;
    }

    public void setNomeFuncionario(String NomeFuncionario) {
        this.NomeFuncionario = NomeFuncionario;
    }

    public Double getSalarioFuncionario() {
        return SalarioFuncionario;
    }

    public void setSalarioFuncionario(Double SalarioFuncionario) {
        this.SalarioFuncionario = SalarioFuncionario;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public Integer getMatricula() {
        return Matricula;
    }

    public void setMatricula(Integer Matricula) {
        this.Matricula = Matricula;
    }

    public Date getDataAdmicao() {
        return DataAdmicao;
    }

    public void setDataAdmicao(Date DataAdmicao) {
        this.DataAdmicao = DataAdmicao;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
