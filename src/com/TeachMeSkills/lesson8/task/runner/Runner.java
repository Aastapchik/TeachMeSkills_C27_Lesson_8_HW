package com.TeachMeSkills.lesson8.task.runner;

import com.TeachMeSkills.lesson8.task.ITreatment;
import com.TeachMeSkills.lesson8.task.patient.Patient;

import com.TeachMeSkills.lesson8.task.staff.Therapist;
/*
The class simulates the use of a program
 */
public class Runner {
    public static void main(String[] args) {

        Patient patient1 = new Patient(1, "Alex");
        Patient patient2 = new Patient(2, "Oleg");
        Patient patient3 = new Patient(3, "Vyacheslav");
        ITreatment treatment1 = Therapist.purpose(patient1);
        treatment1.health();
        ITreatment treatment2 = Therapist.purpose(patient2);
        treatment2.health();
        ITreatment treatment3 = Therapist.purpose(patient3);
        treatment3.health();

    }
}
