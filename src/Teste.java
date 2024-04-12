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