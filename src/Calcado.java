
import java.util.ArrayList;
import java.util.List;

public interface Calcado {
   
    public void calcularMediaAvaliacao();
    
    public void registrarNota(Avaliacao avaliacao);   
    
    public void mostrarAvaliacoes();
    
    public Integer getNumeracao();
    public String getNome();
    public Double getPreco();
}


