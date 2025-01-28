package tiendaOnlinePC.tienda_online_pc.servicio;

import tiendaOnlinePC.tienda_online_pc.modelo.Products;

import java.util.List;

public interface IProductsServicio {
    public List<Products> listarProducts();

    public Products buscarProducts(Integer product_id);

    public Products guardarProducts(Products products);

    public void eliminarProducts(Products products);
}
