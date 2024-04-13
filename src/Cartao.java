public class Cartao extends FormaPagamento {
    private String tipoCartao;
    private String numeroCartao;

    public Cartao(Integer parcelas, String tipoCartao, String numeroCartao) {
        super(parcelas);
        this.tipoCartao = tipoCartao;
        this.numeroCartao = numeroCartao;
        setFormaPagamento("Cartão"); 
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
