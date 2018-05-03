package modelo.dominio;

public class Produto {

    private Integer id;
    private String Descricao;
    private Integer QuantidadeEstoque;
    private Double PrecoCusto;
    private Double PorcentagemLucro;
    private Double PrecoVenda;
    private String Perecivel;
    

    public Produto() {
    }

    public Produto(Integer Id,String Descricao, Integer QuantidadeEstoque, Double PrecoCusto, Double PorcentagemLucro, Double PrecoVenda, String Perecivel) {
        this.id = Id;
        this.Descricao = Descricao;
        this.QuantidadeEstoque = QuantidadeEstoque;
        this.PrecoCusto = PrecoCusto;
        this.PorcentagemLucro = PorcentagemLucro;
        this.PrecoVenda = PrecoVenda;
        this.Perecivel = Perecivel;
    }
    public Produto(String Descricao, Integer QuantidadeEstoque, Double PrecoCusto, Double PorcentagemLucro, Double PrecoVenda, String Perecivel) {
        this.Descricao = Descricao;
        this.QuantidadeEstoque = QuantidadeEstoque;
        this.PrecoCusto = PrecoCusto;
        this.PorcentagemLucro = PorcentagemLucro;
        this.PrecoVenda = PrecoVenda;
        this.Perecivel = Perecivel;
    }


    public Produto(String text, String text0, String text1, String text2, String text3, String text4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Integer getQuantidadeEstoque() {
        return QuantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer QuantidadeEstoque) {
        this.QuantidadeEstoque = QuantidadeEstoque;
    }

    public Double getPrecoCusto() {
        return PrecoCusto;
    }

    public void setPrecoCusto(Double PrecoCusto) {
        this.PrecoCusto = PrecoCusto;
    }

    public Double getPorcentagemLucro() {
        return PorcentagemLucro;
    }

    public void setPorcentagemLucro(Double PorcentagemLucro) {
        this.PorcentagemLucro = PorcentagemLucro;
    }

    public Double getPrecoVenda() {
        return PrecoVenda;
    }

    public void setPrecoVenda(Double PrecoVenda) {
        this.PrecoVenda = PrecoVenda;
    }

    public String getPerecivel() {
        return Perecivel;
    }

    public void setPerecivel(String Perecivel) {
        this.Perecivel = Perecivel;
    }

}
