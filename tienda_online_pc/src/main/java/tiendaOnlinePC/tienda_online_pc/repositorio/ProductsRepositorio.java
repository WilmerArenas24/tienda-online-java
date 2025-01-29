package tiendaOnlinePC.tienda_online_pc.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import tiendaOnlinePC.tienda_online_pc.modelo.Products;
import java.util.List;

public interface ProductsRepositorio extends JpaRepository<Products, Integer> {
    List<Products> findByCategoryId(Integer category_id);
}
