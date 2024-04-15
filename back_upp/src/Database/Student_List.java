/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.util.*;
import java.io.*;
/**
 *
 * @author CSE
 */
public class Student_List implements Serializable {
     ArrayList<Student> sList;

    public Student_List() {
        this.sList = new ArrayList();
    }
    public void addCD(Student i){
            sList.add(i);
    }
    public void deleteCD(int index){
     sList.remove(index);
    }
    public void updateCD(int index, Student i){
     sList.set(index,i);
    }
    
    public Student get(int index){
     return sList.get(index);
    }
    public int getIndex(Student c){
     return sList.indexOf(c);
    }
    public boolean Contains(Student i){
     return sList.contains(i);
    }
    public int num_CDs(){
     return sList.size();
    }
    
    public void Sort(){
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
