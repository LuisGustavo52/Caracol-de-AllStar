public class ProcessadorPagamento {

    public void processarPagamento(FormaPagamento formaPagamento) {
        if (formaPagamento instanceof Cartao) {
            processarPagamentoCartao((Cartao) formaPagamento);
        } else if (formaPagamento instanceof Boleto) {
            processarPagamentoBoleto((Boleto) formaPagamento);
        } else if (formaPagamento instanceof Pix) {
            processarPagamentoPix((Pix) formaPagamento);
        } else {
            System.out.println("Tente novamente.");
        }
    }

    private void processarPagamentoCartao(Cartao cartao) {
        System.out.println("Pagamento por Cartão.");
        System.out.println("Tipo de Cartão " + cartao.getTipoCartao());
        System.out.println("Número do Cartão " + cartao.getNumeroCartao());
        System.out.println("Numero de Parcelas " + cartao.getParcelas());
    }

    private void processarPagamentoBoleto(Boleto boleto) {
        System.out.println("Pagamento com Boleto...");
        System.out.println("Código de Barras: " + boleto.getCodigoBarras());
        System.out.println("Parcelas: " + boleto.getParcelas());
    }
    private void processarPagamentoPix(Pix pix) {
        System.out.println("Pagamento com Pix...");
        System.out.println("Chave Pix " + pix.getChavePix());
        System.out.println("Parcelas " + pix.getParcelas());
    }
}
