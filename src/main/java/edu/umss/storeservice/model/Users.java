package edu.umss.storeservice.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Users extends ModelBase {
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
