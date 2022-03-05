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
    }
}
