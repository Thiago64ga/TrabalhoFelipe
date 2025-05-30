import java.util.ArrayList;
import java.util.Date;

public class Atividade {
    private String titulo;
    private String descricao;
    private Date dataHorarioInicio;
    private Date dataHorarioFim;
    private int capacidade;
    private String tipoDeAtividade;
    private Sala sala;
    private Sala salaAgendada;
    private ArrayList<String> palestrantes;
    private boolean cancelada;

    public Atividade(String titulo, String descricao, Date dataHorarioInicio, Date dataHorarioFim, int capacidade,
            String tipoDeAtividade, Sala sala, Sala salaAgendada, String palestrante, boolean cancelada) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHorarioInicio = dataHorarioInicio;
        this.dataHorarioFim = dataHorarioFim;
        this.capacidade = capacidade;
        this.tipoDeAtividade = tipoDeAtividade;
        this.sala = sala;
        this.salaAgendada = salaAgendada;
        this.palestrantes = new ArrayList<>();
        this.cancelada = false;
        }
    public Atividade() {
    }
    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public Date getDataHorarioInicio() {
        return dataHorarioInicio;
    }
    public Date getDataHorarioFim() {
        return dataHorarioFim;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public boolean isCancelada() {
        return cancelada;
    }

    public void agendarSala(Sala sala) {
        this.sala = sala;
    }

    public void adicionarPalestrante(String palestrante) {
        palestrantes.add(palestrante);
    }

    public void cancelarAtividade() {
        this.cancelada = false;
    }
    public String getTipoDeAtividade() {
        return tipoDeAtividade;
    }
    public Sala getSala() {
        return sala;
    }
    public Sala getSalaAgendada() {
        return salaAgendada;
    }
    public ArrayList<String> getPalestrantes() {
        return palestrantes;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setDataHorarioInicio(Date dataHorarioInicio) {
        this.dataHorarioInicio = dataHorarioInicio;
    }
    public void setDataHorarioFim(Date dataHorarioFim) {
        this.dataHorarioFim = dataHorarioFim;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public void setTipoDeAtividade(String tipoDeAtividade) {
        this.tipoDeAtividade = tipoDeAtividade;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    public void setSalaAgendada(Sala salaAgendada) {
        this.salaAgendada = salaAgendada;
    }
    public void setPalestrantes(ArrayList<String> palestrantes) {
        this.palestrantes = palestrantes;
    }
    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    

    
}    
