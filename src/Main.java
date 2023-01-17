import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

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

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcio = new Dev();
        devMarcio.setNome("Márcio");
        devMarcio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devMarcio.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devMarcio.getConteudosConcluidos());



        devMarcio.progredir();
        devMarcio.progredir();


        System.out.println("--------------------");

        System.out.println("Conteudos inscritos" + devMarcio.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devMarcio.getConteudosConcluidos());
        System.out.println("XP : " + devMarcio.calcularTotalXp());




    }
}