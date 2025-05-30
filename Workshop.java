public class Workshop extends Atividade {
    private String materiaisNecessarios;
    private int duracaoHoras;
    private boolean possuiCertificado;

    public void definirPreRequisito(String requisitos) { }
    public void avaliarParticipante() { }
    public void avaliarParticipantes(){ }
    public String getMateriaisNecessarios() {
        return materiaisNecessarios;
    }
    public void setMateriaisNecessarios(String materiaisNecessarios) {
        this.materiaisNecessarios = materiaisNecessarios;
    }
    public int getDuracaoHoras() {
        return duracaoHoras;
    }
    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }
    public boolean isPossuiCertificado() {
        return possuiCertificado;
    }
    public void setPossuiCertificado(boolean possuiCertificado) {
        this.possuiCertificado = possuiCertificado;
    }

    
}