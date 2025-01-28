package tiendaOnlinePC.tienda_online_pc.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tiendaOnlinePC.tienda_online_pc.modelo.Categories;
import tiendaOnlinePC.tienda_online_pc.servicio.ICategoriesServicio;

import java.util.List;

@RestController
@RequestMapping("top-app")
@CrossOrigin("http://localhost:3000")
public class CategoriesControlador {
    private static final Logger logger = LoggerFactory.getLogger(CategoriesControlador.class);

    @Autowired
    private ICategoriesServicio categoriesServicio;

    @GetMapping("/categories")
    public List<Categories> obtenerCategories(){
        var categories = categoriesServicio.listarCategories();

        categories.forEach((categories1 -> logger.info(categories1.toString())));
        return categories;

    }
}
