public abstract class Documento {
    // Atributos protegidos (# en el diagrama) para que los hijos los vean
    protected String referencia;
    protected String titulo;
    protected int anio;
    protected EstadoDocumento estado;

    // Constructor para inicializar los datos comunes
    public Documento(String titulo, int anio, EstadoDocumento estado) {
        this.titulo = titulo;
        this.anio = anio;
        this.estado = estado;
        // Generamos una referencia aleatoria para que no esté vacía
        this.referencia = "REF-" + (int)(Math.random() * 10000);
    }

    // Métodos públicos (+ en el diagrama)
    public String getReferencia() { return referencia; }
    public String getTitulo() { return titulo; }
    public int getAnio() { return anio; }
    public EstadoDocumento getEstado() { return estado; }

    // setReferencia es abstracto
    protected abstract void setReferencia(String referencia);

    public void setEstado(EstadoDocumento estado) {
        this.estado = estado;
    }
}