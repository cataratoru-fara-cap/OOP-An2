
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1212, 9.7, "Mike"));
        list.add(new Student(1210, 7.7, "Jane"));
        list.add(new Student(1211, 9.8, "Kim"));
        
        
        Collections.sort(list, new TrierNom());
        list.sort(new TrierNom());
        for (Student s : list) {
            System.out.println(s.nom);
        }
       
        System.out.println("-----");
        
        list.sort(new TrierNote());
        for (Student s : list) {
            System.out.println(s.nom + " " + s.note);
        }
        
        System.out.println("-----");
        list.sort(new TrierGroupe());
        for (Student s : list) {
            System.out.println(s.nom + " " + s.groupe);
        }

        try (FileWriter fw = new FileWriter("output.txt")) {
            BufferedWriter out = new BufferedWriter(fw);
            for (Student s : list) {
                try {
                    out.write(s.toString());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                try {
                    out.newLine();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            try {
                out.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
