package Assignment10;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;


public class SetExercise<E ,T> {

    public List<E> ListToSet(List<E> list){

        List<E> listNew = new ArrayList<>();
        Set<E> set = new HashSet<>();
        for(int i= 0; i<list.size(); i++){
            set.add(list.get(i));
        }

        Iterator<E> iter = set.iterator();
        while (iter.hasNext()){
            listNew.add(iter.next());
        }
        return listNew;

    }

    public int CountDistinctValues(List<String> list){
        List<String> newList = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(int i=0; i<list.size();i++){
            set.add(list.get(i));
        }
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            newList.add(iter.next());
        }
        return newList.size();

    }

    public Map<E, T> mergeLists(List<E> list1, List<T> list2){
        Map<E, T> map = new TreeMap<>();
        int size = (list1.size() < list2.size()) ? list1.size(): list2.size();
        for (int i = 0; i < size; i++){
            map.put(list1.get(i), list2.get(i));
        }
        return map;
    }

    public Map<E, T> mapOfCourses(List<Course> list){
        List<E> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            list1.add((E)list.get(i).getcID());
        }
        Map<E, T>   map = mergeLists(list1, (List<T>) list);
        return map;
    }

    public static void main(String[] args) {
        SetExercise <String, Integer> set = new SetExercise<>();
        Map<String, Integer> map = new HashMap<>();
        List<String> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        listA.add("Dean");
        listA.add("Dave");
        listA.add("Zaineh");
        listA.add("Dave");

        listB.add(90);
        listB.add(80);
        listB.add(75);

        System.out.println(listA);
        System.out.println(listB);

        //Q1

        System.out.println(set.ListToSet(listA));

        //Q2

        System.out.println(set.CountDistinctValues(listA));

        // Q3

        map = set.mergeLists(listA,listB);

        System.out.println(" merged in map structure: " + map);

        // Q4

        List<Course> courses = new ArrayList<>();

        Course course1 = new Course("CS221","DS",4);
        Course course2 =  new Course("CS105","PS",4);
        Course course3 = new Course("CS222","DM",4);
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        System.out.println("course map" + set.mapOfCourses(courses));

    }


}
