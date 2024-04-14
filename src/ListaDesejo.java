import java.util.ArrayList;
import java.util.List;

public class ListaDesejo {
    private List<Calcado> listaCalcado=  new ArrayList<>();
    private Usuario usuario;
    
    public ListaDesejo(Usuario usuario){
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    public void adicionarCalcado(Calcado Calcado){
        listaCalcado.add(Calcado);
    }
    
    @Override
    public String toString(){
    StringBuilder retorno = new StringBuilder();
        for(Calcado Calcado: listaCalcado){
            retorno.append(Calcado.getNome() + "\n");
        }        
        return retorno.toString();
    }
    
}
    