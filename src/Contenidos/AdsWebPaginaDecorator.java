package Contenidos;

public class AdsWebPaginaDecorator extends webpaginaDecorator {
    public AdsWebPaginaDecorator(webpagina pagina) {
        super(pagina);
    }
    @Override
    public String display() {
        String ad1 = "<div class=\"ad\">Nicol pierde el semestre</div>\n";
        String ad2 = "<div class=\"ad\">Anuncio 2</div>\n";
        return ad1 + pagina.display() + ad2;
    }
}