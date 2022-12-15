package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampDimensions;
    private String stamped;



    public Stamp(String stampName, String stampDimensions, String stamped) {
        this.stampName = stampName;
        this.stampDimensions = stampDimensions;
        this.stamped = stamped;

    }

    public String getStampName() {
        return stampName;
    }

    public void setStampName(String stampName) {
        this.stampName = stampName;
    }

    public String getStampDimensions() {
        return stampDimensions;
    }

    public void setStampDimensions(String stampDimensions) {
        this.stampDimensions = stampDimensions;
    }

    public String getStamped() {
        return stamped;
    }

    public void setStamped(String stamped) {
        this.stamped = stamped;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stampName, stamp.stampName)
                && Objects.equals(stampDimensions, stamp.stampDimensions)
                && Objects.equals(stamped, stamp.stamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimensions, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" + "stampName='" + stampName + '\'' + ", stampDimensions='"
                + stampDimensions + '\'' + ", stamped='" + stamped + '\'' + '}';
    }
}

