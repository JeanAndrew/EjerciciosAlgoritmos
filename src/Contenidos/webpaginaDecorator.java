package Contenidos;

public abstract class webpaginaDecorator implements webpagina {
	    protected webpagina pagina;
	    
	    public webpaginaDecorator(webpagina pagina) {
	        this.pagina = pagina;
	    }
	    
	   
	    @Override
	    public String display() {
	        return pagina.display();
	    }
	}



