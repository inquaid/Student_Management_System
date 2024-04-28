package Database;

import java.io.*;
import java.util.Objects;

public class Student extends Item implements Serializable, Comparable {

    private String address;
    private Double cgpa;

    public Student(String Name, String address, int cgpa_cnt, double tracks) {
        super(Name, cgpa_cnt);
        this.address = address;
        cgpa = tracks;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    public String getAddress() {
        return address;
    }

    public Double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return new StringBuffer("")
                .append(this.name)
                .append(this.ID)
                .append(this.address)
                .append(this.cgpa).toString();
    }
}
