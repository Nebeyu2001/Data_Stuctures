package Assignment6;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1001,"Jon",80));
        studentList.add(new Student(1002,"Bob",90));
        studentList.add(new Student(1004,"Max",85));
        studentList.add(new Student(1005,"JO",95));

        System.out.println(studentList);
        System.out.println("====================");
        Collections.sort(studentList);
        System.out.println(studentList);
        System.out.println("====================");
        studentComparator scoreComp = new studentComparator();
        Collections.sort(studentList,scoreComp);
        System.out.println(studentList);
    }
}
