import java.util.ArrayList;
import java.util.List;


public class Participante extends Usuario{

    private String profissao;
    private List<Inscricao> inscricoes ;
    private List<Certificado> certificados ;

   

     public Participante(Usuario usuario, String profissao,
            List<Inscricao> inscricoes, List<Certificado> certificados) {
        super(usuario.getnomeUsuario(), usuario.getEmail(),usuario.getSenha(),usuario.getCpf(),usuario.getTelefone());
        this.profissao = profissao;
        this.inscricoes = inscricoes;
        this.certificados = certificados;
    }

     public void inscreverEvento(Evento evento) {
        Inscricao novaInscricao = new Inscricao(this, evento);
        inscricoes.add(novaInscricao);
     }

     public void cancelarInscricao(Evento evento) {
        inscricoes.removeIf(inscricao -> inscricao.getEvento().equals(evento));
     }

     public void vizualizarCertificado(Evento evento , Certificado Certificado){

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

     @Override
     public String toString() {
        return "Participante [profissao=" + profissao + ", inscricoes=" + inscricoes.toString() + ", certificados=" + certificados
                + ", nomeUsuario()=" + getnomeUsuario() + ", Email()=" + getEmail() + ", Telefone()="
                + getTelefone() + "]";
     }

     


    
}
