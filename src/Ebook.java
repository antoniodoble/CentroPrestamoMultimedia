public class Ebook extends Libro implements Consultable {
    private EbookFormato formato;

    public Ebook(String titulo, int anio, EstadoDocumento estado) {
        super(titulo, anio, estado);
    }

    public void constructEbook(EbookFormato formato) {
        this.formato = formato;
    }

    @Override
    public String getAbstract(int i, int j) {
        // Implementación lógica para que sea funcional
        if (resumen != null && i >= 0 && j <= resumen.length()) {
            return resumen.substring(i, j);
        }
        return "Índices fuera de rango o resumen no disponible.";
    }

    @Override
    protected void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}