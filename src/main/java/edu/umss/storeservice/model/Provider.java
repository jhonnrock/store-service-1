package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ProviderDto;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "ListProvider",
                procedureName = "ListProvider",
                resultClasses = Provider.class
        ),
        @NamedStoredProcedureQuery(
                name = "DeleteProviderById",
                procedureName = "DeleteProviderById",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "id", type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "result", type = Boolean.class)
                }
        ),
        @NamedStoredProcedureQuery(
                name = "GetProviderById",
                procedureName = "GetProviderById",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "id", type = Long.class)
                },
                resultClasses = Provider.class
        ),
        @NamedStoredProcedureQuery(
                name="SaveProvider",
                procedureName="SaveProvider",
                parameters = {
                        @StoredProcedureParameter(mode=ParameterMode.IN,name="id",type=Long.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN,name="firstName",type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN,name="lastName",type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN,name="corporateName",type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN,name="nitProvee",type=Integer.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN,name="ciProvee",type=Integer.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN,name="birthDate",type=Timestamp.class)
                }
        )
})
public class Provider extends ModelBase<ProviderDto> {
    private String firstName;
    private String lastName;
    private String corporateName;
    private Integer nitProvee;
    private Integer ciProvee;
    private Timestamp birthDate;
    @ManyToOne(optional = false)
    private Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

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
