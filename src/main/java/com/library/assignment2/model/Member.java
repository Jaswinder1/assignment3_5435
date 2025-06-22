package com.library.assignment2.model;

import org.springframework.data.annotation.Id;

public class Member {
	
    private String expiry_date;
    private String name;
    private String address;
    private String memb_type;
    private String memb_date;
    @Id
    private int memb_id;

    public Member() {}

    public Member(String expiry_date, String name, String address, 
                  String memb_type, String memb_date, int memb_id) {
        this.expiry_date = expiry_date;
        this.name = name;
        this.address = address;
        this.memb_type = memb_type;
        this.memb_date = memb_date;
        this.memb_id = memb_id;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
  
    public void setAddress(String address) {
        this.address = address;
    }

    public String getMemb_type() {
        return memb_type;
    }

    public void setMemb_type(String memb_type) {
        this.memb_type = memb_type;
    }

    public String getMemb_date() {
        return memb_date;
    }

    public void setMemb_date(String memb_date) {
        this.memb_date = memb_date;
    }

    public int getMemb_id() {
        return memb_id;
    }

    public void setMemb_id(int memb_id) {
        this.memb_id = memb_id;
    }

    @Override
    public String toString() {
        return "Member [memb_id=" + memb_id + ", name='" + name + "', address='" + address 
                + "', memb_type='" + memb_type + "', memb_date='" + memb_date 
                + "', expiry_date='" + expiry_date + "']";
    }
}
