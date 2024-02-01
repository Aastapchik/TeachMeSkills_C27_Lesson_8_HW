package com.TeachMeSkills.lesson8.task.staff;

import com.TeachMeSkills.lesson8.task.ITreatment;
import com.TeachMeSkills.lesson8.task.patient.Patient;
/*
Class creates a dentist clinic
 */
public class Dentist implements ITreatment {


    @Override
    public void health() {

        System.out.println("Лечение у стоматолога");

    }
}
