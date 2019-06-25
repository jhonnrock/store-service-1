package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.StockDto;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Stock extends ModelBase<StockDto>{
    private String stockCode;
    private String stockName;
    private Timestamp dateRegistered;
    private Timestamp expirationDate;
    private Timestamp elaborationDate;
    private int stockQuantity;
    @ManyToOne(optional = false )
    private Product product ;
    @ManyToOne (optional = false )
    private Provider provider;

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

    @Basic
    @Column(name = "Stock_Code")
    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    @Basic
    @Column(name = "Stock_Name")
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Basic
    @Column(name = "Date_Registered")
    public Timestamp getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Timestamp dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    @Basic
    @Column(name = "Expiration_Date")
    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Timestamp expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Basic
    @Column(name = "Elaboration_Date")
    public Timestamp getElaborationDate() {
        return elaborationDate;
    }

    public void setElaborationDate(Timestamp elaborationDate) {
        this.elaborationDate = elaborationDate;
    }

    @Basic
    @Column(name = "Stock_Quantity")
    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return stockQuantity == stock.stockQuantity &&
                Objects.equals(stockCode, stock.stockCode) &&
                Objects.equals(stockName, stock.stockName) &&
                Objects.equals(dateRegistered, stock.dateRegistered) &&
                Objects.equals(expirationDate, stock.expirationDate) &&
                Objects.equals(elaborationDate, stock.elaborationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockCode, stockName, dateRegistered, expirationDate, elaborationDate, stockQuantity);
    }
}
