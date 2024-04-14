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
     ArrayList<CD> cList;

    public CD_List() {
        this.cList = new ArrayList();
    }
    public void addCD(CD i){
            cList.add(i);
    }
    public void deleteCD(int index){
     cList.remove(index);
    }
    public void updateCD(int index, CD i){
     cList.set(index,i);
    }
    
    public CD get(int index){
     return cList.get(index);
    }
    public int getIndex(CD c){
     return cList.indexOf(c);
    }
    public boolean Contains(CD i){
     return cList.contains(i);
    }
    public int num_CDs(){
     return cList.size();
    }
    
    public void Sort(){
        Collections.sort(cList);
    }
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("");
        for (CD i : cList) {
            sb.append(i);
        }
      return sb.toString();
    }

    public ArrayList<CD> getcList() {
        return cList;
    }
    public boolean isEmpty() {
        return cList.isEmpty();
    }

}
