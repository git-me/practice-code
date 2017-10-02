package StrategyDesignPattern;

public abstract class Employee {
    int id;
    String name;
    String dep;

    public Employee(int id, String name, String dep) {
        this.dep=dep;
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dep='" + dep + '\'' +
                '}';
    }

     abstract void doTheTask();
}
