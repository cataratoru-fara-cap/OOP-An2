package src;
public class Surgeon extends Doctor{
    public Surgeon(String office, String mame, double wage) {
        super(office, name, wage);
    }

    @Override
    public void treatPatient() {
        System.out.println("suregeon is busy");
    }

    @Override
    public void calculateWage() {
        setBonus(1.5);
        this.wage *= this.bonus;
    }
}
