package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Provider;

import java.sql.Timestamp;

public class ProviderDto extends DtoBase<Provider> {


    private String firstName;
    private String lastName;
    private String corporateName;
    private Integer nitProvee;
    private Integer ciProvee;
    private Timestamp birthDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public Integer getNitProvee() {
        return nitProvee;
    }

    public void setNitProvee(Integer nitProvee) {
        this.nitProvee = nitProvee;
    }

    public Integer getCiProvee() {
        return ciProvee;
    }

    public void setCiProvee(Integer ciProvee) {
        this.ciProvee = ciProvee;
    }

    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }
}
