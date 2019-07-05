package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.PromotionsDto;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Date;

@Entity
public class Promotions extends ModelBase<PromotionsDto> {
    private String namePromotion;
    private Integer discountPromotion;
    private Date startproDatePro;
    private Date expiredproDatePro;


    public String getNamePromotion() {
        return namePromotion;
    }

    public void setNamePromotion(String namePromotion) {
        this.namePromotion = namePromotion;
    }


    public Integer getDiscountPromotion() {
        return discountPromotion;
    }

    public void setDiscountPromotion(Integer discountPromotion) {
        this.discountPromotion = discountPromotion;
    }


    public Date getStartproDatePro() {
        return startproDatePro;
    }

    public void setStartproDatePro(Date startproDatePro) {
        this.startproDatePro = startproDatePro;
    }


    public Date getExpiredproDatePro() {
        return expiredproDatePro;
    }

    public void setExpiredproDatePro(Date expiredproDatePro) {
        this.expiredproDatePro = expiredproDatePro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Promotions that = (Promotions) o;

        if (namePromotion != null ? !namePromotion.equals(that.namePromotion) : that.namePromotion != null)
            return false;
        if (discountPromotion != null ? !discountPromotion.equals(that.discountPromotion) : that.discountPromotion != null)
            return false;
        if (startproDatePro != null ? !startproDatePro.equals(that.startproDatePro) : that.startproDatePro != null)
            return false;
        if (expiredproDatePro != null ? !expiredproDatePro.equals(that.expiredproDatePro) : that.expiredproDatePro != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = namePromotion != null ? namePromotion.hashCode() : 0;
        result = 31 * result + (discountPromotion != null ? discountPromotion.hashCode() : 0);
        result = 31 * result + (startproDatePro != null ? startproDatePro.hashCode() : 0);
        result = 31 * result + (expiredproDatePro != null ? expiredproDatePro.hashCode() : 0);
        return result;
    }
}
