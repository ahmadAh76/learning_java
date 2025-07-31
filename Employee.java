public class Employee {
    private String name;
    private float salary;

    public Employee(String name,float salary){
        this.name=name;
        this.salary=salary;
    }

    public float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }
}
