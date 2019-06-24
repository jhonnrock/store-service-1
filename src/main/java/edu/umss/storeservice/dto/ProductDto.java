package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Product;

public class ProductDto extends DtoBase<Product> {


    private String nameProduct;
    private Integer quantityProduct;
    private Integer unitCostProduct;

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(Integer quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public Integer getUnitCostProduct() {
        return unitCostProduct;
    }

    public void setUnitCostProduct(Integer unitCostProduct) {
        this.unitCostProduct = unitCostProduct;
    }
}
