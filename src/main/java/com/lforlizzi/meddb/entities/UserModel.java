package com.lforlizzi.meddb.entities;

public class UserModel {
    private int userId;
    private String pseudoName;
    private int age;
    private String dateOfEval;
    private String dateOfDischarge;
    private String medDxIcd;
    private String txDxIcd;

    public UserModel(int userId, String pseudoName, int age, String dateOfEval, String dateOfDischarge, String medDxIcd, String txDxIcd) {
        setUserId(userId);
        setPseudoName(pseudoName);
        setAge(age);
        setDateOfEval(dateOfEval);
        setDateOfDischarge(dateOfDischarge);
        setMedDxIcd(medDxIcd);
        setTxDxIcd(txDxIcd);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPseudoName() {
        return pseudoName;
    }

    public void setPseudoName(String pseudoName) {
        this.pseudoName = pseudoName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfEval() {
        return dateOfEval;
    }

    public void setDateOfEval(String dateOfEval) {
        this.dateOfEval = dateOfEval;
    }

    public String getDateOfDischarge() {
        return dateOfDischarge;
    }

    public void setDateOfDischarge(String dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }

    public String getMedDxIcd() {
        return medDxIcd;
    }

    public void setMedDxIcd(String medDxIcd) {
        this.medDxIcd = medDxIcd;
    }

    public String getTxDxIcd() {
        return txDxIcd;
    }

    public void setTxDxIcd(String txDxIcd) {
        this.txDxIcd = txDxIcd;
    }

}