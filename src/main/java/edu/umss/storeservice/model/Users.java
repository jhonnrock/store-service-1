package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.UsersDto;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "ListUsers",
                procedureName = "ListUsers",
                resultClasses = Users.class
        ),
        @NamedStoredProcedureQuery(
                name = "DeleteUsersById",
                procedureName = "DeleteUsersById",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "id", type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "result", type = Boolean.class)
                }
        ),
        @NamedStoredProcedureQuery(
                name = "GetUsersById",
                procedureName = "GetUsersById",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "id", type = Long.class)
                },
                resultClasses = Users.class
        ),
        @NamedStoredProcedureQuery(
                name="SaveUsersAll",
                procedureName="SaveUsersAll",
                 parameters = {
                            @StoredProcedureParameter(mode=ParameterMode.IN,name="id",type = Long.class),
                            @StoredProcedureParameter(mode = ParameterMode.IN,name ="accountUser",type=String.class ),
                            @StoredProcedureParameter(mode = ParameterMode.IN,name="passwordUser",type = byte.class),
                            @StoredProcedureParameter(mode = ParameterMode.IN,name="rePasswordUser",type = byte.class),
                            @StoredProcedureParameter(mode=ParameterMode.IN,name="securityQuest1",type =String.class),
                            @StoredProcedureParameter(mode=ParameterMode.IN,name="securityQuest2",type =String.class )
                 }

        )

})


public class Users extends ModelBase<UsersDto> {
    private String accountUser;
    private byte[] passwordUser;
    private byte[] rePasswordUser;
    private String securityQuest1;
    private String securityQuest2;

    @Basic
    @Column(name = "Account_user")
    public String getAccountUser() {
        return accountUser;
    }

    public void setAccountUser(String accountUser) {
        this.accountUser = accountUser;
    }

    @Basic
    @Column(name = "Password_User")
    public byte[] getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(byte[] passwordUser) {
        this.passwordUser = passwordUser;
    }

    @Basic
    @Column(name = "RePassword_User")
    public byte[] getRePasswordUser() {
        return rePasswordUser;
    }

    public void setRePasswordUser(byte[] rePasswordUser) {
        this.rePasswordUser = rePasswordUser;
    }

    @Basic
    @Column(name = "Security_Quest1")
    public String getSecurityQuest1() {
        return securityQuest1;
    }

    public void setSecurityQuest1(String securityQuest1) {
        this.securityQuest1 = securityQuest1;
    }

    @Basic
    @Column(name = "Security_Quest2")
    public String getSecurityQuest2() {
        return securityQuest2;
    }

    public void setSecurityQuest2(String securityQuest2) {
        this.securityQuest2 = securityQuest2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(accountUser, users.accountUser) &&
                Arrays.equals(passwordUser, users.passwordUser) &&
                Arrays.equals(rePasswordUser, users.rePasswordUser) &&
                Objects.equals(securityQuest1, users.securityQuest1) &&
                Objects.equals(securityQuest2, users.securityQuest2);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(accountUser, securityQuest1, securityQuest2);
        result = 31 * result + Arrays.hashCode(passwordUser);
        result = 31 * result + Arrays.hashCode(rePasswordUser);
        return result;
    }
}
