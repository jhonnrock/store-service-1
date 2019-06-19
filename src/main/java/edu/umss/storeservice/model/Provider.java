/**
 * @author: Johnny .
 */

package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ProviderDto;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.security.Timestamp;

@Entity
public class Provider extends ModelBase<ProviderDto> {


    private String First_Name;
    private String Last_Name;
    private String Corporate_Name;
    private Integer Nit_provee;
    private Integer Ci_provee;
    private Timestamp Birth_date;
    @OneToOne(optional = false)
    private User user;


    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getCorporate_Name() {
        return Corporate_Name;
    }

    public void setCorporate_Name(String corporate_Name) {
        Corporate_Name = corporate_Name;
    }

    public Integer getNit_provee() {
        return Nit_provee;
    }

    public void setNit_provee(Integer nit_provee) {
        Nit_provee = nit_provee;
    }

    public Integer getCi_provee() {
        return Ci_provee;
    }

    public void setCi_provee(Integer ci_provee) {
        Ci_provee = ci_provee;
    }

    public Timestamp getBirth_date() {
        return Birth_date;
    }

    public void setBirth_date(Timestamp birth_date) {
        Birth_date = birth_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



}