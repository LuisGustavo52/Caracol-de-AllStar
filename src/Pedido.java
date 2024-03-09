public class Pedido {
    private Usuario usuario;
    private static Integer totalPedidos = 0;
    private Integer idPedido;
    private Tenis tenis;
    private FormaPagamento formaPagamento;
    
    Pedido(Usuario usuario, Tenis tenis, FormaPagamento formaPagamento){
        Pedido.totalPedidos = Pedido.totalPedidos + 1;
        this.idPedido = Pedido.totalPedidos;
        this.tenis = tenis;
        this.formaPagamento = formaPagamento;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public static Integer getTotalPedidos() {
        return totalPedidos;
    }  

    public Tenis getTenis() {
        return tenis;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

}
