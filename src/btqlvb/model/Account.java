
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btqlvb.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author manhh
 */
public class Account implements Serializable{
    private String email;
    private String passWord;
    private String phoneNumber;

    public Account() {
    }

    public Account(String email, String passWord, String phoneNumber) {
        this.email = email;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.email);
        hash = 37 * hash + Objects.hashCode(this.passWord);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.passWord, other.passWord)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Account{" + "email=" + email + ", passWord=" + passWord + ", phoneNumber=" + phoneNumber + '}';
    }
    
    
    
}
