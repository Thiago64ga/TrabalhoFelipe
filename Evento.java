import java.util.Date;
import java.util.List;

public class Evento {
    private int id;
    private String nome;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private String local;
    private String statusEvento;

    private List<Atividade> atividades;

    public void criarAtividade() { }
    public void publicarEvento() { }
    public void cancelarEvento() { }
}
