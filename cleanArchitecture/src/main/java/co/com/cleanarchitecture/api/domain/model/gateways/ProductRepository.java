package co.com.cleanarchitecture.api.domain.model.gateways;

import co.com.cleanarchitecture.api.domain.model.product.Product;
import co.com.cleanarchitecture.api.domain.model.product.dto.eProductDTO;

public interface ProductRepository {

    public Product saveProduct(eProductDTO productDTO);
}
