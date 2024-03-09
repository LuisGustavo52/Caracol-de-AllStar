public class Avaliacao {
    private Double nota;
    private Usuario usuario;
    private Tenis tenis;
    private String comentario;
    
    public Avaliacao(Usuario usuario, Tenis tenis, Double nota) {
        this.usuario = usuario;
        this.tenis = tenis;
        this.nota = nota;
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

    public Tenis getTenis() {
        return tenis;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    
}
