package tiendaOnlinePC.tienda_online_pc.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import tiendaOnlinePC.tienda_online_pc.modelo.Categories;

public interface CategoriesRepositorio extends JpaRepository<Categories, Integer> {
}
