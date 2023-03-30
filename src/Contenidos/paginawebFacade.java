package Contenidos;
import java.util.ArrayList;
import java.util.List;
public class paginawebFacade {
	 
	private webpagina pagina;

	    public paginawebFacade() {
	    	  List<Section> sections = new ArrayList<>();
	          sections.add(new Section("Contenido"));
	          sections.add(new Deportes("Deportes"));
	          sections.add(new Farandolas("Farándula"));
	          sections.add(new Investigacion("Investigación"));
	         
	          this.pagina = new BasicWebpagina("Mi página web", sections);
                  
	          this.pagina = new Imagenes(pagina);
	          this.pagina = new AdsWebPaginaDecorator(pagina);
	          this.pagina = new SocialMediaWebPaginaDecorato(pagina);
	      }
	        

	    public String display() {
	        return pagina.display();
	    }
	}


