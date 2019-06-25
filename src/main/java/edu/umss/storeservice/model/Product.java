package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ProductDto;

import javax.persistence.*;
import java.util.Objects;

@Entity


@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "ListProduct",
                procedureName = "ListProduct",
                resultClasses = Product.class
        ),
        @NamedStoredProcedureQuery(
                name = "DeleteProductById",
                procedureName = "DeleteProductById",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "id", type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "result", type = Boolean.class)
                }
        ),
        @NamedStoredProcedureQuery(
                name = "GetProductById",
                procedureName = "GetProductById",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "id", type = Long.class)
                },
                resultClasses = Product.class
        ),
        @NamedStoredProcedureQuery(
                name="SaveProduct",
                procedureName="SaveProduct",
                parameters={
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="id",type=Long.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="nameProduct",type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="quantityProduct",type=Integer.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="unitCostProduct",type=Integer.class)


                        }
        )
})


public class Product extends ModelBase<ProductDto> {
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
