import java.time.LocalDate;

public class Mentoria extends Conteudo {


    private LocalDate data;


    public Mentoria() {

        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                "descrcao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    public LocalDate getData() {
        return data;
    }
}
