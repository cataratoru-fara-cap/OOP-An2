import java.util.Comparator;
public class TrierNote implements Comparator<Student>{
    public int compare(Student o1, Student o2){
        if(o1.note > o2.note)
            return 1;
        else if(o1.note < o2.note)
            return -1;
        return 0;
    }

}
