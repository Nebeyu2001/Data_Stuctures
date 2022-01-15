package Assignment1;

public class Student {

    private int id;
    private String name;
    private int mark;

    public Student(int id,String name,int mark){
        this.id = id;
        this.name = name;
        this.mark = mark;

    }

    public void displayStudent(){
        System.out.println("student id= " + id + "student name = " + name + "Student mark = " + mark);
    }

    public int getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }
}


