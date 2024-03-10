public class Tenis {
    private String nomeTenis;
    private Marca marca;
    private Integer numeracao;
    private String avaliacao;

    public Tenis(){

    }
    public Tenis(String nome, Marca marca, Integer numero, String avaliacao){
        this.nomeTenis = nome;
        this.marca = marca;
        this.numeracao = numeracao;
        this.avaliacao = avaliacao;

    }
    public String getNome() {
        return nomeTenis;
    }
    public void setNome(String nome) {
        this.nomeTenis = nome;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Integer getNumeracao() {
        return numeracao;
    }
    public void setNumeracao(Integer numeracao) {
        this.numeracao = numeracao;
    }
    public String getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    
}
