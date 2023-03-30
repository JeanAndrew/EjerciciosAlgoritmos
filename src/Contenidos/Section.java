package Contenidos;

import java.util.ArrayList;
import java.util.List;

public class Section {
	private String name;
    private List<Article> articles;
    
    public Section(String name) {
        this.name = name;
        this.articles = new ArrayList<>();
    }
    
    public void addArticle(Article article) {
        articles.add(article);
    }
    
    public List<Article> getArticles() {
        return articles;
    }
    
    public String getName() {
        return name;
    }
    
}



