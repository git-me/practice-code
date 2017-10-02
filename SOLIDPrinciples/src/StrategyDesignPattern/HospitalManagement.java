package StrategyDesignPattern;
//this class is open for extension but closed for modification since it can add more
// hospital staff without hampering old cold and changing them, also unit test coverage needs to implemented for new
//modules only. This design patern is called strategy design patern.
public class HospitalManagement {
    void performTask(Employee emp) {
        emp.doTheTask();
    }
}




