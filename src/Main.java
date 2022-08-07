import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição Bootcamp developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("camila");
        devCanila.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Camila:" + devCamila.getConteudosInscritos()");

        devCamila.progredir();
        System.out.println("-");

        System.out.println("conteudos concluidos Camila:" + devCamila.getConteudosConcluidos()");
        System.out.println("conteudos inscritos Camila:" + devCamila.getConteudosInscritos()");
        System.out.println("XP:" + devCamila.calcularTotalXp())

        System.out.println("...............");


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp (bootcamp);
        System.out.println("conteudos inscritos Joao:" + devJoao.getConteudosinscritos());

        devJoao.progredir();
        System.out.println("...............");
        System.out.println("_");
        System.out.println("conteudos inscritos Joao:" + devJoao.getConteudosinscritos());
        System.out.println("conteudos concluidos Joao:" + devJoao.getConteudosconcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp())

    }

}
