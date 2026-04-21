public class RevistaCientifica extends Documento {
    private String ISSN;
    private int volumen;
    private int numEdicion;

    public RevistaCientifica(String titulo, int anio, EstadoDocumento estado) {
        super(titulo, anio, estado);
    }

    public void constructRevistaCientifica(String ISSN, int volumen, int numEdicion) {
        this.ISSN = ISSN;
        this.volumen = volumen;
        this.numEdicion = numEdicion;
    }

    @Override
    protected void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}