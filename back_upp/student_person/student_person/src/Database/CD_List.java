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
public class CD_List implements Serializable {
     ArrayList<CD> sList;

    public CD_List() {
        this.sList = new ArrayList();
    }
    public void addCD(CD i){
            sList.add(i);
    }
    public void deleteCD(int index){
     sList.remove(index);
    }
    public void updateCD(int index, CD i){
     sList.set(index,i);
    }
    
    public CD get(int index){
     return sList.get(index);
    }
    public int getIndex(CD c){
     return sList.indexOf(c);
    }
    public boolean Contains(CD i){
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
        for (CD i : sList) {
            sb.append(i);
        }
      return sb.toString();
    }

    public ArrayList<CD> getsList() {
        return sList;
    }
    public boolean isEmpty() {
        return sList.isEmpty();
    }

}
