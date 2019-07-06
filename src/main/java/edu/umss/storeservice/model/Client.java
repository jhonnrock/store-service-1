package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.PromotionsDto;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Client extends ModelBase<PromotionsDto>{
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


    public String getLastNameClient(String perez) {
        return lastNameClient;
    }

    public void setLastNameClient(String lastNameClient) {
        this.lastNameClient = lastNameClient;
    }


    public String getEmailClient(String s) {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }


    public String getNumberTelephoneC(String s) {
        return numberTelephoneC;
    }

    public void setNumberTelephoneC(String numberTelephoneC) {
        this.numberTelephoneC = numberTelephoneC;
    }


    public Integer getNitClient(int i) {
        return nitClient;
    }

    public void setNitClient(Integer nitClient) {
        this.nitClient = nitClient;
    }

    public Integer getCiClient(int i) {
        return ciClient;
    }

    public void setCiClient(Integer ciClient) {
        this.ciClient = ciClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (firstNameClient != null ? !firstNameClient.equals(client.firstNameClient) : client.firstNameClient != null)
            return false;
        if (lastNameClient != null ? !lastNameClient.equals(client.lastNameClient) : client.lastNameClient != null)
            return false;
        if (emailClient != null ? !emailClient.equals(client.emailClient) : client.emailClient != null) return false;
        if (numberTelephoneC != null ? !numberTelephoneC.equals(client.numberTelephoneC) : client.numberTelephoneC != null)
            return false;
        if (nitClient != null ? !nitClient.equals(client.nitClient) : client.nitClient != null) return false;
        if (ciClient != null ? !ciClient.equals(client.ciClient) : client.ciClient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstNameClient != null ? firstNameClient.hashCode() : 0;
        result = 31 * result + (lastNameClient != null ? lastNameClient.hashCode() : 0);
        result = 31 * result + (emailClient != null ? emailClient.hashCode() : 0);
        result = 31 * result + (numberTelephoneC != null ? numberTelephoneC.hashCode() : 0);
        result = 31 * result + (nitClient != null ? nitClient.hashCode() : 0);
        result = 31 * result + (ciClient != null ? ciClient.hashCode() : 0);
        return result;
    }
}
