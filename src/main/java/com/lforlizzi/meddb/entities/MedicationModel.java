package com.lforlizzi.meddb.entities;

public class MedicationModel {
    private int id;
    private String brandName;
    private boolean hasSevereReaction;

    public MedicationModel(int id, String brandName, boolean hasSevereReaction) {
        setId(id);
        setBrandName(brandName);
        setHasSevereReaction(hasSevereReaction);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean hasReaction() {
        return hasSevereReaction;
    }

    public void setHasSevereReaction(boolean hasSevereReaction) {
        this.hasSevereReaction = hasSevereReaction;
    }

}