package com.example.demodbapi.entity;

public class Speciality1 {
    private String specId;
    private String specName;
    private String specNotes;

    public Speciality1(String specId, String specName, String specNotes) {
        this.setSpecId(specId);
        this.setSpecName(specName);
        this.setSpecNotes(specNotes);
    }

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getSpecNotes() {
        return specNotes;
    }

    public void setSpecNotes(String specNotes) {
        this.specNotes = specNotes;
    }



}
