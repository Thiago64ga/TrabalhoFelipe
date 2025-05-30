
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

    public void gerenciarEvento(Evento evento, String novoStatus) {
        if (eventosOrganizados.contains(evento)) {
            evento.setStatusEvento(novoStatus);
        } else {
            
        }
    }

    public void emitirRelatorio() {
        System.out.println("==== Relatório de Eventos ====");
        for (Evento evento : eventosOrganizados) {
            System.out.println("Evento: " + evento.getNome() +
                               " | Status: " + evento.getStatusEvento() +
                               " | Local: " + evento.getLocal());
        }
    }

    public List<Evento> getEventosOrganizados() {
        return eventosOrganizados;
    }


    @Override
    public String toString() {
        return "Organizador [cnpj=" + cnpj + ", eventosOrganizados=" + eventosOrganizados + ","
                + super.toString() + "]";
    }



}
