public abstract class Libro extends Documento {
    protected int numPaginas;
    protected String autor;
    protected String idioma;
    protected String editorial;
    protected String resumen;

    public Libro(String titulo, int anio, EstadoDocumento estado) {
        super(titulo, anio, estado);
    }

    // Método de construcción según el diagrama
    public void constructLibro(int numPaginas, String autor, String idioma, String editorial, String resumen) {
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.idioma = idioma;
        this.editorial = editorial;
        this.resumen = resumen;
    }
}