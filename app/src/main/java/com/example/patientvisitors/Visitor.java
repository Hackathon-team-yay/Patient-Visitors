package com.example.patientvisitors;

import java.sql.Time;

public class Visitor extends User{
    private String visitorName;
    private String visitorPhone;
    private String visitorEmail;
    private String relationToPatient;
    private Time timeIn;
    private Time timeOut;
    private boolean approval;


    public Visitor(String name, String email, String phone, String birthday, String address) {
        super(name, email, phone, birthday, address);
        this.visitorName = name;
        this.visitorPhone = phone;
        this.visitorEmail = email;
    }
}
