package mlv.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mlv.model.Proyecto;

import java.util.ArrayList;
import java.util.List;

@Controller 
public class HomeController {
	
	@GetMapping("/rampage")
	public String rampage(Model model) {
	    model.addAttribute("titulo", "Rampage-Games");
	    model.addAttribute("descripcion", "Aplicación de consulta y análisis de videojuegos...");
	    return "rampage"; 
	}
	
	@GetMapping("/gymmario")
	public String gymmario(Model model) {
	    model.addAttribute("titulo", "Gym-Fitness");
	    model.addAttribute("descripcion", "Sitio web corporativo responsive desarrollado en WordPress con enfoque en captación de clientes y gestión de contenido.");
	    return "gymmario"; 
	}
	
	@GetMapping("/nano")
	public String nano(Model model) {
	    model.addAttribute("titulo", "Nano-TI");
	    model.addAttribute("descripcion", "Nano TI es un agente conversacional inteligente");
	    return "nano"; 
	}

    @GetMapping("/") 
    public String inicio(Model model) {
    	
    	
       
        List<Proyecto> misProyectos = new ArrayList<>();
        
        misProyectos.add(new Proyecto(
                "RAMPAGE-GAMES", 
                "Aplicación web en Java con Spring Boot ", 
                "/images/proyecto1.jpg", 
                "/rampage"
            ));
            
       
        
        misProyectos.add(new Proyecto(
                "Nano TI", 
                "Copilot Studio-Power Automate-Dataverse-Outlook365 ", 
                "/images/nano.png", 
                "/nano"
            ));
        
        
        misProyectos.add(new Proyecto(
            "GYM - FITNESS", 
            "Aplicación realizada con Wordpress.", 
            "/images/proyecto2.jpg", 
            "/gymmario"
        ));
        
      
        misProyectos.add(new Proyecto(
                "Automatización de Facturas", 
                "Creación, validación y envío de facturas", 
                "/images/proximamente1.jpg", 
                "/"
            ));

        
        model.addAttribute("proyectos", misProyectos); 
        model.addAttribute("nombre", "Mario Larrúa Vega");

        
        return "index"; 
    }
}