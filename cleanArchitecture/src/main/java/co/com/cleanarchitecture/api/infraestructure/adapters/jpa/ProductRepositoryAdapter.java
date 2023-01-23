package co.com.cleanarchitecture.api.infraestructure.adapters.jpa;

import co.com.cleanarchitecture.api.domain.model.gateways.ProductRepository;
import co.com.cleanarchitecture.api.domain.model.product.Product;

import co.com.cleanarchitecture.api.domain.model.product.dto.eProductDTO;

public class ProductRepositoryAdapter implements ProductRepository {

    private final ProductAdapterRepository productRepository;

    public ProductRepositoryAdapter(ProductAdapterRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product saveProduct(eProductDTO productDTO) {

        Product product = productDTO.toDomain(productDTO);
        return productRepository.save(product);
    }
}
