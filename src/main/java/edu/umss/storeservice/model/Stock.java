/**
 * @author: Johnny .
 */

package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.StockDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
@Entity
public class Stock extends ModelBase<StockDto> {

    private String Stock_Code;
    private String Stock_Name;
    private Timestamp DaDate_Registered;
    private Timestamp Expiration_Date ;
    private Timestamp Elaboration_Date;
    private Integer Stock_Quantity ;
    @ManyToOne(optional = false )
    private Product product ;
    @ManyToOne (optional = false )
    private Provider provider;

    public Timestamp getDaDate_Registered() {
        return DaDate_Registered;
    }

    public void setDaDate_Registered(Timestamp daDate_Registered) {
        DaDate_Registered = daDate_Registered;
    }

    public Timestamp getExpiration_Date() {
        return Expiration_Date;
    }

    public void setExpiration_Date(Timestamp expiration_Date) {
        Expiration_Date = expiration_Date;
    }

    public Timestamp getElaboration_Date() {
        return Elaboration_Date;
    }

    public void setElaboration_Date(Timestamp elaboration_Date) {
        Elaboration_Date = elaboration_Date;
    }

    public String getStock_Code() {
        return Stock_Code;
    }

    public void setStock_Code(String stock_Code) {
        Stock_Code = stock_Code;
    }

    public String getStock_Name() {
        return Stock_Name;
    }

    public void setStock_Name(String stock_Name) {
        Stock_Name = stock_Name;
    }

    public Integer getStock_Quantity() {
        return Stock_Quantity;
    }

    public void setStock_Quantity(Integer stock_Quantity) {
        Stock_Quantity = stock_Quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}