package Database;

import java.io.*;
import java.util.Objects;

public class Item implements Serializable, Comparable {

    protected String name;
    protected int ID;

    public Item(String Nameee, int IDe) {
        name = Nameee;
        this.ID = IDe;
    }

    @Override
    public String toString() {
        return new StringBuffer("")
                .append(this.name)
                .append(this.ID).toString();
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int compareTo(Object o) {
        Item i = (Item) o;
        if (this.ID > i.ID) {
            return 1;
        } else if (this.ID < i.ID) {
            return -1;
        } else {
            return this.name.compareTo(i.name);
        }
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }

}
