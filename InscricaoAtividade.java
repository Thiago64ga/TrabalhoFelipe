import java.util.Objects;

public class InscricaoAtividade {
    private Inscricao inscricao;
    private Atividade atividade;
    private boolean presenca;
    private int avaliacao;
    private String comentario;

     public InscricaoAtividade(Inscricao inscricao, Atividade atividade, 
                             boolean presenca, int avaliacao, String comentario) {
        this.inscricao = Objects.requireNonNull(inscricao);
        this.atividade = Objects.requireNonNull(atividade);  
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
   public Inscricao getInscricao() {
    return inscricao;
   }
   public void setInscricao(Inscricao inscricao) {
    this.inscricao = inscricao;
   }
   public Atividade getAtividade() {
    return atividade;
   }
   public void setAtividade(Atividade atividade) {
    this.atividade = atividade;
   }
   public boolean isPresenca() {
    return presenca;
   }
   public void setPresenca(boolean presenca) {
    this.presenca = presenca;
   }
   public int getAvaliacao() {
    return avaliacao;
   }
   public void setAvaliacao(int avaliacao) {
    this.avaliacao = avaliacao;
   }
   public String getComentario() {
    return comentario;
   }
   public void setComentario(String comentario) {
    this.comentario = comentario;
   }
   @Override
    public String toString() {
        return String.format(
            "InscricaoAtividade[\n  Inscricao: %s\n  Atividade: %s\n  Palestrantes: %s\n  Presença: %s\n  Avaliação: %d\n  Comentário: %s\n]",
            inscricao,
            atividade.getTitulo(),
            String.join(", ", atividade.getPalestrantes()),  // Acessa os palestrantes da atividade
            presenca ? "Confirmada" : "Não confirmada",
            avaliacao,
            comentario
        );
    }
   
}
