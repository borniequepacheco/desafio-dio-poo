import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso Excel");
        curso.setDescricao("descrição curso Excel");
        curso.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Java");
        curso2.setDescricao("descrição curso Java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev dev1 = new Dev();
        dev1.setNome("Bornieque");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bornieque:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bornieque:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bornieque:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-------------");

        Dev dev2 = new Dev();
        dev2.setNome("Fernanda");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fernanda:" + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fernanda:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fernanda:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());
    }
}