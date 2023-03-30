package Contenidos;

public class Imagenes extends webpaginaDecorator {
    public Imagenes(webpagina pagina) {
        super(pagina);
    }
    
    @Override
    public String display() {
        String imagenes = "<div class=\"imagen-media\">\n" +
                             "<img src=\"https://st1.uvnimg.com/ae/c0/530d733143b98be4750ca99889ef/fde944833f1f4725af258b63d9c81683\">\n" +
                             "</div>\n";
        return imagenes + pagina.display();
    }
}