package Assignment6;

public class Student implements Comparable {

    private int sId;
    private String sName;
    private int score;

    public Student(int sId,String sName,int score) {
        this.sId=sId;
        this.sName=sName;
        this.score=score;
    }
    public int getScore() {
        return this.score=score;
    }
    public String getSName() {
        return this.sName=sName;
    }
    public int getSId() {
        return this.sId=sId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (sId != student.sId) return false;
        if (score != student.score) return false;
        return sName.equals(student.sName);
    }

    @Override
    public int hashCode() {
        int result = sId;
        result = 31 * result + sName.hashCode();
        result = 31 * result + score;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student obj = (Student) o;
        return this.score - obj.score;
    }
}
