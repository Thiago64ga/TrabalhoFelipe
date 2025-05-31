
import java.util.List;

public class Organizador extends Usuario {
    private String cnpj;
    private List<Evento> eventosOrganizados;

 


    public Organizador(Usuario usuario, String cnpj, List<Evento> eventosOrganizados) {
    super(usuario.getnomeUsuario(), usuario.getEmail(), usuario.getSenha(), usuario.getCpf(), usuario.getTelefone());
    this.cnpj = cnpj;
    this.eventosOrganizados = eventosOrganizados;
}


    public String getcnpj() {
        return cnpj;
    }

    public void setcnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Evento criarEvento(String nome, String descricao, String local, String status) {
        Evento novoEvento = new Evento(nome, descricao, local, status, this);
        eventosOrganizados.add(novoEvento);
        return novoEvento;
    }

    public void gerenciarEvento(String nomeEvento, String Status) {
       for (Evento evento : eventosOrganizados) {
        if (evento.getNome().trim().equalsIgnoreCase(nomeEvento.trim())) {
            evento.setStatusEvento(Status);
            return;
        }
    }
    }


    public void emitirRelatorio() {
        for (Evento evento : eventosOrganizados) {
            System.out.println( "Relatorio \n"+
                                "Evento: " + evento.getNome() +
                                " | Status: " + evento.getStatusEvento() +
                                " | Local: " + evento.getLocal());
        }
    }

    public List<Evento> getEventosOrganizados() {
        return eventosOrganizados;
    }  

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Organizador: ").append(getnomeUsuario()).append("\n");
    sb.append("CNPJ: ").append(cnpj).append("\n");
    sb.append("Eventos Organizados:\n");

    if (eventosOrganizados.isEmpty()) {
        sb.append("  Nenhum evento cadastrado.\n");
    } else {
        for (Evento evento : eventosOrganizados) {
            sb.append("  - ").append(evento.getNome()).append("\n");
            sb.append("  - ").append(evento.getStatusEvento());
        }
    }

    return sb.toString();
}




}
