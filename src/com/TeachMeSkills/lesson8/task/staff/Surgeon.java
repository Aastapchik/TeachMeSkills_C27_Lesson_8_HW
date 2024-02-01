package com.TeachMeSkills.lesson8.task.staff;

import com.TeachMeSkills.lesson8.task.ITreatment;
import com.TeachMeSkills.lesson8.task.patient.Patient;
/*
Class creates a surgeon clinic
 */
public class Surgeon implements ITreatment {


    @Override
    public void health() {

        System.out.println("Лечение у хирурга");

    }
}
