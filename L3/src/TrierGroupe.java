import java.util.Comparator;

public class TrierGroupe implements Comparator<Student> {
    public int compare(Student o1, Student o2){
        return o1.groupe - o2.groupe;
    }
}
