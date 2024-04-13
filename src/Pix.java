public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(Integer parcelas, String chavePix) {
        super(parcelas);
        this.chavePix = chavePix;
        setFormaPagamento("Pix");
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}
