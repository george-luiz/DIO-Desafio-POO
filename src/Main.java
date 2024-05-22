import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Js");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGeorge = new Dev();
        devGeorge.setNome("George");
        devGeorge.inscreverParaOBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos George: " + devGeorge.getConteudosInscritos());
        devGeorge.progredir();
        devGeorge.progredir();
        System.out.println("Conteúdos concuidos George: " + devGeorge.getConteudosConcluidos());
        System.out.println("Calcular XP :" + devGeorge.calcularTotalXP());

        Dev devTeste = new Dev();
        devTeste.setNome("Teste");
        devTeste.inscreverParaOBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Teste: " + devTeste.getConteudosInscritos());
        devTeste.progredir();
        System.out.println("Conteúdos concuidos George: " + devTeste.getConteudosConcluidos());
        System.out.println("Calcular XP :" + devGeorge.calcularTotalXP());

    }
}