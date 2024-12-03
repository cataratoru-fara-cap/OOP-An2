package src;
public abstract class Doctor {
    private static int id;
    private static int idCurrentDoctor = 1;

    public Doctor(String office, String name, double wage) {
        this.office = office;
        this.name = name;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public abstract void treatPatient();
    public abstract void calculateWage();

    public String toString() {
        return "lene mare";
    }
}
