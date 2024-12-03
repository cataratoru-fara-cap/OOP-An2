
public class Student {
    public int groupe;
    public double note;
    public String nom;

    public Student(int id, double note, String nom) {
        this.groupe = id;
        this.note = note;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Student{" + "groupe=" + groupe + ", note=" + note + ", nom=" + nom + '}';
    }
}
