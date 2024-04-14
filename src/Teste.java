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
        Categoria ct1 = new Categoria("Ain Jordan", "Tenis para esportes");
        Categoria ct2 = new Categoria("All Star", "Tenis casual");

        Marca m1 = new Marca("Tenis Esporte","Livre","Ain Jordan");
        Marca m2 = new Marca("Tenis de gay","homo","All Star");
        

        Tenis t1 = new Tenis("Nike Ain Jordan",m1, 42 ,200.00,"Branco",ct1);
        Tenis t2 = new Tenis("All Star",m1, 35,350.00,"Preto",ct1);

        Usuario user1 = new Usuario("cleber@gmail.com","cleber123", 1293044, "Cleber da Silva");   
        Usuario user2 = new Usuario("vini@gmail.com","vini123", 92039, "Vinicius Bessa");   
        Usuario user3 = new Usuario("breno@gmail.com","breno123", 102834, "Breno Massanaro");     
        
        Avaliacao av1 = new Avaliacao(user1, t1, 5.0);
        Avaliacao av3 = new Avaliacao(user3, t2, 3.0);
        Avaliacao av2 = new Avaliacao(user2, t1, 2.0);

        t1.mostrarAvaliacoes();

        Cartao cartao1 = new Cartao(1, "DEBITO","111111");
        Pix pix1 = new Pix(0, "1111111");
        Boleto boleto1 = new Boleto(12, "908048030930");

        Pedido pedido1 = new Pedido(user1, t1, pix1); 
        Pedido p1 = new Pedido(user2, t1, boleto1);
        Pedido p2 = new Pedido(user3, t1, cartao1);
        



    }
}

