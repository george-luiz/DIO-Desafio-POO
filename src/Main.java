import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java","Descrição Curso Java", 8);

        Curso curso2 = new Curso("Curso JavaScript", "Descrição Curso Js", 1);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição Mentoria Js", LocalDate.now());
        mentoria.calcularXp();

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.exibirBootcamps();


//        Dev devGeorge = new Dev("George");
//        devGeorge.inscreverParaOBootcamp(bootcamp);
//        devGeorge.exibirConteudosInscritos();
//        devGeorge.progredir();
//        devGeorge.progredir();
////        devGeorge.progredir();
//        devGeorge.exibirConteudosConcluidos();
//        devGeorge.exibirTotalXP();
//        devGeorge.progredir();
//        devGeorge.exibirConteudosConcluidos();
//        devGeorge.exibirTotalXP();

//        Dev devTeste = new Dev("Teste");
//        devTeste.inscreverParaOBootcamp(bootcamp);
//        devTeste.exibirConteudosInscritos();
//        devTeste.progredir();
//        devTeste.progredir();
//        devTeste.exibirConteudosConcluidos();
//        devTeste.exibirTotalXP();

    }
}