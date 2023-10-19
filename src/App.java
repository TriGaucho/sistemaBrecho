import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Dona Cotinha", "51982860021");

        Peca pca1 = new Peca("dC01", "blusa", "Blusa de croche", 15.30, 10.0, "M");
        
        p1.cadastrarPeca(pca1);
        System.out.println(p1.getListaPecas());
        
    }
}
