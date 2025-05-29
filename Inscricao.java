import java.util.Date;

public class Inscricao {
    private Date dataInscricao;
    private String statusInscricao;
    private boolean presencaConfirmada;
    private Participante participante;
    private Evento evento;

    public Inscricao(Participante participante, Evento evento) {
        this.participante = participante;
        this.evento = evento;
    }

    public Inscricao(   ){

    }


    public void confirmarPagamento() { }
    public void emitirComprovante() { }
    public void registrarPresenca() { }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public String getStatusInscricao() {
        return statusInscricao;
    }

    public boolean isPresencaConfirmada() {
        return presencaConfirmada;
    }

    public Participante getParticipante() {
        return participante;
    }

    public Evento getEvento() {
        return evento;
    }

    
}
