package tiendaOnlinePC.tienda_online_pc.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer product_id;
    String name;
    String description;
    Double price;
    Integer stock;
    Integer category_id;
    String imag_url;

    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", category_id=" + category_id +
                ", imag_url='" + imag_url + '\'' +
                '}';
    }
}
