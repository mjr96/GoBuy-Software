package modelo.dominio; 

public class Fornecedor {
    private Integer id;
    private String NomeFornecedor;
    private String Cnpj;
    private String Telefone;
    private String Cidade;
    private String Endereco; 
    private String GrupoComprador;

    public Fornecedor() {
    }

    
    public Fornecedor(String NomeFornecedor, String Cnpj, String Telefone, String Cidade, String Endereco, String GrupoComprador) {
        
        this.NomeFornecedor = NomeFornecedor;
        this.Cnpj = Cnpj;
        this.Telefone = Telefone;
        this.Cidade = Cidade;
        this.Endereco = Endereco;
        this.GrupoComprador = GrupoComprador;
    }
    public Fornecedor(Integer Id,String NomeFornecedor, String Cnpj, String Telefone, String Cidade, String Endereco, String GrupoComprador) {
        this.id = Id;
        this.NomeFornecedor = NomeFornecedor;
        this.Cnpj = Cnpj;
        this.Telefone = Telefone;
        this.Cidade = Cidade;
        this.Endereco = Endereco;
        this.GrupoComprador = GrupoComprador;
    }
    
/*
    public Fornecedor(String text, String text0, String text1, String text2, String text3, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
   

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeFornecedor() {
        return NomeFornecedor;
    }

    public void setNomeFornecedor(String NomeFornecedor) {
        this.NomeFornecedor = NomeFornecedor;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getGrupoComprador() {
        return GrupoComprador;
    }

    public void setGrupoComprador(String GrupoComprador) {
        this.GrupoComprador = GrupoComprador;
    }

    
    
}
