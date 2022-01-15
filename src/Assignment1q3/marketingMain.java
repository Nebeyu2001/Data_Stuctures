package Assignment1q3;

import java.util.ArrayList;
import java.util.List;

public class marketingMain {

    private List<Marketing> list;
    private int size;

    public marketingMain() {
        this.list = new ArrayList<>();;
    }

    public void add( Marketing name){
        list.add(name);
    }

    public void remove(int index){
        list.remove(index);
    }

    public Marketing set(int index, Marketing newItem){
        return list.set(index,newItem);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public int size(){
        size=list.size();
        return size;
    }

    public double saleAmount(){
        double sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i).getSalesAmount();
        }
        return sum;
    }

    public List<Marketing> getList() {
        return list;
    }
    public void clear(List<Marketing>list){
        list.clear();
        System.out.println("The list is cleared");
    }

    public static void main (String [] args){

        marketingMain mMobj = new marketingMain();
        mMobj.add(new Marketing("abe","shoe",1000));
        mMobj.add(new Marketing("abu","close",5000));

        System.out.println(mMobj);

        System.out.println("========");
        mMobj.set(1,new Marketing("neb","puma",500));
        System.out.println(mMobj);

        System.out.println("=======");
        mMobj.remove(1);
        System.out.println(mMobj);
        System.out.println("========");
        System.out.println(mMobj.size());
        System.out.println("========");
        System.out.println(mMobj.saleAmount());

        System.out.println("======");
        System.out.println(mMobj.getList());
        mMobj.clear(mMobj.list);
    }
}
