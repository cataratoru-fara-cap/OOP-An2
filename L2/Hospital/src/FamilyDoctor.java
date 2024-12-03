package src;
public class FamilyDoctor extends Doctor{
    public FamilyDoctor(String office, String mame, double wage){
        super(office, name, wage);
    }

    @Override
    public void treatPatient() {
        System.out.println("Family doctor is busy");
    }

    @Override
    public void calculateWage() {
        setBonus(1.2);
        this.wage *= this.bonus;
    }

}
