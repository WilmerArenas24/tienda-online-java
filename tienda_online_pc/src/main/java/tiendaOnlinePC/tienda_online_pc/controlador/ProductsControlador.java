package tiendaOnlinePC.tienda_online_pc.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/products/category/{category_id}")
    public List<Products> obtenerProductsPorCategoria(@PathVariable Integer category_id) {
        var products = productsServicio.listarPorCategoria(category_id);
        products.forEach(product -> logger.info(product.toString()));
        return products;
    }


}
