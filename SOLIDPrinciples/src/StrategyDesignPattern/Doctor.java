package StrategyDesignPattern;

public class Doctor extends Employee {
    public Doctor(int id, String name, String dep) {
        super(id, name, dep);
        System.out.println("doctor in action");
    }

    @Override
    void doTheTask() {
       System.out.println("inside doctor doTheTask");
        prescMed();
        surgery();
    }

    // task performed by doctor
    void prescMed() {
        System.out.println("doctor prescribing med");
    }

    void surgery() {
        System.out.println("doctor in surgery");
    }
}
