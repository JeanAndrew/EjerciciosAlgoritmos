package Contenidos;

import java.util.List;

public class BasicWebpagina implements webpagina {
    private String title;
    private List<Section> sections;
    
    public BasicWebpagina(String title, List<Section> sections) {
        this.title = title;
        this.sections = sections;
    }
    
    public String display() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title>");
        builder.append(title);
        builder.append("</title></head><body>");
        
        for (Section section : sections) {
            builder.append("<h1>");
            builder.append(section.getName());
            builder.append("</h1>");
            builder.append("<ul>");
            
            for (Article article : section.getArticles()) {
                builder.append("<li>");
                builder.append("<h2>");
                builder.append(article.getTitle());
                builder.append("</h2>");
                builder.append("<p>");
                builder.append(article.getContent());
                builder.append("</p>");
                builder.append("<p>");
                builder.append("By: ");
                builder.append(article.getAuthor());
                builder.append("</p>");
                builder.append("</li>");
            }
            
            builder.append("</ul>");
        }
        
        builder.append("</body></html>");
        return builder.toString();
    }

}