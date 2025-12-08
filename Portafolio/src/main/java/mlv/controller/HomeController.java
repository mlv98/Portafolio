package mlv.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mlv.model.Proyecto;

import java.util.ArrayList;
import java.util.List;

@Controller // Esto le dice a Spring: "Oye, esta clase maneja peticiones web"
public class HomeController {
	
	@GetMapping("/rampage")
	public String rampage(Model model) {
	    model.addAttribute("titulo", "Rampage-Games");
	    model.addAttribute("descripcion", "Aplicación de consulta y análisis de videojuegos...");
	    return "rampage"; // Thymeleaf buscará src/main/resources/templates/rampage.html
	}
	
	@GetMapping("/gymmario")
	public String gymmario(Model model) {
	    model.addAttribute("titulo", "Gym-Fitness");
	    model.addAttribute("descripcion", "Sitio web corporativo responsive desarrollado en WordPress con enfoque en captación de clientes y gestión de contenido.");
	    return "gymmario"; 
	}

    @GetMapping("/") // Esto atiende cuando alguien entra a "tu-web.com/"
    public String inicio(Model model) {
    	
    	
        // 1. Creamos la lista de proyectos (Simulando una base de datos)
        List<Proyecto> misProyectos = new ArrayList<>();
        
        misProyectos.add(new Proyecto(
            "RAMPAGE-GAMES", 
            "Aplicación web en Java con Spring Boot ", 
            "/images/proyecto1.jpg", 
            "/rampage"
        ));
        
        misProyectos.add(new Proyecto(
            "GYM - FITNESS", 
            "Aplicación realizada con Wordpress.", 
            "/images/proyecto2.jpg", 
            "/gymmario"
        ));
        
        misProyectos.add(new Proyecto(
                "Chatbot de Soporte", 
                "AI Builder - Integración con Teams ", 
                "/images/proximamente1.jpg", 
                "/"
            ));
        misProyectos.add(new Proyecto(
                "Automatización de Facturas", 
                "Creación, validación y envío de facturas", 
                "/images/proximamente1.jpg", 
                "/"
            ));

        // 2. Pasamos los datos al HTML (La vista)
        // "proyectos" es el nombre que usaremos en el HTML para recuperar la lista
        model.addAttribute("proyectos", misProyectos); 
        model.addAttribute("nombre", "Mario Larrúa Vega");

        // 3. Retornamos el nombre del archivo HTML (sin el .html)
        return "index"; 
    }
}