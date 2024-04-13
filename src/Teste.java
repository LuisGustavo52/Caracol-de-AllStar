/* 
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
public static void main(String[] args) {
    List<Tenis> listaTenis = new ArrayList<>();

    Tenis tenis1 = new Tenis("Nike Air Max",Tenis.marca, 42, "Ótimo");
    listaTenis.add(tenis1);

    Tenis tenis2 = new Tenis("Adidas Ultraboost", Tenis.Marca, 41, "Excelente");
    listaTenis.add(tenis2);

    for (Tenis tenis : listaTenis) {
        System.out.println("");
    }
}

=======
*/
public class Teste {
    public static void main(String[] args) {
        Tenis t1 = new Tenis();
        Usuario user1 = new Usuario();            
        
        
        Avaliacao av1 = new Avaliacao(user1, t1, 5.0);
        Avaliacao av3 = new Avaliacao(user1, t1, 3.0);
        Avaliacao av2 = new Avaliacao(user1, t1, 2.0);

        System.out.println(""+t1.getMediaAvaliacao());
    }
}

