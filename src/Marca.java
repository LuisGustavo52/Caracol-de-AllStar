public class Marca extends Tenis{
    private String descricao;
    private String estilo;
    private String nomeMarca;

    public Marca (){

    }

    public Marca (String descricao, String estilo, String nome){
        this.descricao = descricao;
        this.estilo = estilo;
        this.nomeMarca = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    public String getNomeMarca() {
        return nomeMarca;
    }
    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    

}
