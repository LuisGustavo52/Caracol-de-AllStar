import java.util.ArrayList;
import java.util.List;

public class ListaDesejo {
    private List<Tenis> listaTenis = new ArrayList<>();
    private Usuario usuario;
    
    public ListaDesejo(Usuario usuario){
        this.usuario = usuario;
    }
    
    public void adicionarTenis(Tenis tenis){
        listaTenis.add(tenis);
    }
    
    @Override
    public String toString(){
    StringBuilder retorno = new StringBuilder();
        for(Tenis tenis: listaTenis){
            retorno.append(tenis.getNome() + "\n");
        }        
        return retorno.toString();
    }
    
}
    