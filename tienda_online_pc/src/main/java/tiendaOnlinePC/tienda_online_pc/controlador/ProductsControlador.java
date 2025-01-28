package tiendaOnlinePC.tienda_online_pc.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tiendaOnlinePC.tienda_online_pc.modelo.Products;
import tiendaOnlinePC.tienda_online_pc.servicio.IProductsServicio;

import java.util.List;

@RestController
@RequestMapping("top-app")
@CrossOrigin("http://localhost:3000")
public class ProductsControlador {
    private static final Logger logger = LoggerFactory.getLogger(ProductsControlador.class);

    @Autowired
    private IProductsServicio productsServicio;

    @GetMapping("/products")
    public List<Products> obtenerProducts(){
        var products = productsServicio.listarProducts();

        products.forEach((products1 -> logger.info(products1.toString())));
        return products;
    }

}
