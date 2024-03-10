public class ListaDesejo {
    private String tenisFavorito;
    private String idTenis;

    public ListaDesejo(){
        
    }

    public ListaDesejo(String tenisFavorito, String idTenis){
        this.idTenis = idTenis;
        this.tenisFavorito = tenisFavorito;
    }

    public String getTenisFavorito() {
        return tenisFavorito;
    }

    public void setTenisFavorito(String tenisFavorito) {
        this.tenisFavorito = tenisFavorito;
    }

    public String getIdTenis() {
        return idTenis;
    }

    public void setIdTenis(String idTenis) {
        this.idTenis = idTenis;
    }

    
}
    