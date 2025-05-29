import java.util.Date;

public class Atividade {
    protected int id;
    protected String titulo;
    protected String descricao;
    protected Date dataHorarioInicio;
    protected Date dataHorarioFim;
    protected int capacidade;
    protected String tipoDeAtividade;

    protected Sala sala;

    public void agendarSala() { }
    public void adicionarPalestrante() { }
    public void cancelarAtividade() { }
}
