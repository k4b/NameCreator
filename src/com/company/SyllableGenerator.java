package com.company;

import java.util.HashMap;
import java.util.Map;

public class SyllableGenerator {

    private Map<String, Syllable> syllables;

    public SyllableGenerator() {
        syllables = new HashMap<String, Syllable>();
        syllables = generateSyllables(Syllable.Type.CV, 100);
        //printSyllables(syllables);
    }

    public Map<String, Syllable> generateSyllables(Syllable.Type type, int number) {
        Map<String, Syllable> syllables = new HashMap<String, Syllable>();
        switch (type) {
            case V:
                if(number > Vovels.vovels.length) {
                    number = Vovels.vovels.length;
                }
                for(int i = 0; i < number; i++) {
                    String value = String.valueOf(Vovels.vovels[i]);
                    Syllable syllable = new Syllable(value, Syllable.Type.V);
                    syllables.put(value, syllable);
                }
                break;
            case CV:
                for(int v = 0; v < Vovels.vovels.length; v++) {
                    for (int c = 0; c < Consonants.consonants.length; c++) {
                        String value = String.valueOf(Consonants.consonants[c]) + String.valueOf(Vovels.vovels[v]);
                        Syllable syllable = new Syllable(value, Syllable.Type.CV);
                        syllables.put(value, syllable);
                    }
                }
        }
        return syllables;
    }

    public void printSyllables(Map<String, Syllable> syllables) {
        for(Map.Entry<String, Syllable> entry : syllables.entrySet()) {
            Syllable syllable = entry.getValue();
            System.out.println(syllable.getValue() + " " + syllable.getLength() + " " + syllable.getType());
        }
    }

    public Map<String, Syllable> getSyllables() {
        return syllables;
    }
}
