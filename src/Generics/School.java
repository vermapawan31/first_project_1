package Generics;

import java.util.ArrayList;

public class School<T> {

    ArrayList<T> ar= new ArrayList<>();
   // ArrayList<Integer> ar1=new ArrayList<>();

    public void addStudent(T value){
        ar.add(value);
    }

    public void removeStudent(T value){
        ar.remove(value);
    }

    @Override
    public String toString() {
        return "School{" +
                "ar=" + ar +
                '}';
    }
        public T get(int index){
            return ar.get(index);
        }

//    public void addStudentRollno(Integer roll){
//        ar1.add(roll);
//    }
//
//    public void removeStudentRollno(Integer roll){
//        ar1.remove(roll);
//    }

}
