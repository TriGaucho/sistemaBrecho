
public class Peca {
    private String codigoPeca;
    private String tipoPeca;
    private String descricao;
    private Float valorVenda;
    private Float percentualRepasse;
    private String tamanho;
    private Float valorRepassado;

    public Peca(String codigoPeca,
            String tipoPeca,
            String descricao,
            Float valorVenda,
            Float percentualRepasse,
            String tamanho) {
        this.codigoPeca = codigoPeca;
        this.tipoPeca = tipoPeca;
        this.descricao = descricao;
        this.valorVenda = valorVenda;
        this.percentualRepasse = percentualRepasse;
        this.tamanho = tamanho;
    }

    public String toString() {
        return "Codigo: " + this.codigoPeca + "/Valor: " + this.valorVenda;
    }

    public void setValorRepassado(Float valorRepassado) {
        this.valorRepassado = valorRepassado;
    }

    public void setValorVenda(Float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Float getValorPeca() {
        return this.valorVenda;
    }

    
    public String getCodigoPeca() {
        return codigoPeca;
    }

    public void setCodigoPeca(String codigoPeca) {
        this.codigoPeca = codigoPeca;
    }

    
    public String getTipoPeca() {
        return tipoPeca;
    }

    public void setTipoPeca(String tipoPeca) {
        this.tipoPeca = tipoPeca;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValorVenda() {
        return valorVenda;
    }

    public Float getPercentualRepasse() {
        return percentualRepasse;
    }

    public void setPercentualRepasse(Float percentualRepasse) {
        this.percentualRepasse = percentualRepasse;
    }

    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Float getValorRepassado() {
        return valorRepassado;
    }

}