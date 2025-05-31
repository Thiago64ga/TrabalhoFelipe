import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Atividade {
    private String titulo;
    private String descricao;
    private Date dataHorarioInicio;
    private Date dataHorarioFim;
    private int capacidade;
    private String tipoDeAtividade;
    private Sala sala;
    private boolean cancelada = false;
    private List<String> palestrantes = new ArrayList<>();

    

    public Atividade(String titulo, String descricao, Date inicio, Date fim, int capacidade,
                 String tipo, Sala sala, ArrayList<String> convidados, ArrayList<String> materiais, boolean cancelada) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.dataHorarioInicio = inicio;
    this.dataHorarioFim = fim;
    this.capacidade = capacidade;
    this.tipoDeAtividade = tipo;
    this.sala = sala;
    this.cancelada = cancelada;
    
}



    public Atividade(String titulo, String descricao, Date dataHorarioInicio, Date dataHorarioFim, int capacidade,
                     String tipoDeAtividade, Sala sala, String palestrante, boolean cancelada) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHorarioInicio = dataHorarioInicio;
        this.dataHorarioFim = dataHorarioFim;
        this.capacidade = capacidade;
        this.tipoDeAtividade = tipoDeAtividade;
        this.sala = sala;
        this.palestrantes = new ArrayList<>();
        if (palestrante != null && !palestrante.isEmpty()) {
            this.palestrantes.add(palestrante);
        }
        this.cancelada = cancelada;
    }


    public void adicionarPalestrante(String palestrante) {
        if (palestrante != null && !palestrante.isEmpty()) {
            palestrantes.add(palestrante);
            System.out.println("Palestrante adicionado: " + palestrante);
        }
    }

    public void cancelarAtividade() {
        this.cancelada = true;
        System.out.println("Atividade '" + titulo + "' foi cancelada.");
    }


    // ==== GETTERS E SETTERS ====

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataHorarioInicio() {
        return dataHorarioInicio;
    }

    public void setDataHorarioInicio(Date dataHorarioInicio) {
        this.dataHorarioInicio = dataHorarioInicio;
    }

    public Date getDataHorarioFim() {
        return dataHorarioFim;
    }

    public void setDataHorarioFim(Date dataHorarioFim) {
        this.dataHorarioFim = dataHorarioFim;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipoDeAtividade() {
        return tipoDeAtividade;
    }

    public void setTipoDeAtividade(String tipoDeAtividade) {
        this.tipoDeAtividade = tipoDeAtividade;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

   

     public List<String> getPalestrantes() {
        return new ArrayList<>(palestrantes); 
    }

    public void setPalestrantes(ArrayList<String> palestrantes) {
        this.palestrantes = palestrantes;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    

    
    public Atividade(Atividade outra) {
    this.titulo = outra.titulo;
    this.descricao = outra.descricao;
    this.dataHorarioInicio = outra.dataHorarioInicio;
    this.dataHorarioFim = outra.dataHorarioFim;
    this.capacidade = outra.capacidade;
    this.tipoDeAtividade = outra.tipoDeAtividade;
    this.sala = outra.sala; 
    this.cancelada = outra.cancelada;
    this.palestrantes = new ArrayList<>(outra.palestrantes); 
}



    @Override
public String toString() {
    return "Atividade: " + titulo +
           "\nDescrição: " + descricao +
           "\nInício: " + dataHorarioInicio +
           "\nFim: " + dataHorarioFim +
           "\nCapacidade: " + capacidade +
           "\nTipo: " + tipoDeAtividade +
           "\nSala: " + (sala != null ? sala.getNome() : "Não definida") +
           "\nPalestrantes: " + (palestrantes != null ? 
               palestrantes.stream().collect(Collectors.joining(", ")) : 
               "Nenhum palestrante");
}

    
}
