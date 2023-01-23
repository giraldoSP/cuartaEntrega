package co.com.cleanarchitecture.api.domain.model.product.dto;

import co.com.cleanarchitecture.api.domain.model.product.Product;
import co.com.cleanarchitecture.api.domain.model.product.mapper.ProductDTOinToProduct;
import co.com.cleanarchitecture.api.domain.model.product.mapper.ProductInToProductDTO;

public class eProductDTO {

    private Integer id;
    private String name;
    private Integer price;

    private ProductInToProductDTO mapperProductInToDTO;

    private ProductDTOinToProduct mapperProductDTOToProduct;

    public eProductDTO(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

   public eProductDTO fromDomain(Product product){


        eProductDTO productDTO = mapperProductInToDTO.map(product);

       return productDTO;
    }

    public Product toDomain(eProductDTO productDTO){

        Product product =  mapperProductDTOToProduct.map(productDTO);

        return product;
    }
}
