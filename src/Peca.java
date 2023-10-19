
public class Peca {
    private String codigoPeca;
    private String tipoPeca;
    private String descricao;
    private Double valorVenda;
    private Double percentualRepasse;
    private String tamanho;
    private Double valorRepassado;

    public Peca(String codigoPeca,
            String tipoPeca,
            String descricao,
            Double valorVenda,
            Double percentualRepasse,
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

    public void setValorRepassado(Double valorRepassado) {
        this.valorRepassado = valorRepassado;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getValorPeca() {
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

    public Double getValorVenda() {
        return valorVenda;
    }

    public Double getPercentualRepasse() {
        return percentualRepasse;
    }

    public void setPercentualRepasse(Double percentualRepasse) {
        this.percentualRepasse = percentualRepasse;
    }

    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getValorRepassado() {
        return valorRepassado;
    }

}