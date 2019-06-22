package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.User;

public class UsersDto extends DtoBase<User> {
    private String Account_user;
    private byte[] Password_User;
    private byte[] RePassword_User;
    private String Security_Quest1;
    private String Security_Quest2;

    public byte[] getPassword_User() {
        return Password_User;
    }

    public void setPassword_User(byte[] password_User) {
        Password_User = password_User;
    }

    public byte[] getRePassword_User() {
        return RePassword_User;
    }

    public void setRePassword_User(byte[] rePassword_User) {
        RePassword_User = rePassword_User;
    }

    public String getAccount_user() {
        return Account_user;
    }

    public void setAccount_user(String account_user) {
        Account_user = account_user;
    }

    public String getSecurity_Quest1() {
        return Security_Quest1;
    }

    public void setSecurity_Quest1(String security_Quest1) {
        Security_Quest1 = security_Quest1;
    }

    public String getSecurity_Quest2() {
        return Security_Quest2;
    }

    public void setSecurity_Quest2(String security_Quest2) {
        Security_Quest2 = security_Quest2;
    }
}
