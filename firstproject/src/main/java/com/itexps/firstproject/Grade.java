/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.firstproject;

/**
 *
 * @author gbaka
 */
public class Grade {
    private String name;
    private int eng;
    private int sos;
    private int guj;

    public Grade(String name, int eng, int sos, int guj) {
        this.name = name;
        this.eng = eng;
        this.sos = sos;
        this.guj = guj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getSos() {
        return sos;
    }

    public void setSos(int sos) {
        this.sos = sos;
    }

    public int getGuj() {
        return guj;
    }

    public void setGuj(int guj) {
        this.guj = guj;
    }

    @Override
    public String toString() {
        return "Grade{" + "name=" + name + ", eng=" + eng + ", sos=" + sos + ", guj=" + guj + '}';
    }
    
    
    public String getGrade(){
        int total = this.eng + this.sos + this.guj;
        int avg = total / 3;
        if (avg  <55){
            return "Fail";
        } else {
            return "Pass";
        }
    } 
    
    
    
    
}
