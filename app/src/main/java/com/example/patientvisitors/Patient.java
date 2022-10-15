package com.example.patientvisitors;

public class Patient extends User {
    private String room;
    private String patientName;
    private String doctor;
    private String nurse;
    private String reasonForHospitalization;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;

    public Patient(String name, String email, String phone, String birthday, String address) {
        super(name, email, phone, birthday, address);
        this.patientName = name;
    }


    public String getName() {
        return patientName;
    }

    public String getRoom() {
        return room;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getNurse() {
        return nurse;
    }

    public Visitor getVisitorOne() {
        return visitor1;
    }

    public Visitor getVisitorTwo(){
        return visitor2;
    }

    public Visitor getVisitorThree(){
        return visitor3;
    }
}


