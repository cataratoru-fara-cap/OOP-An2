import java.util.Comparator;
public class TrierNom implements Comparator<Student> {
    public int compare(Student o1, Student o2){
        return o1.nom.compareTo(o2.nom);
    }
}
