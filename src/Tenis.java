
import java.util.ArrayList;
import java.util.List;

public class Tenis {
    private String nomeTenis;
    private Marca marca;
    private Integer numeracao;
    public  Double mediaAvaliacao;
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    private Double preco;
    private String cor;
    

    public Tenis(){

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
