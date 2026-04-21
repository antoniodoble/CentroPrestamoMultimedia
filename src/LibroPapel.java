import java.util.List;

public class LibroPapel extends Libro {

    public LibroPapel(String titulo, int anio, EstadoDocumento estado) {
        super(titulo, anio, estado);
    }

    public void constructLibroPapel() {
        // El diagrama lo incluye, aunque no tiene parámetros específicos
        // HEREDA DE LIBRO
    }

    @Override
    protected void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
