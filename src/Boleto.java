import java.time.LocalDate;

public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(Integer parcelas, String codigoBarras) {
        super(parcelas);
        setCodigoBarras(codigoBarras);
        setFormaPagamento("Boleto");
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
       
        if (codigoBarras == null || codigoBarras.isEmpty()) {
            throw new IllegalArgumentException(" Código de barras inválido ");
        }
        this.codigoBarras = codigoBarras;
    }
    
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com Boleto\n");
        System.out.println("Código de Barras " + getCodigoBarras());
        System.out.println("\nParcelas " + getParcelas());
    }
}
