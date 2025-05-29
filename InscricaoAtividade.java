public class InscricaoAtividade {
    private Inscricao inscricao;
    private Atividade atividade;
    private boolean presenca;
    private int avaliacao;
    private String comentario;

    public InscricaoAtividade(Inscricao inscricao, Atividade atividade, boolean presenca,
            int avaliacao, String comentario) {
        this.inscricao = inscricao;
        this.atividade = atividade;
        this.presenca = presenca;
        this.avaliacao = avaliacao;
        this.comentario = comentario;
    }
     public void registrarPresenca() {
        this.presenca = true;
     }
   public void avaliarAtividade(int avaliacao, String comentario) {
        this.avaliacao = avaliacao;
        this.comentario = comentario;
   }
}
