
import java.util.ArrayList;
import java.util.List;

public class Tenis {
    private String nome;
    private Marca marca;
    private Integer numeracao;
    private  Double mediaAvaliacao;
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    private Double preco;
    private Categoria categoria;
    
    public Tenis(){

    }

    public Tenis(String nomeTenis, Marca marca, Integer numeracao, Double preco, String cor, Categoria categoria) {
        this.nome = nomeTenis;
        this.marca = marca;
        this.numeracao = numeracao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Double getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao(Double mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
    public void calcularMediaAvaliacao(){
        Double soma = 0.0;
        for(Avaliacao ava : avaliacoes){
            soma += ava.getNota();
        }
        
        this.mediaAvaliacao = soma / avaliacoes.size();
    }
    
    public void registrarNota(Avaliacao avaliacao){
        avaliacoes.add(avaliacao);
    }
    
    public void mostrarAvaliacoes(){
        for(Avaliacao ava : avaliacoes){
            System.out.println(ava);
        }
    }
}
