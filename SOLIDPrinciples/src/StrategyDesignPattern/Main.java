package StrategyDesignPattern;

import StrategyDesignPattern.Doctor;
import StrategyDesignPattern.HospitalManagement;

public class Main {
    public static void main(String[] args) {
        HospitalManagement h=new HospitalManagement();
        Employee nurse=new Nurse(1,"peggy","pathology");
        Employee doctor=new Doctor(2,"john","surgeon");
        h.performTask(nurse);
        h.performTask(doctor);

    }
}
