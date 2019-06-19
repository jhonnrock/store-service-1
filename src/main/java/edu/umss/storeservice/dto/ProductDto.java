package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Product;

import java.math.BigDecimal;

public class ProductDto extends DtoBase<Product> {


    private String Name_Product;
    private Integer Quantity_Product;
    private BigDecimal Unit_Cost_Product;


    public String getName_Product() {
        return Name_Product;
    }

    public void setName_Product(String name_Product) {
        Name_Product = name_Product;
    }

    public Integer getQuantity_Product() {
        return Quantity_Product;
    }

    public void setQuantity_Product(Integer quantity_Product) {
        Quantity_Product = quantity_Product;
    }

    public BigDecimal getUnit_Cost_Product() {
        return Unit_Cost_Product;
    }

    public void setUnit_Cost_Product(BigDecimal unit_Cost_Product) {
        Unit_Cost_Product = unit_Cost_Product;
    }

}
