public class FormaPagamento {
    private Integer parcelas;
    private String formaPagamento;

    public FormaPagamento() {
    }
    
    public FormaPagamento(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void processarPagamento(FormaPagamento formaPagamento) {
        if (formaPagamento instanceof Cartao) {
            ((Cartao) formaPagamento).processarPagamento();
        } else if (formaPagamento instanceof Boleto) {
            ((Boleto) formaPagamento).processarPagamento();
        } else if (formaPagamento instanceof Pix) {
            ((Pix) formaPagamento).processarPagamento();
        }
    }
    
    public void processarPagamento(){
        System.out.println("Pagamento confirmado!");
    }
    
}
