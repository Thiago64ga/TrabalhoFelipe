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
public double getValor() {
    return valor;
}

public void setValor(double valor) {
    this.valor = valor;
}

public Date getDataPagamento() {
    return dataPagamento;
}

public void setDataPagamento(Date dataPagamento) {
    this.dataPagamento = dataPagamento;
}

public void setStatusPagamento(StatusPagamento statusPagamento) {
    this.statusPagamento = statusPagamento;
}

public String getMetodoPagamento() {
    return metodoPagamento;
}

public void setMetodoPagamento(String metodoPagamento) {
    this.metodoPagamento = metodoPagamento;
}

@Override
public String toString() {
    return "Pagamento [valor=" + valor + ", dataPagamento=" + dataPagamento + ", statusPagamento=" + statusPagamento
            + ", metodoPagamento=" + metodoPagamento + "]";
}




     
}
