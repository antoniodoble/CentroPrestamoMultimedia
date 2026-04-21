import java.util.List;

public class Video extends Documento {
    private String director;
    private String productora;
    private List<String> actores;
    private int duracion;

    public Video(String titulo, int anio, EstadoDocumento estado) {
        super(titulo, anio, estado);
    }

    public void constructVideo(String director, String productora, List<String> actores, int duracion) {
        this.director = director;
        this.productora = productora;
        this.actores = actores;
        this.duracion = duracion;
    }

    @Override
    protected void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}