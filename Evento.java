import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Evento {
    private String nome;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private String local;
    private String statusEvento;
    private Organizador organizador;
    private List<Atividade> atividades;

    public Evento(String nome, String descricao, String local, String status, Organizador organizador) {
        this.nome = nome;
        this.descricao = descricao;
        this.local = local;
        this.statusEvento = status;
        this.organizador = organizador;
        this.atividades = new ArrayList<>();
    }

   public Atividade criarAtividade(String titulo, String descricao, Date inicio, Date fim, int capacidade,
                                 String tipo, Sala sala, String palestrante) {
    Atividade nova = new Atividade(titulo, descricao, inicio, fim, capacidade, tipo, sala, palestrante, false);
    atividades.add(nova);
    return nova;
}

    public void cancelarEvento() {
            if (!statusEvento.equalsIgnoreCase("Cancelado")) {
        this.statusEvento = "Cancelado";

        System.out.println(this.statusEvento);

            }    
    }


    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLocal() {
        return local;
    }

    public String getStatusEvento() {
        return statusEvento;
    }

    public void setStatusEvento(String statusEvento) {
        this.statusEvento = statusEvento;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    @Override
    public String toString() {
        return "Evento [nome=" + nome + ", descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataFim="
                + dataFim + ", local=" + local + ", statusEvento=" + statusEvento + ", organizador=" + organizador
                + ", atividades=" + atividades + "]";
    }

    

    
}


