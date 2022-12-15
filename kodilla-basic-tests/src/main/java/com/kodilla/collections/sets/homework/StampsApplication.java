package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("3286 - portret Władysława Laskonogiego", "43 mm x 31,25 mm","Tak"));
        stamps.add(new Stamp("3287 - portret Henryka Brodatego", "43 mm x 31,25 mm", "Nie"));
        stamps.add(new Stamp("3288 - portret Konrada I Mazowieckiego", "39,5 mm x 31,25mm", "Nie"));
        stamps.add(new Stamp("3286 - portret Władysława Laskonogiego", "43 mm x 31,25 mm","Tak"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
        }
    }


