package com.example.patientvisitors;

public class Patient {
    private String name;
    private String room;
    private String doctor;
    private String nurse;
    private String visitor1;
    private String visitor2;
    private String visitor3;

    public Patient(String name, String room, String doctor, String nurse, String visitor) {
        this.name = name;
        this.room = room;
        this.doctor = doctor;
        this.nurse = nurse;
        this.visitor1 = visitor1;
        this.visitor2 = visitor2;
        this.visitor3 = visitor3;
    }

    public String getName() {
        return name;
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

    public String getVisitorOne() {
        return visitor1;
    }

    public String getVisitorTwo(){
        return visitor2;
    }

    public String getVisitorThree(){
        return visitor3;
    }
}


