package br.gov.camara.esocial;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@SpringBootApplication
@Controller
public class EsocialApplication extends SpringBootServletInitializer{
	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(EsocialApplication.class);
	   }
	public static void main(String[] args) {
		SpringApplication.run(EsocialApplication.class, args);
	}
	
	
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/")
    public String paginainicial() {
     return "paginaprincipal";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/paginagrupo1")
    public String paginagrupo1() {
		
		
     return "paginagrupo1";
    }
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/paginagrupo5")
    public String paginagrupo5() {
     return "paginagrupo5";
    }
	
	@RequestMapping(method = RequestMethod.GET, path = "/paginagrupo6")
    public String paginagrupo6() {
     return "paginagrupo6";
    }
	


}


