package tiendaOnlinePC.tienda_online_pc.servicio;

import tiendaOnlinePC.tienda_online_pc.modelo.Categories;

import java.util.List;

public interface ICategoriesServicio {
    public List<Categories> listarCategories();
    public Categories buscarCategoriesId(Integer categories_id);
    public Categories guardarCategories(Categories categories);
    public void eliminarCategories(Categories categories);
}
