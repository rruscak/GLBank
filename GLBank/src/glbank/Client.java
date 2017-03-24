/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glbank;

import java.util.Date;

/**
 *
 * @author Solanid
 */
public class Client {
    private int idemp;
    private String firstname;
    private String lastname;
    private String email;
    private String street;
    private int housenumber;
    private String city;
    private String postcode;
    private String username;
    private Date dob;
    private boolean disable;
    private boolean blocked;

    public Client(int idemp, String firstname, String lastname, String email, String street, int housenumber, String city, String postcode, String username, Date dob, boolean disable, boolean blocked) {
        this.idemp = idemp;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.street = street;
        this.housenumber = housenumber;
        this.city = city;
        this.postcode = postcode;
        this.username = username;
        this.dob = dob;
        this.disable = disable;
        this.blocked = blocked;
    }

    public Client(int idemp, String firstname, String lastname, Date dob) {
        this.idemp = idemp;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.email=this.street=this.postcode=this.username=this.city=null;
        this.housenumber=0;
        this.disable=this.blocked=false;
    }

    public String getCity() {
        return city;
    }
    
    public int getIdemp() {
        return idemp;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getStreet() {
        return street;
    }

    public int getHousenumber() {
        return housenumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getUsername() {
        return username;
    }

    public Date getDob() {
        return dob;
    }

    public boolean isDisable() {
        return disable;
    }

    public boolean isBlocked() {
        return blocked;
    }

    
    
}
