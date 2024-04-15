/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author CSE
 */
import java.io.*;
import java.util.Objects;

/**
 *
 * @author CSE
 */
public class Item implements Serializable,Comparable {
    protected String title;
    protected int playingTime;

   public Item(String theTitle, int time) {
        title = theTitle;
        playingTime = time;
    }
     
   @Override
    public String toString() {
        return new StringBuffer("")
        .append(this.title)
        .append(this.playingTime).toString();
    }

    public String getTitle() {
        return title;
    }

    public int getPlayingTime() {
        return playingTime;
    }
    public int compareTo(Object o){
       Item i = (Item)o;
       if(this.playingTime>i.playingTime)
         return 1;
       else if(this.playingTime<i.playingTime)
         return -1;
       else
         return this.title.compareTo(i.title);
   }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (this.playingTime != other.playingTime) {
            return false;
        }
        return true;
    }
   
}
