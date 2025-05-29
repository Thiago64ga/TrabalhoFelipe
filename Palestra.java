public class Palestra extends Atividade {
    private String materialApoio;
    private String slideUtil;

    public void disponibilizarMaterial() { }
    public void iniciarTransmissao() { }
}

public class Workshop extends Atividade {
    private String materiaisNecessarios;
    private int duracaoHoras;
    private boolean possuiCertificado;

    public void definirPreRequisito() { }
    public void avaliarParticipante() { }
}
