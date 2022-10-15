package com.example.patientvisitors;

import java.sql.Time;

public class Visitor extends User{
    private String visitorName;
    private String visitorPhone;
    private String relationToPatient;
    private Time timeIn;
    private Time timeOut;
    private boolean approval;

    public Visitor(String patientName, String room, String doctor, String nurse, Visitor visitor1, Visitor visitor2, Visitor visitor3) {
        super(patientName, room, doctor, nurse, visitor1, visitor2, visitor3);
    }

}
