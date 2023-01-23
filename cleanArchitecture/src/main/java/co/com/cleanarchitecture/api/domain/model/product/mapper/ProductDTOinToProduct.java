package co.com.cleanarchitecture.api.domain.model.product.mapper;

import co.com.cleanarchitecture.api.domain.model.product.Product;
import co.com.cleanarchitecture.api.domain.model.product.ProductId;
import co.com.cleanarchitecture.api.domain.model.product.ProductName;
import co.com.cleanarchitecture.api.domain.model.product.ProductPrice;
import co.com.cleanarchitecture.api.domain.model.product.dto.eProductDTO;

public class ProductDTOinToProduct implements  iMapper<eProductDTO, Product> {


    @Override
    public Product map(eProductDTO in) {

        Product product = new Product(new ProductId(in.getId()), new ProductName(in.getName()), new ProductPrice(in.getPrice()));


        return product;
    }
}
