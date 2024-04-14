public class Pedido {
    private Usuario usuario;
    private static Integer totalPedidos = 0;
    private Integer idPedido;
    private Calcado calcado;
    private FormaPagamento formaPagamento;
    
    Pedido(Usuario usuario, Calcado calcado, FormaPagamento formaPagamento){
        Pedido.totalPedidos = Pedido.totalPedidos + 1;
        this.idPedido = Pedido.totalPedidos;
        this.calcado = calcado;
        this.formaPagamento = formaPagamento;
        this.usuario = usuario;
        formaPagamento.processarPagamento(formaPagamento);
        System.out.println("Pedido realizado com sucesso!");
        emitirNota();
    }
    
    public void emitirNota(){
        System.out.println("========== NOTA FISCAL N°"+totalPedidos+"=========="+
                            "\nCliente: "+usuario.getNome()+
                            "\nCalcado: "+calcado.getNome()+
                            "\nPreco: "+calcado.getPreco()+
                            "\nForma de Pagamento: "+formaPagamento.getFormaPagamento());
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public static Integer getTotalPedidos() {
        return totalPedidos;
    }  

    public Calcado getCalcado() {
        return calcado;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public Integer getIdPedido() {
        return idPedido;
    }
    
    

}
