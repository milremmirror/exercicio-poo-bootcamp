import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cursos curso1 = new Cursos();
        curso1.setDescricao("Curso java");
        curso1.setTitulo("Java");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso1.setDescricao("Curso javascrip");
        curso1.setTitulo("JavaScript");
        curso1.setCargaHoraria(6);

        Mentoria mentoria  = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java developer");
            bootcamp.setDescricao("Descrição bootcamp");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devCamila.getNome() + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("Conteudos concluidos" + devCamila.getConteudoConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());


        Dev devJoao= new Dev();
        devJoao.setNome("Joao");
        System.out.println("Conteúdos inscritos" + devJoao.getNome() + devJoao.getConteudoInscritos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

    }


}
