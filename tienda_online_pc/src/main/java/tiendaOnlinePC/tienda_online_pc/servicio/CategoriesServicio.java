package tiendaOnlinePC.tienda_online_pc.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiendaOnlinePC.tienda_online_pc.modelo.Categories;
import tiendaOnlinePC.tienda_online_pc.repositorio.CategoriesRepositorio;

import java.util.List;

@Service
public class CategoriesServicio implements ICategoriesServicio{

    @Autowired
    private CategoriesRepositorio categoriesRepositorio;
    @Override
    public List<Categories> listarCategories() {
        return categoriesRepositorio.findAll();
    }

    @Override
    public Categories buscarCategoriesId(Integer categories_id) {
        return categoriesRepositorio.findById(categories_id).orElse(null);
    }

    @Override
    public Categories guardarCategories(Categories categories) {
        return categoriesRepositorio.save(categories);
    }

    @Override
    public void eliminarCategories(Categories categories) {
        categoriesRepositorio.delete(categories);
    }
}
