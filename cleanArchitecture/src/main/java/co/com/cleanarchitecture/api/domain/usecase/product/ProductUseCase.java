package co.com.cleanarchitecture.api.domain.usecase.product;

import co.com.cleanarchitecture.api.domain.model.gateways.ProductRepository;
import co.com.cleanarchitecture.api.domain.model.product.Product;
import co.com.cleanarchitecture.api.domain.model.product.dto.eProductDTO;


public class ProductUseCase {
    private final ProductRepository productRepository;

    public ProductUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(eProductDTO productDTO){
        return productRepository.saveProduct(productDTO);
    }
}
