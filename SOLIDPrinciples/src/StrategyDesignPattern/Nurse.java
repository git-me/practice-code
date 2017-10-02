package StrategyDesignPattern;

public class Nurse extends Employee {
    public Nurse(int id, String name, String dep) {
    super(id,name,dep);
    System.out.println("nurse in action");
    }

    @Override
    void doTheTask() {
        System.out.println("inside Nurse Do the task");
        checkVitals();
        medicineCheck();
    }

    //Task performed by nurse
    void checkVitals() {
        System.out.println("check9ing vitals..");
    }

    void medicineCheck() {
        System.out.println("med check");
    }

}
