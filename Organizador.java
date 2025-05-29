import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Organizador extends Usuario {
    private String crpj;
    private List<Evento> eventosOrganizados;


   public Organizador(String nomeUsuario, String email, String senha, int cpf, int telefone, Date dataCadastro) {
        super(nomeUsuario, email, senha, cpf, telefone, dataCadastro);
    }


    public String getCrpj() {
        return crpj;
    }

    public void setCrpj(String crpj) {
        this.crpj = crpj;
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
}
