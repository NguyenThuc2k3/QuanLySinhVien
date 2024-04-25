package org.example.model;

public class Student {
    private int msv;
    private String name;

    public Student(int msv, String name) {
        this.msv = msv;
        this.name = name;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
