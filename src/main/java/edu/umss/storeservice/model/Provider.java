package edu.umss.storeservice.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Provider {
    private String firstName;
    private String lastName;
    private String corporateName;
    private Integer nitProvee;
    private Integer ciProvee;
    private Timestamp birthDate;

    @Basic
    @Column(name = "First_Name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "Last_Name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "Corporate_Name")
    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    @Basic
    @Column(name = "Nit_provee")
    public Integer getNitProvee() {
        return nitProvee;
    }

    public void setNitProvee(Integer nitProvee) {
        this.nitProvee = nitProvee;
    }

    @Basic
    @Column(name = "Ci_provee")
    public Integer getCiProvee() {
        return ciProvee;
    }

    public void setCiProvee(Integer ciProvee) {
        this.ciProvee = ciProvee;
    }

    @Basic
    @Column(name = "Birth_date")
    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provider provider = (Provider) o;
        return Objects.equals(firstName, provider.firstName) &&
                Objects.equals(lastName, provider.lastName) &&
                Objects.equals(corporateName, provider.corporateName) &&
                Objects.equals(nitProvee, provider.nitProvee) &&
                Objects.equals(ciProvee, provider.ciProvee) &&
                Objects.equals(birthDate, provider.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, corporateName, nitProvee, ciProvee, birthDate);
    }
}
