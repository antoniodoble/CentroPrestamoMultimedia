import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE PRÉSTAMOS MULTIMEDIA ===\n");


        Ebook miEbook = new Ebook("Manual de Java Avanzado", 2024, EstadoDocumento.DISPONIBLE);
        miEbook.constructLibro(450, "James Gosling", "Inglés", "Oracle Press",
                "Este es un resumen detallado sobre la programación orientada a objetos en Java.");
        miEbook.constructEbook(EbookFormato.PDF);

        System.out.println("LIBRO CREADO:");
        System.out.println("Referencia: " + miEbook.getReferencia());
        System.out.println("Título: " + miEbook.getTitulo());
        // Probamos la interfaz Consultable (getAbstract)
        System.out.println("Fragmento del resumen (Interfaz): " + miEbook.getAbstract(0, 20) + "...");
        System.out.println("------------------------------------------");


        Video miVideo = new Video("Inception", 2010, EstadoDocumento.NO_DISPONIBLE);
        miVideo.constructVideo("Christopher Nolan", "Warner Bros",
                Arrays.asList("Leonardo DiCaprio", "Cillian Murphy", "Tom Hardy"), 148);

        System.out.println("VÍDEO CREADO:");
        System.out.println("Referencia: " + miVideo.getReferencia());
        System.out.println("Título: " + miVideo.getTitulo());
        System.out.println("Estado inicial: " + miVideo.getEstado());


        System.out.println("\nCambiando estado del vídeo...");
        miVideo.setEstado(EstadoDocumento.DISPONIBLE);
        System.out.println("Nuevo estado: " + miVideo.getEstado());


        RevistaCientifica miRevista = new RevistaCientifica("Nature Computing", 2023, EstadoDocumento.DISPONIBLE);
        miRevista.constructRevistaCientifica("1234-5678", 45, 12);

        System.out.println("------------------------------------------");
        System.out.println("REVISTA CREADA:");
        System.out.println("Referencia: " + miRevista.getReferencia());
        System.out.println("ISSN: 1234-5678 (Vol. 45)");

        System.out.println("\n=== PRUEBA FINALIZADA CON ÉXITO ===");
    }
}
