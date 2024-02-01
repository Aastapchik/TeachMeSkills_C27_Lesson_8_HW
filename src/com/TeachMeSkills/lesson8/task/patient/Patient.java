package com.TeachMeSkills.lesson8.task.patient;
/*
The class contains data about the clinic patient
 */
public class Patient {

    public int treatmentPlanCode;
    public String doctor;

    public Patient(int treatmentPlanCode, String doctor)
    {
        this.treatmentPlanCode = treatmentPlanCode;
        this.doctor = doctor;
    }

}
