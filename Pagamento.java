import java.util.Date;

public class Pagamento {
    private double valor;
    private Date dataPagamento;
    private StatusPagamento statusPagamento;
    private String metodoPagamento;

    public Pagamento(double valor, Date dataPagamento, StatusPagamento statusPagamento, String metodoPagamento) {
    this.valor = valor;
    this.dataPagamento = dataPagamento;
    this.statusPagamento = statusPagamento;
    this.metodoPagamento = metodoPagamento;
}

public StatusPagamento getStatusPagamento() {
    return statusPagamento;
}

public void processar() {
    this.dataPagamento = new Date(); 
    this.statusPagamento = StatusPagamento.PROCESSADO;
}

public void confirmar() {
    this.statusPagamento = StatusPagamento.CONFIRMADO; // você precisa adicionar esse valor ao enum!
}

public void estornar() {
    this.statusPagamento = StatusPagamento.ESTORNADO;  // também precisa adicionar ao enum!
}
public enum StatusPagamento {
    PENDENTE,
    PROCESSADO,
    CONFIRMADO,
    ESTORNADO
}



     
}
