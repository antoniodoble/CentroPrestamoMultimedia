public class Audio extends Documento {
    private String autor;
    private int duracion;
    private int numPistas;

    public Audio(String titulo, int anio, EstadoDocumento estado) {
        super(titulo, anio, estado);
    }

    public void constructAudio(String autor, int duracion, int numPistas) {
        this.autor = autor;
        this.duracion = duracion;
        this.numPistas = numPistas;
    }

    @Override
    protected void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}