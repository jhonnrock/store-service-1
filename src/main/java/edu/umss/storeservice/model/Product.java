package edu.umss.storeservice.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Product extends ModelBase {
    private String nameProduct;
    private Integer quantityProduct;
    private Integer unitCostProduct;



    @Basic
    @Column(name = "Name_Product")
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Basic
    @Column(name = "Quantity_Product")
    public Integer getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(Integer quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    @Basic
    @Column(name = "Unit_Cost_Product")
    public Integer getUnitCostProduct() {
        return unitCostProduct;
    }

    public void setUnitCostProduct(Integer unitCostProduct) {
        this.unitCostProduct = unitCostProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameProduct, product.nameProduct) &&
                Objects.equals(quantityProduct, product.quantityProduct) &&
                Objects.equals(unitCostProduct, product.unitCostProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, quantityProduct, unitCostProduct);
    }
}
