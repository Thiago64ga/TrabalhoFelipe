import java.util.ArrayList;
import java.util.List;

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
        o1.criarEvento("Tech ", "Tecnologia", "Narnia", "Breve") ;
        System.out.println();
        System.out.println(o1.toString());
        o1.gerenciarEvento( "Tech","Andamento");
        System.out.println();
        System.out.println(o1.toString());
        
    }    
}
