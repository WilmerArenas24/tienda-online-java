package tiendaOnlinePC.tienda_online_pc.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Categories {
    @Id
    @GeneratedValue
    Integer category_id;
    String name;

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "category_id=" + category_id +
                ", name='" + name + '\'' +
                '}';
    }
}
