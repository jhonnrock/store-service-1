/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Promotions;

import java.sql.Date;

public class PromotionsDto extends DtoBase<Promotions> {


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
}
