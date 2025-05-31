public class Workshop extends Atividade {
    private String materiaisNecessarios;
    private int duracaoHoras;
    private boolean possuiCertificado;



    public Workshop(Atividade atividade, String materiaisNecessarios,int duracaoHoras,boolean possuiCertificado) {
        super(atividade); 
        this.materiaisNecessarios = materiaisNecessarios;
        this.duracaoHoras = duracaoHoras;
        this.possuiCertificado = possuiCertificado;
    }



    public void definirPreRequisito(String requisitos) { }
    public void gerenciarMaterias (){
    }

    public void avaliarParticipante() {
       
        System.out.println("O senhor tem o certificado");
    }


     
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