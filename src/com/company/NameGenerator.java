package com.company;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class NameGenerator {

    private Map<String,Syllable> syllables;
    private ArrayList<String> names;

    public NameGenerator (Map<String,Syllable> syllables) {
        this.syllables = syllables;
        names = new ArrayList<String>();
        generateNames(3);
        //printNames();
    }

    public void generateNames(int length) {
        names = new ArrayList<String>(syllables.keySet());
        ArrayList<String> generatedNames = new ArrayList<String>();
        int number = 1;
        for(int l = 0; l < length-1; l++) {
            /*if(names.isEmpty()) {
                generatedNames = new ArrayList<String>(syllables.keySet());
                names.addAll(generatedNames);
            }*/
            for(int n = 0; n < names.size(); n++) {
                for(Map.Entry<String, Syllable> entry : syllables.entrySet()) {
                    String name = names.get(n);
                    name += entry.getValue().getValue();
                    generatedNames.add(name);
                    System.out.println(number + ": " + name);
                    number++;
                }
            }
            names.clear();
            names.addAll(generatedNames);
            generatedNames.clear();
        }
    }

    public void printNames() {
        names.forEach( name -> {
            System.out.println(name);
        });
    }


}
