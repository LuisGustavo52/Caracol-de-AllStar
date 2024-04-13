public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(Integer parcelas, String codigoBarras) {
        super(parcelas);
        this.codigoBarras = codigoBarras;
        setFormaPagamento("Boleto");
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
}
