import java.sql.Date;
import java.util.ArrayList;

public class Venda {
    private Date dataVenda;
    private Date dataEntrega;
    private String observacoes;
    private Pessoa cliente;
    private ArrayList<Peca> pecas;

    public Venda(Pessoa cliente, ArrayList<Peca> pecas, Date dataVenda) {
        this.dataVenda = dataVenda;
        this.pecas = pecas;
        this.cliente = cliente;
    }

    
}
