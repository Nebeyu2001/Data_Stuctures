package Assignment6;

import java.util.Comparator;

public class studentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getScore()-o2.getScore();
    }
}
