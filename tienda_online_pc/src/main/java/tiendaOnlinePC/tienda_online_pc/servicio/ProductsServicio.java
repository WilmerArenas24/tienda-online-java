package tiendaOnlinePC.tienda_online_pc.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiendaOnlinePC.tienda_online_pc.modelo.Products;
import tiendaOnlinePC.tienda_online_pc.repositorio.ProductsRepositorio;

import java.util.List;

@Service
public class ProductsServicio implements IProductsServicio {
    @Autowired
    private ProductsRepositorio productsRepositorio;

    @Override
    public List<Products> listarProducts() {
        return productsRepositorio.findAll();
    }

    @Override
    public Products buscarProducts(Integer product_id) {
        Products products = productsRepositorio.findById(product_id).orElse(null);
        return products ;
    }

    @Override
    public Products guardarProducts(Products products) {
        return productsRepositorio.save(products);
    }

    @Override
    public void eliminarProducts(Products products) {

        productsRepositorio.delete(products);

    }
}
