public class Avaliacao {
    private Double nota;
    private Usuario usuario;
    private Calcado calcado;
    private String comentario;
    
    public Avaliacao(Usuario usuario, Calcado Calcado, Double nota) {
        this.usuario = usuario;
        this.calcado = Calcado;
        this.nota = nota;
        
        Calcado.registrarNota(this);
        Calcado.calcularMediaAvaliacao();
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Calcado getCalcado() {
        return calcado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString(){
        return "Usuario: "+this.usuario.getNome()+
                         " | Nota: "+this.nota+
                         " | Comentario: "+this.comentario;
    }
            
}
