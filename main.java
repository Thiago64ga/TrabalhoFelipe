import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class main {
    public static void main(String[] args) {

        //Teste Usuario
        Usuario u1 = new Usuario("Thiago", "thiago123@gmail", "Thiago12", 123456789, 999999999);
        System.out.println(u1.toString());
        u1.atualizarPerfil("Felipe", 999663241);
        System.out.println();
        System.out.println(u1.toString());
        u1.autenticar("thiago123@gmail", "Thiago12");
        System.out.println();
        System.out.println(u1.toString());
        u1.recuperarSenha("thiago123@gmail", "1234561449", 999663241);
        System.out.println();
        System.out.println(u1.toString());
        System.out.println();


        //Teste Organizador
        List<Evento> eventos = new ArrayList<>();
        Organizador o1 = new Organizador(u1 , "1235456 ", eventos);
        System.out.println(o1.toString());
        Evento e1 =o1.criarEvento("Tech ", "Tecnologia", "Narnia", "Breve") ;
        System.out.println();
        System.out.println(o1.toString());
        o1.gerenciarEvento( "Tech","Andamento");
        System.out.println();
        System.out.println(o1.toString());
        o1.emitirRelatorio();
        System.out.println();

        //Teste Sala
        Sala s1 = new Sala("Laboratorio De Informatica", "Dubai", 25, true);
        s1.verificarDisponibilidade();
        System.out.println( );
        s1.reservar();
        System.out.println();

        // teste Evento 

        Date inicio = new Date(); 
        Date fim = new Date();
        Atividade a1 = e1.criarAtividade("POO", "Programação Orientada a Objeto", inicio, fim, 10, "Aula", s1, "Francisco");
        System.out.println(a1.getTitulo());
        System.out.println(e1.toString());
        e1.cancelarEvento();


        //teste Atividade 

        a1.adicionarPalestrante("Eduardo");
        System.out.println();
        System.out.println(a1.toString());
        a1.cancelarAtividade();


        //Teste Palestra 

        Palestra p1 = new Palestra(a1 , "Livros","Slide");
        p1.disponibilizarMaterial("Livros");
        System.out.println( );
        p1.iniciarTransmissao();


        // Teste Workshop

        Workshop w1 = new Workshop(p1, "Livros", 10, true);
        w1.definirPreRequisito("Estudante de Informatica");
        w1.gerenciarMaterias();
        System.out.println();
        w1.avaliarParticipante();

        // teste de Paticipante e Certificado

        Certificado c1 = new Certificado("T23fe", inicio, fim);
        List<Inscricao> inscritos = new ArrayList<>();
        List<Certificado> certificados = new ArrayList<>();
        Usuario u2 = new Usuario("Saulo", "Saulo123@gmail", "Saulo12", 123456789, 999999999);
        Participante pa1 =  new Participante(u2, "Professor", inscritos, certificados);
        pa1.inscreverEvento(e1);
        System.out.println(pa1.toString());
        System.out.println( );
        pa1.vizualizarCertificado(e1, c1);
        System.out.println(pa1.toString());
        c1.gerar("Saulo123@gmail.com");
        c1.enviarPorEmail("Saulo123@gmail.com");
        c1.validar();
        pa1.vizualizarCertificado(e1, c1);
        System.out.println(pa1.toString());
        pa1.cancelarInscricao(e1);
        System.out.println();
        System.out.println(pa1.toString());






        
        


        

            
        


        
    }    
}
