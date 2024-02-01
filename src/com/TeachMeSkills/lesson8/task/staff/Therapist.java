package com.TeachMeSkills.lesson8.task.staff;

import com.TeachMeSkills.lesson8.task.ITreatment;
import com.TeachMeSkills.lesson8.task.patient.Patient;
/*
Class creates a therapist clinic
 */
public class Therapist implements ITreatment {

    @Override
    public void health() {

        System.out.println("Пациент лечится у терапевта");

    }

    public static ITreatment purpose(Patient patient) {
        if (patient.treatmentPlanCode == 1) {
            return new Surgeon();
        } else if (patient.treatmentPlanCode == 2) {
            return new Dentist();
        }
        else return new Therapist();


    }


}

