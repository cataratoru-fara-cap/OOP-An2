public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    public String toString() {
        return "Teacher's name: " + name + " Salary earned so far $" + salary;
    }

}
