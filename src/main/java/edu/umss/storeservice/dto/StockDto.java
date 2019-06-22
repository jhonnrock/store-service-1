package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Stock;

import java.sql.Timestamp;

public class StockDto extends DtoBase<Stock> {

    private String Stock_Code;
    private String Stock_Name;
    private Timestamp DaDate_Registered;
    private Timestamp Expiration_Date ;
    private Timestamp Elaboration_Date;
    private Integer Stock_Quantity ;
    private Long Product_Id ;
    private Long Provider_Id;

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

    public Long getProduct_Id() {
        return Product_Id;
    }

    public void setProduct_Id(Long product_Id) {
        Product_Id = product_Id;
    }

    public Long getProvider_Id() {
        return Provider_Id;
    }

    public void setProvider_Id(Long provider_Id) {
        Provider_Id = provider_Id;
    }
}
