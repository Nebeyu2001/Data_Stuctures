package Assignment1;

public class StudentArray {

    private Student[]a;
    private int nElems;


    public StudentArray(int max){
        nElems = max;
    }

    public Student find(int id){
        for (int i=0;i<nElems;i++) {
            if(a[i]!=null && a[i].getId()==id)
                return a[i];
        }

        return null;

    }

    public void insert(int id, String name, int mark) {

        for(int i = 0; i < nElems; i++){
            if(a[i] != null && a[i].getId() == id)
                throw new IllegalArgumentException();
            if(a[i] == null){
                a[i] = new Student(id,name,mark);
                nElems++;
                break;
            }
        }
    }

    public boolean delete(int id) {
        int index=0;
        int i;
        for (i = 0; i < a.length; i++) {
            if(a[i]!=null && a[i].getId() == id ) {
                index=i;
                break;
            }
        }
        if(i==a.length)
            return false;
        for(int j=index+1;j<a.length;j++){
            a[j-1]=a[j];
        }
        nElems--;
        return  true;
    }

    public void displayAll() {
        for (int i = 0; i < nElems; i++) {
            if (a[i] != null)
                System.out.print("Id: " + a[i].getId() + " " + "Name: " + a[i].getName() + " " + "Mark: " + a[i].getMark() + " \n");
        }
    }

    public static void main(String [] args) {
        StudentArray std1 = new StudentArray(5);
        std1.insert(100,"abebe",89);
        std1.insert(101,"kebede",91);
        std1.insert(102,"chube",95);
        std1.insert(103,"chala",90);
        std1.insert(104,"chebete",80);
        System.out.println("Display all: ");
        std1.displayAll();

    }


}
