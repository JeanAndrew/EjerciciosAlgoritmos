package Contenidos;


public class Contenido  extends webpaginaDecorator {
    private Section contenidoSection;

    public Contenido(webpagina pagina) {
        super(pagina);
        contenidoSection = new Section("Contenido");
        contenidoSection.addArticle(new Article("Título del artículo", "Autor del artículo", "Contenido del artículo"));
    }

    // Otros métodos de la clase

	    }


