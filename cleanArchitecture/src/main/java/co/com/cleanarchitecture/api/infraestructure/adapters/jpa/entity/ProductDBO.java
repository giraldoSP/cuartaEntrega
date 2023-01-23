package co.com.cleanarchitecture.api.infraestructure.adapters.jpa.entity;

import co.com.cleanarchitecture.api.domain.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;


    public Product toDomain(ProductDBO productDBO){
        return new Product();
    }
}
