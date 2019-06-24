package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Users;

public class UsersDto extends DtoBase<Users> {

    private String accountUser;
    private byte[] passwordUser;
    private byte[] rePasswordUser;
    private String securityQuest1;
    private String securityQuest2;

    public String getAccountUser() {
        return accountUser;
    }

    public void setAccountUser(String accountUser) {
        this.accountUser = accountUser;
    }

    public byte[] getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(byte[] passwordUser) {
        this.passwordUser = passwordUser;
    }

    public byte[] getRePasswordUser() {
        return rePasswordUser;
    }

    public void setRePasswordUser(byte[] rePasswordUser) {
        this.rePasswordUser = rePasswordUser;
    }

    public String getSecurityQuest1() {
        return securityQuest1;
    }

    public void setSecurityQuest1(String securityQuest1) {
        this.securityQuest1 = securityQuest1;
    }

    public String getSecurityQuest2() {
        return securityQuest2;
    }

    public void setSecurityQuest2(String securityQuest2) {
        this.securityQuest2 = securityQuest2;
    }
}
