package mlv.model;

public class Proyecto {
	
	private String titulo;
    private String descripcion;
    private String imagenUrl;
    private String demoUrl;
    
 // Constructor vacío
    public Proyecto() {
    }

    // Constructor con todos los datos
    public Proyecto(String titulo, String descripcion, String imagenUrl, String demoUrl) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenUrl = imagenUrl;
        this.demoUrl = demoUrl;
    }

    // Getters y Setters (Necesarios para que Spring lea los datos)
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getImagenUrl() { return imagenUrl; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }

    public String getDemoUrl() { return demoUrl; }
    public void setDemoUrl(String demoUrl) { this.demoUrl = demoUrl; }
}


