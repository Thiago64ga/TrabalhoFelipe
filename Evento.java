

public class Evento {
    private String nome;
    private String descricao;
    private String local;
    private String statusEvento;
    private Organizador organizador;

    public Evento(String nome, String descricao, String local, String status, Organizador organizador) {
        this.nome = nome;
        this.descricao = descricao;
        this.local = local;
        this.statusEvento = status;
        this.organizador = organizador;
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
    
}
