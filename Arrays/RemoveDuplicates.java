package ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();
        names.add("Matt");
        names.add("John");
        names.add("Fiona");
        names.add("Lizza");
        names.add("Matt");
        names.add("Fiona");

        System.out.println(names);

        ArrayList<String>nonDup = new ArrayList<>();

        for(String each : names) {
            if (nonDup.contains(each)) {
                continue;
            }
            nonDup.add(each);
        }
        names=nonDup;

        System.out.println(names);
        System.out.println(nonDup);
            }
        }


