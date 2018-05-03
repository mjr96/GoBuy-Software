package modelo.dominio;

public class Cliente {
    private Integer id;
    private String NomeCliente;
    private String Endereco;
    private String Cpf;
    private String Telefone;
    private String TipoPessoa;
    private String FormaPagamento;
    private String observacao;

    public Cliente() {
    }

    public Cliente(Integer Id, String NomeCliente, String Endereco, String Cpf, String Telefone, String TipoPessoa, String FormaPagamento, String observacao) {
        this.id = Id;
        this.NomeCliente = NomeCliente;
        this.Endereco = Endereco;
        this.Cpf = Cpf;
        this.Telefone = Telefone;
        this.TipoPessoa = TipoPessoa;
        this.FormaPagamento = FormaPagamento;
        this.observacao = observacao;
    }

    public Cliente(String NomeCliente, String Endereco, String Cpf, String Telefone, String TipoPessoa, String FormaPagamento, String observacao) {
        this.NomeCliente = NomeCliente;
        this.Endereco = Endereco;
        this.Cpf = Cpf;
        this.Telefone = Telefone;
        this.TipoPessoa = TipoPessoa;
        this.FormaPagamento = FormaPagamento;
        this.observacao = observacao;
    }

    public Cliente(String text, String text0, String text1, String text2, String auxPerecivel, String auxPagamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getTipoPessoa() {
        return TipoPessoa;
    }

    public void setTipoPessoa(String TipoPessoa) {
        this.TipoPessoa = TipoPessoa;
    }

    public String getFormaPagamento() {
        return FormaPagamento;
    }

    public void setFormaPagamento(String FormaPagamento) {
        this.FormaPagamento = FormaPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
    
    
    
    
}
