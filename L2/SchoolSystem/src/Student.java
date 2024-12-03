public class Student {
    private int id;
    private String name ;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 0;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
    public int getFeesPaid() {
        return feesPaid;
    }
    public  int getFeesPaidTotal(){
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public String toString() {
        return "Student's name: " + name + " Total fees paid so far $" + feesPaid;
    }
}
