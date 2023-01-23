package co.com.cleanarchitecture.api.domain.model.product.mapper;

import co.com.cleanarchitecture.api.domain.model.product.Product;
import co.com.cleanarchitecture.api.domain.model.product.dto.eProductDTO;

public class ProductInToProductDTO implements  iMapper<Product, eProductDTO>{


    @Override
    public eProductDTO map(Product in) {

        eProductDTO productDTO = new eProductDTO(in.getId().getValue(), in.getName().toString(),in.getPrice().getValue());



        return productDTO;
    }
}
