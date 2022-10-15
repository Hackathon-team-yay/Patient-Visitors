package com.example.patientvisitors;

public class Patient {
    private String room;
    private String patientName;
    private String doctor;
    private String nurse;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;

    public Patient(String patientName, String room, String doctor, String nurse, Visitor visitor1, Visitor visitor2, Visitor visitor3) {
        this.patientName = patientName;
        this.room = room;
        this.doctor = doctor;
        this.nurse = nurse;
        this.visitor1 = visitor1;
        this.visitor2 = visitor2;
        this.visitor3 = visitor3;
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


