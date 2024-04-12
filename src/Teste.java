public class Teste {
    public static void main(String[] args) {
        Tenis t1 = new Tenis();
        Usuario user1 = new Usuario();            
        
        
        Avaliacao av1 = new Avaliacao(user1, t1, 5.0);
        Avaliacao av3 = new Avaliacao(user1, t1, 3.0);
        Avaliacao av2 = new Avaliacao(user1, t1, 2.0);
        
        t1.calcularMediaAvaliacao();
        System.out.println(""+t1.mediaAvaliacao);
    }
}
