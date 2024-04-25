package Database;

import java.util.*;
import java.io.*;

public class Student_List implements Serializable {

    ArrayList<Student> sList;

    public Student_List() {
        this.sList = new ArrayList();
    }

    public void addSTUDENT(Student i) {
        sList.add(i);
    }

    public void deleteSTUDENT(int index) {
        sList.remove(index);
    }

    public void updateSTUDENT(int index, Student i) {
        sList.set(index, i);
    }

    public Student get(int index) {
        return sList.get(index);
    }

    public int getIndex(Student c) {
        return sList.indexOf(c);
    }

    public boolean Contains(Student i) {
        return sList.contains(i);
    }

    public int num_STUDENTS() {
        return sList.size();
    }

    public void Sort() {
        Collections.sort(sList);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("");
        for (Student i : sList) {
            sb.append(i);
        }
        return sb.toString();
    }

    public ArrayList<Student> getsList() {
        return sList;
    }

    public boolean isEmpty() {
        return sList.isEmpty();
    }

}
