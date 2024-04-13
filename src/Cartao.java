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
    
    public void processarPagamento(){
        System.out.println("Pagamento por Cartão.");
        System.out.println("Tipo de Cartão " + getTipoCartao());
        System.out.println("Número do Cartão " + getNumeroCartao());
        System.out.println("Numero de Parcelas " + getParcelas());   
    }
}
