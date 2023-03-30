package Contenidos;

public class SocialMediaWebPaginaDecorato extends webpaginaDecorator {
    public SocialMediaWebPaginaDecorato(webpagina pagina) {
        super(pagina);
    }
    
    @Override
    public String display() {
        String socialMedia = "<div class=\"social-media\">\n" +
                             "<a href=\"#\">Facebook</a>\n" +
                             "<a href=\"#\">Twitter</a>\n" +
                             "<a href=\"#\">Instagram</a>\n" +
                             "</div>\n";
        return socialMedia + pagina.display();
    }
}