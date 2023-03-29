package Contenidos;

import java.util.List;

public class Farandolas extends Section {
	public Farandolas(String name) {
        super(name);
    }
    
    public void addArticle(Article article, String select) {
        if (select.equals("farandula")) {
            super.addArticle(article);
        }
    }
}