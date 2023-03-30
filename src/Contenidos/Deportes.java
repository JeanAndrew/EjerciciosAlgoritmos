package Contenidos;

public class Deportes extends Section {
	public Deportes(String name) {
    super(name);
}

public void addNoticia(String title, String author, String content, String deporte) {
    DeporteArticle article = new DeporteArticle(title, author, content, deporte);
    addArticle(article);
}

private class DeporteArticle extends Article {
    private String deporte;

    public DeporteArticle(String title, String author, String content, String deporte) {
        super(title, author, content);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    @Override
    public String toString() {
        return super.toString() + " Deporte: " + deporte;
    }
}

public String displayNoticias() {
    StringBuilder sb = new StringBuilder();
    sb.append("Sección: ").append(getName()).append("\n");
    for (Article article : getArticles()) {
        if (article instanceof DeporteArticle) {
            sb.append(article.toString()).append("\n");
        }
    }
    return sb.toString();
}
}
