package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ClientDto;
import edu.umss.storeservice.dto.PromotionsDto;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Client extends ModelBase<ClientDto>{
    private String firstNameClient;
    private String lastNameClient;
    private String emailClient;
    private String numberTelephoneC;
    private Integer nitClient;
    private Integer ciClient;

    public String getFirstNameClient() {
        return firstNameClient;
    }

    public void setFirstNameClient(String firstNameClient) {
        this.firstNameClient = firstNameClient;
    }

    public String getLastNameClient() {
        return lastNameClient;
    }

    public void setLastNameClient(String lastNameClient) {
        this.lastNameClient = lastNameClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getNumberTelephoneC() {
        return numberTelephoneC;
    }

    public void setNumberTelephoneC(String numberTelephoneC) {
        this.numberTelephoneC = numberTelephoneC;
    }

    public Integer getNitClient() {
        return nitClient;
    }

    public void setNitClient(Integer nitClient) {
        this.nitClient = nitClient;
    }

    public Integer getCiClient() {
        return ciClient;
    }

    public void setCiClient(Integer ciClient) {
        this.ciClient = ciClient;
    }
}
