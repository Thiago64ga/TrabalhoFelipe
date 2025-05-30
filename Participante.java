import java.util.ArrayList;
import java.util.List;


public class Participante extends Usuario{

    private String profissao;
    private List<Inscricao> inscricoes = new ArrayList<>();
    private List<Certificado> certificados = new ArrayList<>();

   public Participante(String nomeUsuario, String email, String senha, int cpf, int telefone,  String profissao) {
    super(nomeUsuario, email, senha, cpf, telefone);
    this.profissao = profissao;
}

     public void inscreverEvento(Evento evento) {
        Inscricao novaInscricao = new Inscricao(this, evento);
        inscricoes.add(novaInscricao);
     }

     public void cancelarInscricao(Evento evento) {
        inscricoes.removeIf(inscricao -> inscricao.getEvento().equals(evento));
     }

     public String getProfissao() {
         return profissao;
     }

     public List<Inscricao> getInscricoes() {
         return inscricoes;
     }

     public List<Certificado> getCertificados() {
         return certificados;
     }


    
}
