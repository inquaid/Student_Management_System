/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.io.*;
import java.util.Objects;
/**
 *
 * @author CSE
 */
public class CD extends Item implements Serializable,Comparable{
    private String artist;
    private int numberOfTracks;

   public CD(String theTitle, String theArtist, int tracks, int time)  {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CD other = (CD) obj;
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        if (!this.title.equals(other.title)) {
            return false;
        }
        return true;
    }

   public String getArtist() {
        return artist;
    }

   public int getNumberOfTracks() {
        return numberOfTracks;
    }
   
   @Override
    public String toString() {
        return new StringBuffer("")
        .append(this.title)
        .append(this.playingTime)
        .append(this.artist)
        .append(this.numberOfTracks).toString();
    }
}
