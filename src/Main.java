import Bootcamp.Bootcamp;
import Bootcamp.Curso;
import Bootcamp.Dev;
import Bootcamp.Mentoria;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEdu = new Dev();
        devEdu.setNome("Edu");
        devEdu.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Edu:" + devEdu.getConteudosInscritos());
        devEdu.progredir();
        devEdu.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Edu:" + devEdu.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Edu:" + devEdu.getConteudosConcluidos());
        System.out.println("XP:" + devEdu.calcularTotalXp());

        System.out.println("-------");

        Dev devAlan = new Dev();
        devAlan.setNome("Alan");
        devAlan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alan:" + devAlan.getConteudosInscritos());
        devAlan.progredir();
        devAlan.progredir();
        devAlan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alan:" + devAlan.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Alan:" + devAlan.getConteudosConcluidos());
        System.out.println("XP:" + devAlan.calcularTotalXp());
    }
}